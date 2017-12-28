package com.etudiant.di;

import java.util.*;

public class ServiceFormation {
	private ReferentielOrganismesFormation organismes = new ReferentielOrganismesFormation();
	
	
	// Méthode de recherche d'une formation ayant un nom, durée et prix données
	public List<OrganismeFormation> trouver(String formation, Integer duree, Float prix) {
		
		// Trouver d'abord les organimes qui assurent des formations ayant
		// la durée et le prix donnée
		List<OrganismeFormation> organismeSelectionnees = organismes.trouver(duree, prix);
		
		List<OrganismeFormation> listeResultat = new ArrayList<OrganismeFormation>();
	
		// Chercher dans cette 1ere liste la formation ayant le nom donnée
		for( OrganismeFormation organisme : organismeSelectionnees) {
			
			for( Formation f : organisme.getListeFormations()) {
				if( f.getNomFormation().equals(formation) ) {
					listeResultat.add(organisme);
					break;
				}
			}
		}
		
		return listeResultat;
	}
}
