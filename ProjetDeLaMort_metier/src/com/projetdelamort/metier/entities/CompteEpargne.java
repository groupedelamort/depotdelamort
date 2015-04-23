package com.projetdelamort.metier.entities;


import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="CompteEpargne")
@DiscriminatorValue("Compte_Epargne")
public class CompteEpargne extends Compte{

	private double Taux;

	public CompteEpargne(double taux) {
		super();
		Taux = taux;
	}

	public double getTaux() {
		return Taux;
	}

	public void setTaux(double taux) {
		Taux = taux;
	}

	public CompteEpargne() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "CompteEpargne [Taux=" + Taux + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		long temp;
		temp = Double.doubleToLongBits(Taux);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		CompteEpargne other = (CompteEpargne) obj;
		if (Double.doubleToLongBits(Taux) != Double
				.doubleToLongBits(other.Taux))
			return false;
		return true;
	}
	
}
