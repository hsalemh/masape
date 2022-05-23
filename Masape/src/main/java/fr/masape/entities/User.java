package fr.masape.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class User {
	@Id @GeneratedValue
	private Long id;
	private String nom;
	private String premon;
	private String email;
	private String adresse;
	/**
	 * Constructeur sans parametres
	 */
	public User() {
		super();		
	}
	/**
	 * Constructeur avec parametres
	 */
	public User(String nom, String premon, String email, String adresse) {
		super();
		this.nom = nom;
		this.premon = premon;
		this.email = email;
		this.adresse = adresse;
	}
	
	/**
	 * Les getters et setters (accesseurs)
	 */
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getPremon() {
		return premon;
	}
	public void setPremon(String premon) {
		this.premon = premon;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getAdresse() {
		return adresse;
	}
	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}
	public Long getId() {
		return id;
	}
	/**
	 * La méthode toString qui permet d'afficher les informations ce cette entité
	 */
	@Override
	public String toString() {
		return "Utilisateur n°[id=" + id + ", nom=" + nom + ", premon=" + premon + ", email=" + email + ", adresse=" + adresse
				+ "]";
	}
	
	
	
}
