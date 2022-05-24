package fr.masape.entities;

import java.sql.Date;
import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Commande {
	@Id @GeneratedValue
	private Long id_commande;
	private Date date;
	private String adresse_liv;
	public Commande() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Commande [date=" + date + ", adresse_liv=" + adresse_liv + "]";
	}
	public Long getId_commande() {
		return id_commande;
	}
	public void setId_commande(Long id_commande) {
		this.id_commande = id_commande;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public String getAdresse_liv() {
		return adresse_liv;
	}
	public void setAdresse_liv(String adresse_liv) {
		this.adresse_liv = adresse_liv;
	}
	@Override
	public int hashCode() {
		return Objects.hash(adresse_liv, date, id_commande);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Commande other = (Commande) obj;
		return Objects.equals(adresse_liv, other.adresse_liv) && Objects.equals(date, other.date)
				&& Objects.equals(id_commande, other.id_commande);
	}
	
	

}
