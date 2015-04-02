package com.groupe.gestion.compte.metier;

import java.util.Date;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorType;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import javax.persistence.Version;

@Entity
@Table (name="Compte")
@Inheritance(strategy=InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(
		name="Type_Compte",
		discriminatorType=DiscriminatorType.STRING)
@DiscriminatorValue("Compte")
public class Compte {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column (name="numCompte_ID")
	private long numCompte;
	

	
	@Version
	private Version version;
	
	private Date dateCompte;
	private double solde;
	
	@ManyToMany
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
	public Date getDateCompte() {
		return dateCompte;
	}
	public void setDateCompte(Date dateCompte) {
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
	public Version getVersion() {
		return version;
	}
	public void setVersion(Version version) {
		this.version = version;
	}
	public Compte(long numCompte, Version version, Date dateCompte, double solde) {
		super();
		this.numCompte = numCompte;
		this.version = version;
		this.dateCompte = dateCompte;
		this.solde = solde;
	}
	@Override
	public String toString() {
		return "Compte [numCompte=" + numCompte + ", version=" + version
				+ ", dateCompte=" + dateCompte + ", solde=" + solde + "]";
	}
	
	
	
}
