package fr.n7.simplePDL.toPetri;

import java.io.IOException;
import java.util.Collections;
import java.util.Map;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;

import fr.n7.petri.*;
import fr.n7.petri.PetriFactory;
import fr.n7.simplePDL.Process;
import fr.n7.simplePDL.SimplePDLPackage;
import fr.n7.simplePDL.WorkDefinition;
import fr.n7.simplePDL.WorkSequence;
import fr.n7.simplePDL.WorkSequenceType;

public class Convert {

	// arg 1 = fichier xmi pdl source
	// arg 2 = fichier xmi petri destination
	public static void main(String[] args) {
		System.out.println("=====================Conversion simplePDL vers Petri=====================");
		if (args.length != 2) {
			System.out.println(
					"Attend 2 arguments: le fichier xmi source pour le pdl puis le fichier xmi destination pour le petri");
		} else {
			// load the URIs for java to recognize
			SimplePDLPackage simplePDLPackage = SimplePDLPackage.eINSTANCE;
			PetriPackage petriPackage = PetriPackage.eINSTANCE;
			
			PetriFactory petriMaker = PetriFactory.eINSTANCE;
			
			// Enregistrer l'extension ".xmi" comme devant être ouverte à
			// l'aide d'un objet "XMIResourceFactoryImpl"
			Resource.Factory.Registry reg = Resource.Factory.Registry.INSTANCE;
			Map<String, Object> m = reg.getExtensionToFactoryMap();
			m.put("simplepdl", new XMIResourceFactoryImpl());
			m.put("petri", new XMIResourceFactoryImpl());
			
			// Créer un objet resourceSetImpl qui contiendra une ressource EMF (notre modèle)
			ResourceSet resSetSource = new ResourceSetImpl();
			

			
			// Récupération du premier fichier : simplepdl
			URI sourceURI = URI.createURI(args[0]);
			Resource source = null;
			source = resSetSource.getResource(sourceURI, true);
			try { // gerer les erreurs si jamais le ficher n'existe pas par exemple (ou fichier mal formé)
				
			} catch (RuntimeException e) {
				System.out.println("An error occured while opening the file " + args[0]);
			}
			
			// Création du fichier de destination : petri
			ResourceSet resSetDestination = new ResourceSetImpl();
			URI destURI = URI.createURI(args[1]);
			Resource destination = resSetDestination.createResource(destURI);
			
			if (source == null) {
				System.out.println("Le fichier source n'existe pas");
				return;
			}
			
			if (destination == null) {
				System.out.println("Le fichier destination a eu un probleme a sa creation");
				return;
			}
			
			
			// Récupérer la racine du simplepdl
			Process process = (Process) source.getContents().get(0);
			
			// Création du réseau de petri
			ReseauPetri petri = petriMaker.createReseauPetri();
			
			petri.setNom(process.getName());
			
			// Ajouter les process
			
			for (var processElement : process.getProcessElements()) {
				if (processElement instanceof WorkDefinition workDefinition) {
					// creation des objets
					Place idlePlace = petriMaker.createPlace();
					Place startedPlace = petriMaker.createPlace();
					Place runningPlace = petriMaker.createPlace();
					Place endedPlace = petriMaker.createPlace();
					
					Transition start = petriMaker.createTransition();
					Transition end = petriMaker.createTransition();
					
					// Mettre les noms au différents éléments
					idlePlace.setNom(workDefinition.getName() + "_idle");
					startedPlace.setNom(workDefinition.getName() + "_started");
					runningPlace.setNom(workDefinition.getName() + "_running");
					endedPlace.setNom(workDefinition.getName() + "_ended");
					
					start.setNom(workDefinition.getName() + "_start");
					end.setNom(workDefinition.getName() + "_end");
					
					// Créer les liens entre les places et les transitions
					ArcPondereEntrant idleToStart = petriMaker.createArcPondereEntrant();
					ArcPondereSortant startToStarted = petriMaker.createArcPondereSortant();
					ArcPondereSortant startToRunning = petriMaker.createArcPondereSortant();
					ArcPondereEntrant runningToEnd = petriMaker.createArcPondereEntrant();
					ArcPondereSortant endToEnded = petriMaker.createArcPondereSortant();
							
					// Assigner les liens et les ponderations
					idleToStart.setSource(idlePlace);
					idleToStart.setDestination(start);
					idleToStart.setPonderation(1);
					
					startToStarted.setSource(start);
					startToStarted.setDestination(startedPlace);
					startToStarted.setPonderation(1);
					
					startToRunning.setSource(start);
					startToRunning.setDestination(runningPlace);
					startToRunning.setPonderation(1);
					
					runningToEnd.setSource(runningPlace);
					runningToEnd.setDestination(end);
					runningToEnd.setPonderation(1);
					
					endToEnded.setSource(end);
					endToEnded.setDestination(endedPlace);
					endToEnded.setPonderation(1);
					
					// Mettre le jeton dans la place idle
					idlePlace.setJetons(1);
					
					// Ajouter tous les éléments créés dans le reseau petri
					petri.getElements().add(idlePlace);
					petri.getElements().add(startedPlace);
					petri.getElements().add(runningPlace);
					petri.getElements().add(endedPlace);
					petri.getElements().add(start);
					petri.getElements().add(end);
					petri.getElements().add(idleToStart);
					petri.getElements().add(startToStarted);
					petri.getElements().add(startToRunning);
					petri.getElements().add(runningToEnd);
					petri.getElements().add(endToEnded);
					
					// ajouter tous les éléments a la ressource
					destination.getContents().add(idlePlace);
					destination.getContents().add(startedPlace);
					destination.getContents().add(runningPlace);
					destination.getContents().add(endedPlace);
					destination.getContents().add(start);
					destination.getContents().add(end);
					destination.getContents().add(idleToStart);
					destination.getContents().add(startToStarted);
					destination.getContents().add(startToRunning);
					destination.getContents().add(runningToEnd);
					destination.getContents().add(endToEnded);
				}
			}
			
			// Ajouter les transitions
			for (var processElement : process.getProcessElements()) {
				if (processElement instanceof WorkSequence workSequence) {
					// Création de l'arc associé
					ArcPondereEntrant arc = petriMaker.createArcPondereEntrant();

					// Récupération des noms, du type et si les 
					String sourceName = workSequence.getPredecessor().getName();
					String destinationName = workSequence.getSuccessor().getName();
					
					
					WorkSequenceType linktype = workSequence.getLinkType();
					
					boolean firstIsStart = (linktype == WorkSequenceType.START_TO_START || linktype == WorkSequenceType.START_TO_FINISH);
					boolean secondIsStart = (linktype == WorkSequenceType.START_TO_START || linktype == WorkSequenceType.FINISH_TO_START);
					
					arc.setPonderation(1);
					
					// Création des liens pour l'arc
					petri.getElements().forEach((elem) -> {
						// Ajout de la source
						if (elem instanceof Place place) {
							if ((firstIsStart && place.getNom().equals(sourceName + "_started")) || (!firstIsStart && place.getNom().equals(sourceName + "_endeded"))) {
								arc.setSource(place);
							}
						}
						
						// Ajout de la destination
						if (elem instanceof Transition transition) {
							if ((secondIsStart && transition.getNom().equals(destinationName + "_start")) || (!secondIsStart && transition.getNom().equals(destinationName + "_end"))) {
								arc.setDestination(transition);
							}
						}
					});
					
					// ajouter au reseau de petri
					petri.getElements().add(arc);
					destination.getContents().add(arc);
					
				}
			}
			
			// Ajout du réseau de petri fini au fichier
			destination.getContents().add(petri);
			
			// Sauvegarder le fichier 
		    try {
		    	destination.save(Collections.EMPTY_MAP);
			} catch (IOException e) {
				e.printStackTrace();
			}
			
			return;
		}

	}
}
