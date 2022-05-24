package fr.masape.entities;

import javax.persistence.Entity;

@Entity
public class Produit {
	private Long id_produit;
	private String libele;
	private double prixu;
	
	public Produit() {
		super();
		
	}

	public Produit(String libele, double prixu) {
		super();
		this.libele = libele;
		this.prixu = prixu;
	}

	public String getLibele() {
		return libele;
	}

	public void setLibele(String libele) {
		this.libele = libele;
	}

	public double getPrixu() {
		return prixu;
	}

	public void setPrixu(double prixu) {
		this.prixu = prixu;
	}

	public Long getId_produit() {
		return id_produit;
	}

	@Override
	public String toString() {
		return "Produit [id_produit=" + id_produit + ", libele=" + libele + ", prixu=" + prixu + "]";
	}

	
	

}
