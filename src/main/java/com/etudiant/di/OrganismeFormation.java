package com.etudiant.di;

import java.util.List;

public class OrganismeFormation {
	private String nomOrganisme;
	private List<Formation> listeFormations;

	public OrganismeFormation(String nomOrganisme, List<Formation> listeFormations) {
		super();
		this.nomOrganisme = nomOrganisme;
		this.listeFormations = listeFormations;
	}

	public String getNomOrganisme() {
		return nomOrganisme;
	}

	public void setNomOrganisme(String nomOrganisme) {
		this.nomOrganisme = nomOrganisme;
	}

	public List<Formation> getListeFormations() {
		return listeFormations;
	}

	public void setListeFormations(List<Formation> listeFormations) {
		this.listeFormations = listeFormations;
	}

}
