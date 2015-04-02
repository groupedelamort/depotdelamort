package com.groupe.gestion.compte.metier;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table (name="CompteCourant")
@DiscriminatorValue("Compte_Courant")
public class CompteCourant extends Compte {

	private double decouvert;

	public double getDecouvert() {
		return decouvert;
	}

	public void setDecouvert(double decouvert) {
		this.decouvert = decouvert;
	}

	public CompteCourant() {
		super();
		// TODO Auto-generated constructor stub
	}

	public CompteCourant(double decouvert) {
		super();
		this.decouvert = decouvert;
	}

	@Override
	public String toString() {
		return "CompteCourant [decouvert=" + decouvert + "]";
	}
	
	
}
