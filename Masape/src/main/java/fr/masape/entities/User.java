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
	private String password;
	private String tel;
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
	public User(String nom, String premon, String email, String password, String tel, String adresse) {
		super();
		this.nom = nom;
		this.premon = premon;
		this.email = email;
		this.password = password;
		this.tel = tel;
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
	
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
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
		return "Utilisateur n°[nom=" + nom + ", premon=" + premon + ", email=" + email +", password=\" + password +\", tel = "+tel+", adresse=" + adresse
				+ "]";
	}
	
	
	
}
