package fr.masape.entities;

import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Produit {
	@Id @GeneratedValue
	private Long id_produit;
	private String libele;
	private double prixu;
	private double qt;
	public Produit() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Produit(String libele, double prixu, double qt) {
		super();
		this.libele = libele;
		this.prixu = prixu;
		this.qt = qt;
	}
	public Long getId_produit() {
		return id_produit;
	}
	public void setId_produit(Long id_produit) {
		this.id_produit = id_produit;
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
	public double getQt() {
		return qt;
	}
	public void setQt(double qt) {
		this.qt = qt;
	}
	@Override
	public String toString() {
		return "Produit [id_produit=" + id_produit + ", libele=" + libele + ", prixu=" + prixu + "€]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(id_produit, libele, prixu);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Produit other = (Produit) obj;
		return Objects.equals(id_produit, other.id_produit) && Objects.equals(libele, other.libele)
				&& Double.doubleToLongBits(prixu) == Double.doubleToLongBits(other.prixu);
	}
	
}
