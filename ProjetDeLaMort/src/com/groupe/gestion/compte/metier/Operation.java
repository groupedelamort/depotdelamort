package com.groupe.gestion.compte.metier;

import java.util.Date;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import javax.persistence.Version;

@Entity
@Table(name="Operation")
public class Operation {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long numOperation;
	private Date dateOperation;
	private double mtVersement;
	private double mtRetrait;
	@Version
	private Version version;
	
	@ManyToMany (mappedBy="comptes", fetch=FetchType.LAZY)
	private Set<Compte> comptes;
	
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
	
	public Set<Compte> getComptes() {
		return comptes;
	}
	public void setComptes(Set<Compte> comptes) {
		this.comptes = comptes;
	}
	public Version getVersion() {
		return version;
	}
	public void setVersion(Version version) {
		this.version = version;
	}
	public Operation(long numOperation, Date dateOperation, double mtVersement,
			double mtRetrait, Version version) {
		super();
		this.numOperation = numOperation;
		this.dateOperation = dateOperation;
		this.mtVersement = mtVersement;
		this.mtRetrait = mtRetrait;
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
	
	

	
	
}
