package net.codejava;

import java.io.Serializable;

import jakarta.persistence.Column;

//import javax.persistence.Column;
//import javax.persistence.Entity;
//import javax.persistence.GeneratedValue;
//import javax.persistence.GenerationType;
//import javax.persistence.Id;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Etudiant implements Serializable {
	 
	private Integer identifiant;
	private String nom;
	private String prenom;
	
	@Id
	@Column(name="identifiant")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public Integer getIdentifiant() {
		return identifiant;
	}
	public void setIdentifiant(Integer identifiant) {
		this.identifiant = identifiant;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	
	
	

}