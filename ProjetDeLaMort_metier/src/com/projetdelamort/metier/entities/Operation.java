package com.projetdelamort.metier.entities;


import java.io.Serializable;
import java.util.Date;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Version;

@Entity
@Table(name = "Operation")
public class Operation implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long numOperation;
	private Date dateOperation;
	private double mtVersement;
	private double mtRetrait;

	@Version
	private int version;

	@ManyToOne(fetch = FetchType.LAZY)
	private Compte compte;

	public long getNumOperation() {
		return numOperation;
	}

	public void setNumOperation(long numOperation) {
		this.numOperation = numOperation;
	}

	public Date getDateOperation() {
		return dateOperation;
	}

	public void setDateOperation(Date dateOperation) {
		this.dateOperation = dateOperation;
	}

	public double getMtVersement() {
		return mtVersement;
	}

	public void setMtVersement(double mtVersement) {
		this.mtVersement = mtVersement;
	}

	public double getMtRetrait() {
		return mtRetrait;
	}

	public void setMtRetrait(double mtRetrait) {
		this.mtRetrait = mtRetrait;
	}

	public int getVersion() {
		return version;
	}

	public void setVersion(int version) {
		this.version = version;
	}

	public Operation() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Operation [numOperation=" + numOperation + ", dateOperation="
				+ dateOperation + ", mtVersement=" + mtVersement
				+ ", mtRetrait=" + mtRetrait + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((compte == null) ? 0 : compte.hashCode());
		result = prime * result
				+ ((dateOperation == null) ? 0 : dateOperation.hashCode());
		long temp;
		temp = Double.doubleToLongBits(mtRetrait);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(mtVersement);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + (int) (numOperation ^ (numOperation >>> 32));
		result = prime * result + version;
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
		Operation other = (Operation) obj;
		if (compte == null) {
			if (other.compte != null)
				return false;
		} else if (!compte.equals(other.compte))
			return false;
		if (dateOperation == null) {
			if (other.dateOperation != null)
				return false;
		} else if (!dateOperation.equals(other.dateOperation))
			return false;
		if (Double.doubleToLongBits(mtRetrait) != Double
				.doubleToLongBits(other.mtRetrait))
			return false;
		if (Double.doubleToLongBits(mtVersement) != Double
				.doubleToLongBits(other.mtVersement))
			return false;
		if (numOperation != other.numOperation)
			return false;
		if (version != other.version)
			return false;
		return true;
	}

	public Compte getCompte() {
		return compte;
	}

	public void setCompte(Compte compte) {
		this.compte = compte;
	}

}
