package com.etudiant.di;

import java.util.List;

public class Main {

	public static void main(String[] args) {

		// Chercher les organismes de formation 
		// Qui assure la formation suivante:
		String formation = "Objective-C";
		Integer prix = 5;
		Float duree = 2500f;
		
		ServiceFormation serviceFormation = new ServiceFormation();
		 
		List<OrganismeFormation> organismes = serviceFormation.trouver(formation, prix, duree);

		System.out.println("La formation " + formation + " (durée: "+duree+", prix: " +prix+") est dispensée par:");
		for( OrganismeFormation o : organismes) {
			System.out.println(" - "+o.getNomOrganisme());
		}
		
	}

}
