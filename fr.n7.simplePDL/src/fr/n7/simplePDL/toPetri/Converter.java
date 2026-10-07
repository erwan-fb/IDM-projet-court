package fr.n7.simplePDL.toPetri;

import java.io.IOException;
import java.util.*;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;

import fr.n7.petri.*;
import fr.n7.petri.PetriFactory;
import fr.n7.simplePDL.*;
import fr.n7.simplePDL.Process;
import fr.n7.simplePDL.Ressource;

public class Converter {

	private static PetriFactory petriMaker = PetriFactory.eINSTANCE;
	// load the URIs for java to recognize
	private static SimplePDLPackage simplePDLPackage = SimplePDLPackage.eINSTANCE;
	private static PetriPackage petriPackage = PetriPackage.eINSTANCE;

	private Map<String, Place> places = new HashMap<String, Place>();
	private Map<String, Transition> transitions = new HashMap<String, Transition>();
	
	private Resource.Factory.Registry reg;
	private Map<String, Object> m;
	
	private String sourceFile;
	private Resource source; 
	private ResourceSet resSetSource;
	private ReseauPetri petri;

	private Place addPlace(String name, int nbJetons) {
		Place place = petriMaker.createPlace();

		place.setNom(name);
		place.setJetons(nbJetons);
		places.put(name, place);
		petri.getComposants().add(place);
		
		return place;
	}
	
	private Place getPlace(String name) {
		return places.get(name);
	}
	
	private Transition addTransition(String name) {
		Transition transition = petriMaker.createTransition();
		
		transition.setNom(name);
		transitions.put(name, transition);
		petri.getComposants().add(transition);
		
		return transition;
	}
	
	private Transition getTransition(String name) {
		return transitions.get(name);
	}
	
	private Transition addTransition(String name, int tempsMin) {
		Transition transition = addTransition(name);
		
		Temps intervalle = petriMaker.createTemps();
		intervalle.setTempsMinimum(tempsMin);
		transition.setIntervalleTemps(intervalle);
		
		return transition;
	}
	
	private Transition addTransition(String name, int tempsMin, int tempsMax) {
		Transition transition = addTransition(name);
		
		Temps intervalle = petriMaker.createTemps();
		intervalle.setTempsMinimum(tempsMin);
		intervalle.setTempsMaximum(tempsMax);
		transition.setIntervalleTemps(intervalle);
		
		return transition;
	}
	
	private ArcPondere addArc(Place source, Transition destination, int ponderation) {
		ArcPondereEntrant arc = petriMaker.createArcPondereEntrant();
		
		arc.setSource(source);
		arc.setDestination(destination);
		arc.setPonderation(ponderation);
		
		petri.getComposants().add(arc);
		
		return arc;
	}
	
	private ArcPondere addArc(Transition source, Place destination, int ponderation) {
		ArcPondereSortant arc = petriMaker.createArcPondereSortant();
		
		arc.setSource(source);
		arc.setDestination(destination);
		arc.setPonderation(ponderation);
		
		petri.getComposants().add(arc);
		
		return arc;
	}
	
	private ArcPondere addArcReadonly(Place source, Transition destination, int ponderation) {
		ArcLectureSeule arc = petriMaker.createArcLectureSeule();
		
		arc.setSource(source);
		arc.setDestination(destination);
		arc.setPonderation(ponderation);
		
		petri.getComposants().add(arc);
		
		return arc;
	}

	
	public void export(String destinationFilename) {
		if (source == null) {
			System.out.println("No source File set, please provide one");
			return;
		}
		System.out.println("Converting " + sourceFile + " to petri ...");
		
		// Création du fichier de destination : petri
		ResourceSet resSetDestination = new ResourceSetImpl();
		URI destURI = URI.createURI(destinationFilename);
		Resource destination = resSetDestination.createResource(destURI);
		
		// Récupérer la racine du simplepdl
		Process process = (Process) source.getContents().get(0);

		// Création du réseau de petri
		petri.setNom(process.getName());

		// Ajouter les process
		for (var processElement : process.getProcessElements()) {
			if (processElement instanceof WorkDefinition workDefinition) {
				String name = workDefinition.getName();
				
				// creation des objets
				Place idle = addPlace(name + "_idle", 1);
				Place started = addPlace(name + "_started", 0);
				Place running = addPlace(name + "_running", 0);
				Place ended = addPlace(name + "_ended", 0);
				
				Transition start = addTransition(name + "_start");
				Transition end = addTransition(name + "_end");
				
				addArc(idle, start, 1);
				addArc(start, started, 1);
				addArc(start, running, 1);
				addArc(running, end, 1);
				addArc(end, ended, 1);
			}
		}

		// Ajouter les transitions
		for (var processElement : process.getProcessElements()) {
			if (processElement instanceof WorkSequence workSequence) {
				// Récupération des noms, du type et si les
				String sourceName = workSequence.getPredecessor().getName();
				String destinationName = workSequence.getSuccessor().getName();
				
				// Création de l'arc associé
				switch (workSequence.getLinkType()) {
				case START_TO_START:
					addArcReadonly(getPlace(sourceName + "_started"), getTransition(destinationName + "_start"), 1);
					break;
				case START_TO_FINISH:
					addArcReadonly(getPlace(sourceName + "_started"), getTransition(destinationName + "_end"), 1);
					break;
				case FINISH_TO_START:
					addArcReadonly(getPlace(sourceName + "_ended"), getTransition(destinationName + "_start"), 1);
					break;
				case FINISH_TO_FINISH:
					addArcReadonly(getPlace(sourceName + "_ended"), getTransition(destinationName + "_end"), 1);
					break;
				}
			}
		}

		// Ajouter les ressources
		for (var processElement : process.getProcessElements()) {
			if (processElement instanceof Ressource ressource) {
				addPlace(ressource.getName(), ressource.getQuantityAvailable());
			}
		}

		// Ajouter les liens des ressoures
		for (var processElement : process.getProcessElements()) {
			if (processElement instanceof RessourceLink ressourceLink) {
				addArc(getPlace(ressourceLink.getRessourceNeeded().getName()), getTransition(ressourceLink.getProcess().getName() + "_start"), ressourceLink.getQuantity());
				addArc(getTransition(ressourceLink.getProcess().getName() + "_end"), getPlace(ressourceLink.getRessourceNeeded().getName()), ressourceLink.getQuantity());
			}
		}

		// Ajouter le réseau de petri fini au fichier
		destination.getContents().add(petri);

		// Sauvegarder le fichier
		try {
			destination.save(Collections.EMPTY_MAP);
		} catch (IOException e) {
			e.printStackTrace();
		}

		System.out.println("Done converting " + sourceFile + " to " + destinationFilename);

	}

	public void setSource(String destinationFilename) {
		sourceFile = destinationFilename;
		
		// Créer un objet resourceSetImpl qui contiendra une ressource EMF (notre modèle)
		resSetSource = new ResourceSetImpl();
		
		// Récupération du premier fichier : simplepdl
		URI sourceURI = URI.createURI(sourceFile);
		source = resSetSource.getResource(sourceURI, true);
		
	}
	
	public Converter() {
		// Enregistrer l'extension ".xmi" comme devant être ouverte à
		// l'aide d'un objet "XMIResourceFactoryImpl"
		reg = Resource.Factory.Registry.INSTANCE;
		m = reg.getExtensionToFactoryMap();
		m.put("simplepdl", new XMIResourceFactoryImpl());
		m.put("petri", new XMIResourceFactoryImpl());
		
		petri = petriMaker.createReseauPetri();
	}

	// arg 1 = fichier xmi pdl source
	// arg 2 = fichier xmi petri destination
	public static void main(String[] args) {
		if (args.length != 2) {
			System.out.println(
					"Convert attend 2 arguments: le fichier xmi source pour le pdl puis le fichier xmi destination pour le petri");
		} else {

			Converter main = new Converter();
			main.setSource(args[0]);
			main.export(args[1]);
			return;
		}

	}
}
