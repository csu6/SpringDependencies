package com.etudiant.di;

public class Formation {
	private String nomFormation;
	private Integer duree;
	private Float prix;

	public Formation(String nomFormation, Integer duree, Float prix) {
		super();
		this.nomFormation = nomFormation;
		this.duree = duree;
		this.prix = prix;
	}

	public String getNomFormation() {
		return nomFormation;
	}

	public void setNomFormation(String nomFormation) {
		this.nomFormation = nomFormation;
	}

	public Integer getDuree() {
		return duree;
	}

	public void setDuree(Integer duree) {
		this.duree = duree;
	}

	public Float getPrix() {
		return prix;
	}

	public void setPrix(Float prix) {
		this.prix = prix;
	}
	
}
