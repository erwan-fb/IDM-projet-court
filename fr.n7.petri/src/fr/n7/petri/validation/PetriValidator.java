package fr.n7.petri.validation;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;

import fr.n7.petri.ArcLectureSeule;
import fr.n7.petri.ArcPondere;
import fr.n7.petri.ArcPondereEntrant;
import fr.n7.petri.ArcPondereSortant;
import fr.n7.petri.Composant;
import fr.n7.petri.PetriPackage;
import fr.n7.petri.Place;
import fr.n7.petri.Temps;
import fr.n7.petri.Transition;
import fr.n7.petri.util.PetriSwitch;


/**
 * Réalise la validation d'un EObject issu de SimplePDL (en théorie, d'un process).
 * Cet classe visite le modèle et utilise les caseXXX pour rediriger l'algo vers la
 * bonne méthode.
 * Attention, lorsqu'une classe est un parent il faut aller faire la visite des enfants
 * manuellement (cf. caseProcess typiquement).
 * 
 * La classe Switch exige un paramètre de généricité (et gère une partie de la visite à
 * base de comparaison à null). Ici le paramètre est un booléen mais en réalité on ne
 * s'en sert pas...
 * 
 * @author Guillaume Dupont modifié par Maxence Chédor
 * @version 0.1
 */
public class PetriValidator extends PetriSwitch<Boolean> {
	/**
	 * Expression régulière qui correspond à un identifiant bien formé.
	 */
	private static final String IDENT_REGEX = "^[A-Za-z_][A-Za-z0-9_]*$";
	
	/**
	 * Résultat de la validation (état interne réinitialisé à chaque nouvelle validation).
	 */
	private ValidationResult result = null;
	
	/**
	 * Construire un validateur
	 */
	public PetriValidator() {}
	
	/**
	 * Lancer la validation et compiler les résultats dans un ValidationResult.
	 * Cette méthode se charge de créer un résultat de validation vide puis de
	 *  visiter les process présents dans la ressource.
	 * @param resource resource à valider
	 * @return résultat de validation
	 */
	public ValidationResult validate(Resource resource) {
		this.result = new ValidationResult();
		
		for (EObject object : resource.getContents()) {
			this.doSwitch(object);
		}
		
		return this.result;
	}


	/**
	 * Méthode appelée lorsque l'objet visité est un Process.
	 * Cet méthode amorce aussi la visite des éléments enfants.
	 * @param object élément visité
	 * @return résultat de validation (null ici, ce qui permet de poursuivre la visite
	 * vers les classes parentes, le cas échéant)
	 */
	@Override
	public Boolean caseReseauPetri(fr.n7.petri.ReseauPetri object) {
		// Contraintes sur le nom
		this.result.recordIfFailed(
				object.getNom() != null && object.getNom().matches(IDENT_REGEX), 
				object, 
				"Le nom du process ne respecte pas les conventions Java");
		
		this.result.recordIfFailed(
				object.getComposants().stream()
				.filter(p -> p.eClass().getClassifierID() == PetriPackage.PLACE)
				.allMatch(pe -> !((Place)pe).getNom().equals(object.getNom())), 
				object, 
				"Le nom de la ReseauPetri est le même que celui d'une Place");
		this.result.recordIfFailed(
				object.getComposants().stream()
				.filter(p -> p.eClass().getClassifierID() == PetriPackage.TRANSITION)
				.allMatch(pe -> !((Transition)pe).getNom().equals(object.getNom())), 
				object, 
				"Le nom de la ReseauPetri est le même que celui d'une Transition");
		
		//un seul process ? => oui
		
		// Visite
		for (Composant pe : object.getComposants()) {
			this.doSwitch(pe);
		}
		
		return null;
	}

	/**
	 * Méthode appelée lorsque l'objet visité est un Composant (ou un sous type).
	 * @param object élément visité
	 * @return résultat de validation (null ici, ce qui permet de poursuivre la visite
	 * vers les classes parentes, le cas échéant)
	 */
	@Override
	public Boolean caseComposant(Composant object) {
		return null;
	}
	
	/**
	 * Méthode appelée lorsque l'objet visité est une Place.
	 * @param object élément visité
	 * @return résultat de validation (null ici, ce qui permet de poursuivre la visite
	 * vers les classes parentes, le cas échéant)
	 */
	@Override
	public Boolean casePlace(Place object) {
		// Contraintes sur le nom
		this.result.recordIfFailed(
				object.getNom() != null && object.getNom().matches(IDENT_REGEX), 
				object, 
				"Le nom de la place ne respecte pas les conventions Java");
		//Non Duplication des noms
		
		this.result.recordIfFailed(
				object.getParent().getComposants().stream()
				.filter(p -> p.eClass().getClassifierID() == PetriPackage.PLACE)
				.allMatch(pe -> !((Place)pe).getNom().equals(object.getNom()) || pe.equals(object)), 
				object, 
				"Le nom de la Place est le même qu'une autre Place");
		this.result.recordIfFailed(
				object.getParent().getComposants().stream()
				.filter(p -> p.eClass().getClassifierID() == PetriPackage.TRANSITION)
				.allMatch(pe -> !((Transition)pe).getNom().equals(object.getNom())), 
				object, 
				"Le nom de la Place est le même que celui d'une Transition");
		this.result.recordIfFailed(
				!object.getNom().equals(object.getParent().getNom()), 
				object, 
				"Le nom de la Place est le même que celui du Resaux de Petri");
		// Contraintes sur les jetons
		this.result.recordIfFailed(
				object.getJetons() >=0 , 
				object, 
				"Le nombre de jeton est négatif");
		
		return null;
	}
	
	/**
	 * Méthode appelée lorsque l'objet visité est une WorkDefinition.
	 * @param object élément visité
	 * @return résultat de validation (null ici, ce qui permet de poursuivre la visite
	 * vers les classes parentes, le cas échéant)
	 */
	@Override
	public Boolean caseTransition(Transition object) {
		// Contraintes sur le nom
		this.result.recordIfFailed(
				object.getNom() != null && object.getNom().matches(IDENT_REGEX), 
				object, 
				"Le nom de la transition ne respecte pas les conventions Java.");
		//Non Duplication des noms
		this.result.recordIfFailed(
				object.getParent().getComposants().stream()
				.filter(p -> p.eClass().getClassifierID() == PetriPackage.TRANSITION)
				.allMatch(pe -> !((Transition)pe).getNom().equals(object.getNom()) || pe.equals(object)), 
				object, 
				"Le nom de la Transition est le même qu'une autre Transition");
		this.result.recordIfFailed(
				object.getParent().getComposants().stream()
				.filter(p -> p.eClass().getClassifierID() == PetriPackage.PLACE)
				.allMatch(pe -> !((Place)pe).getNom().equals(object.getNom())), 
				object, 
				"Le nom de la Transition est le même que celui d'une Place");
		this.result.recordIfFailed(
				!object.getNom().equals(object.getParent().getNom()), 
				object, 
				"Le nom de la Transition est le même que celui du Resaux de Petri");
		
		
		// Visite
		if (object.getIntervalleTemps() != null) {
			this.doSwitch(object.getIntervalleTemps());
		}
		return null;
	}
	
	/**
	 * Méthode appelée lorsque l'objet visité est un ArcPondere.
	 * @param object élément visité
	 * @return résultat de validation (null ici, ce qui permet de poursuivre la visite
	 * vers les classes parentes, le cas échéant)
	 */
	@Override
	public Boolean caseArcPondere(ArcPondere object) {
		// Contraintes sur la podération
		this.result.recordIfFailed(
				object.getPonderation() > 0, 
				object, 
				"La pondération de l'arc est négative ou nulle, ce qui est impossible.");
		return null;
	}
	
	/**
	 * Méthode appelée lorsque l'objet visité est un ArcPondereEntrant.
	 * @param object élément visité
	 * @return résultat de validation (null ici, ce qui permet de poursuivre la visite
	 * vers les classes parentes, le cas échéant)
	 */
	@Override
	public Boolean caseArcPondereEntrant(ArcPondereEntrant object) {
		return null;
	}
	
	/**
	 * Méthode appelée lorsque l'objet visité est un ArcPondereSortant.
	 * @param object élément visité
	 * @return résultat de validation (null ici, ce qui permet de poursuivre la visite
	 * vers les classes parentes, le cas échéant)
	 */
	@Override
	public Boolean caseArcPondereSortant(ArcPondereSortant object) {
		return null;
	}
	
	/**
	 * Méthode appelée lorsque l'objet visité est un ArcLectureSeule.
	 * @param object élément visité
	 * @return résultat de validation (null ici, ce qui permet de poursuivre la visite
	 * vers les classes parentes, le cas échéant)
	 */
	@Override
	public Boolean caseArcLectureSeule(ArcLectureSeule object) {
		return null;
	}
	
	/**
	 * Méthode appelée lorsque l'objet visité est un intervalle de Temps.
	 * @param object élément visité
	 * @return résultat de validation (null ici, ce qui permet de poursuivre la visite
	 * vers les classes parentes, le cas échéant)
	 */
	@Override
	public Boolean caseTemps(Temps object) {
		// Contraintes sur le temps minimum
		this.result.recordIfFailed(
				object.getTempsMinimum() >= 0, 
				object, 
				"Le temps minimum est négatif, ce qui est impossible.");
		// Contraintes sur la podération
		this.result.recordIfFailed(
				object.isEstBorne() && object.getTempsMaximum() > 0, 
				object, 
				"Le temps maximum est négatif ou null, ce qui est impossible.");
		this.result.recordIfFailed(
				object.getTempsMaximum() <= 0 && !object.isEstBorne(), 
				object, 
				"Un temps maximum est defini mais le temps est marqué comme non borné");
		return null;
	}
	
	
	/**
	 * Cas par défaut, lorsque l'objet visité ne correspond pas à un des autres cas.
	 * Cette méthode est aussi appelée lorsqu'une méthode renvoie null (comme une sorte de
	 * fallback).
	 * On pourrait implémenter le switch différemment, en ne renvoyant null dans les autres
	 * méthodes que si la contrainte ne sert à rien, et se servir de cette méthode pour
	 * identifier les éléments étrangers (qui de toute façon ne doivent pas exister).
	 * C'est aussi la méthode appelée si on ne redéfini pas un des caseXXX.
	 * @param object objet visité
	 * @return résultat, null ici
	 */
	@Override
	public Boolean defaultCase(EObject object) {
		return null;
	}
	
	
}
