package fr.masape.entities;

import java.sql.Date;
import java.time.LocalDate;
import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import org.springframework.format.annotation.DateTimeFormat;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Entity
@Data
public class Commande {
	@Id
	@GeneratedValue
	@DateTimeFormat
	private Long id_commande;
	private Date date;
	private String adresse_liv;
	@ManyToOne
	private User user;

	public Commande() {
		super();
		// TODO Auto-generated constructor stub
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

	@Override
	public String toString() {
		return "Commande [date=" + date + ", adresse_liv=" + adresse_liv + ", user" + user + "]";
	}

}
