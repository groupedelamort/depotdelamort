package com.projetdelamort.metier.entities;


import java.io.Serializable;

import java.util.Calendar;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorType;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Version;

@Entity
@Table(name = "Compte")
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "Type_Compte", discriminatorType = DiscriminatorType.STRING)
@DiscriminatorValue("Compte")
public class Compte implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "numCompte_ID")
	private long numCompte;

	@ManyToOne(fetch = FetchType.LAZY)
	private Client client;

	@Version
	private int version;

	private Calendar dateCompte;
	private double solde;

	@ManyToMany(mappedBy = "comptes", fetch = FetchType.LAZY)
	private Set<Operation> operations;

	public Set<Operation> getOperations() {
		return operations;
	}

	public void setOperations(Set<Operation> operations) {
		this.operations = operations;
	}

	public long getNumCompte() {
		return numCompte;
	}

	public void setNumCompte(long numCompte) {
		this.numCompte = numCompte;
	}

	public Calendar getDateCompte() {
		return dateCompte;
	}

	public void setDateCompte(Calendar dateCompte) {
		this.dateCompte = dateCompte;
	}

	public double getSolde() {
		return solde;
	}

	public void setSolde(double solde) {
		this.solde = solde;
	}

	public Compte() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getVersion() {
		return version;
	}

	public void setVersion(int version) {
		this.version = version;
	}

	public Client getClient() {
		return client;
	}

	public void setClient(Client client) {
		this.client = client;
	}

	@Override
	public String toString() {
		return "Compte [numCompte=" + numCompte + ", dateCompte=" + dateCompte
				+ ", solde=" + solde + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((dateCompte == null) ? 0 : dateCompte.hashCode());
		result = prime * result + (int) (numCompte ^ (numCompte >>> 32));
		result = prime * result
				+ ((operations == null) ? 0 : operations.hashCode());
		long temp;
		temp = Double.doubleToLongBits(solde);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Compte other = (Compte) obj;
		if (dateCompte == null) {
			if (other.dateCompte != null)
				return false;
		} else if (!dateCompte.equals(other.dateCompte))
			return false;
		if (numCompte != other.numCompte)
			return false;
		if (operations == null) {
			if (other.operations != null)
				return false;
		} else if (!operations.equals(other.operations))
			return false;
		if (Double.doubleToLongBits(solde) != Double
				.doubleToLongBits(other.solde))
			return false;
		return true;
	}

}
