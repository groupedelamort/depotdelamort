package com.groupe.gestion.compte.metier;

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
	
}
