package com.projetdelamort.metier.entities;


import java.io.Serializable;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Version;

@Entity
@Table(name="Client_Reunion")
public class ClientReunion implements Serializable {
	
	@EmbeddedId
	private ClientReunionId id;
	
	private String compteRendu;
	
	@Version
	private int version;

	public ClientReunion() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ClientReunionId getId() {
		return id;
	}

	public void setId(ClientReunionId id) {
		this.id = id;
	}

	public String getCompteRendu() {
		return compteRendu;
	}

	public void setCompteRendu(String compteRendu) {
		this.compteRendu = compteRendu;
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
		result = prime * result
				+ ((compteRendu == null) ? 0 : compteRendu.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
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
		ClientReunion other = (ClientReunion) obj;
		if (compteRendu == null) {
			if (other.compteRendu != null)
				return false;
		} else if (!compteRendu.equals(other.compteRendu))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (version != other.version)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "ClientReunion [id=" + id + ", compteRendu=" + compteRendu + "]";
	}
	
}
