package com.ourteam.pcd.persistance;
// Generated Mar 3, 2018 1:32:26 PM by Hibernate Tools 5.2.6.Final

/**
 * Matiere generated by hbm2java
 */
public class Matiere implements java.io.Serializable {

	private String nom;
	private Integer duree;

	public Matiere() {
	}

	public Matiere(String nom) {
		this.nom = nom;
	}

	public Matiere(String nom, Integer duree) {
		this.nom = nom;
		this.duree = duree;
	}

	public String getNom() {
		return this.nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public Integer getDuree() {
		return this.duree;
	}

	public void setDuree(Integer duree) {
		this.duree = duree;
	}

}
