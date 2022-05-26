package fr.masape.entities;

import java.util.Objects;

public class Contient {
	int quantite;

	public Contient() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Contient(int quantite) {
		super();
		this.quantite = quantite;
	}

	public int getQuantite() {
		return quantite;
	}

	public void setQuantite(int quantite) {
		this.quantite = quantite;
	}

	@Override
	public int hashCode() {
		return Objects.hash(quantite);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Contient other = (Contient) obj;
		return quantite == other.quantite;
	}

	@Override
	public String toString() {
		return "Contient [quantite=" + quantite + "]";
	}
	
}
