package com.projetdelamort.metier.entities;


import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Version;

@Entity
@Table(name="Clients")
public class Client implements Serializable{
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long codeClient;
	
	private String nom;
	private String adresse;
	
	@OneToOne(mappedBy="client")
	private Login login;


	@OneToMany(mappedBy="id.client",fetch=FetchType.EAGER)
	private List<ClientReunion> clientReunion;
	
	@OneToMany(mappedBy="client",fetch=FetchType.LAZY)
	private List<Compte> comptes;
	
	
	@Version
	private int version;

	public Client() {
		super();
		// TODO Auto-generated constructor stub
	}

	public long getCodeClient() {
		return codeClient;
	}

	public void setCodeClient(long codeClient) {
		this.codeClient = codeClient;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getAdresse() {
		return adresse;
	}

	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}

	public Login getLogin() {
		return login;
	}

	public void setLogin(Login login) {
		this.login = login;
	}

	public List<ClientReunion> getClientReunion() {
		return clientReunion;
	}

	public void setClientReunion(List<ClientReunion> clientReunion) {
		this.clientReunion = clientReunion;
	}

	public List<Compte> getComptes() {
		return comptes;
	}

	public void setComptes(List<Compte> comptes) {
		this.comptes = comptes;
	}

	public int getVersion() {
		return version;
	}

	public void setVersion(int version) {
		this.version = version;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((adresse == null) ? 0 : adresse.hashCode());
		result = prime * result
				+ ((clientReunion == null) ? 0 : clientReunion.hashCode());
		result = prime * result + (int) (codeClient ^ (codeClient >>> 32));
		result = prime * result + ((login == null) ? 0 : login.hashCode());
		result = prime * result + ((nom == null) ? 0 : nom.hashCode());
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
		Client other = (Client) obj;
		if (adresse == null) {
			if (other.adresse != null)
				return false;
		} else if (!adresse.equals(other.adresse))
			return false;
		if (clientReunion == null) {
			if (other.clientReunion != null)
				return false;
		} else if (!clientReunion.equals(other.clientReunion))
			return false;
		if (codeClient != other.codeClient)
			return false;
		if (login == null) {
			if (other.login != null)
				return false;
		} else if (!login.equals(other.login))
			return false;
		if (nom == null) {
			if (other.nom != null)
				return false;
		} else if (!nom.equals(other.nom))
			return false;
		if (version != other.version)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Client [codeClient=" + codeClient + ", nom=" + nom
				+ ", adresse=" + adresse + ", login=" + login
				+ ", clientReunion=" + clientReunion + "]";
	}

}
