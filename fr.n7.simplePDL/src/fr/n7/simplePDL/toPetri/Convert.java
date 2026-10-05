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
import fr.n7.simplePDL.Process;
import fr.n7.simplePDL.SimplePDLPackage;
import fr.n7.simplePDL.WorkDefinition;

public class Convert {

	// arg 1 = fichier xmi pdl source
	// arg 2 = fichier xmi petri destination
	public static void main(String[] args) {
		if (args.length != 2) {
			System.out.println(
					"Attend 2 arguments: le fichier xmi source pour le pdl puis le fichier xmi destination pour le petri");
			
			// Règlages par défaut pour l'ouverture et l'édition des fichiers xmi
			// Chargement du package SimplePDL afin de l'enregistrer dans le registre d'Eclipse.
			SimplePDLPackage packageInstance = SimplePDLPackage.eINSTANCE;
			
			// Enregistrer l'extension ".xmi" comme devant être ouverte à
			// l'aide d'un objet "XMIResourceFactoryImpl"
			Resource.Factory.Registry reg = Resource.Factory.Registry.INSTANCE;
			Map<String, Object> m = reg.getExtensionToFactoryMap();
			m.put("xmi", new XMIResourceFactoryImpl());
			
			// Créer un objet resourceSetImpl qui contiendra une ressource EMF (notre modèle)
			ResourceSet resSet = new ResourceSetImpl();

			
			// Récupération du premier fichier : simplepdl
			URI sourceURI = URI.createURI("models/SimplePDLCreator_Created_Process.xmi");
			Resource source = null;
			try { // gerer les erreurs si jamais le ficher n'existe pas par exemple (ou fichier mal formé)
				source = resSet.getResource(sourceURI, true);
			} catch (RuntimeException _) {
				System.out.println("An error occured while opening the file " + args[0]);
			}
			
			if (source == null) return;
			
			
			// Création du fichier de destination : petri
			URI destURI = URI.createURI("models/SimplePDLCreator_Created_Process.xmi");
			Resource destination = resSet.createResource(destURI);
			
			
			// Récupérer la racine du simplepdl
			Process process = (Process) source.getContents().get(0);
			
			// Création du réseau de petri
			ReseauPetri petri = new ReseauPetri();
			for (var processElement : process.getProcessElements()) {
				if (processElement instanceof WorkDefinition workDefinition) {
					workDefinition.getName();
				}
			}
			
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
