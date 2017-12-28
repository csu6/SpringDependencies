package com.etudiant.di;

import java.util.*;

public class ReferentielOrganismesFormation {
	private static List<OrganismeFormation> listeOrganismes = new ArrayList<OrganismeFormation>();
	
	// Initialiser le champ static "listeOrganismes"
	// On utilise pour cela le constructeur de la classe
	// Ce constructeur est unique et il n'a pas de nom
	
	static {
		listeOrganismes.add(new OrganismeFormation("CNAM", 
				Arrays.asList(
						new Formation("Applications distribuées", 5, 2500f),
						new Formation("Java", 10, 4500f),
						new Formation("Réseaux et TCP/IP", 3, 2000f),
						new Formation("Bases de données", 4, 3000f)
					)
				));
		listeOrganismes.add(new OrganismeFormation("M2I", 
				Arrays.asList(
						new Formation("Java", 10, 4500f),
						new Formation("Objective-C", 5, 2500f)
					)
				));
		listeOrganismes.add(new OrganismeFormation("Mistra", 
				Arrays.asList(
						new Formation("Objective-C", 5, 2500f),
						new Formation("C#", 5, 3000f)
					)
				));
	}// Fin constructeur class
	
	// Méthode de recherche des organismes de formation
	// Critère de recherche : le prix et la durée
	public List<OrganismeFormation> trouver(Integer duree, Float prix) {
		List<OrganismeFormation> liste = new ArrayList<OrganismeFormation>();
	
		// Je passe par toutes la liste des organimes de formation
		for( OrganismeFormation o : this.listeOrganismes) {
			
			// Je récupère les formations assurées par l'organisme courant
			List<Formation> listeFormations = o.getListeFormations();
			
			// Je passe par la liste des formations de l'organisme courant
			for( Formation f : listeFormations) {
				
				// Si je trouve une formation ayant le prix et la durée
				// données, j'ajoute l'organisme dans la liste
				// de retour et je passe à la liste suivante
				if( f.getDuree().equals(duree) && f.getPrix().equals(prix) ) {
					liste.add(o);
					break;
				}
			}
		}
		
		return liste;
	}
	
} // Fin classe