package com.projetdelamort.metier.entities;


import java.io.Serializable;

import javax.persistence.Embeddable;
import javax.persistence.FetchType;
import javax.persistence.ManyToOne;

@Embeddable
public class ClientReunionId implements Serializable{
	
	@ManyToOne(fetch=FetchType.LAZY)
	private Client client;
	
	@ManyToOne(fetch=FetchType.LAZY)
	private Reunion reunion;
	

	public ClientReunionId() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Client getClient() {
		return client;
	}

	public void setClient(Client client) {
		this.client = client;
	}

	public Reunion getReunion() {
		return reunion;
	}

	public void setReunion(Reunion reunion) {
		this.reunion = reunion;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((client == null) ? 0 : client.hashCode());
		result = prime * result + ((reunion == null) ? 0 : reunion.hashCode());
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
		ClientReunionId other = (ClientReunionId) obj;
		if (client == null) {
			if (other.client != null)
				return false;
		} else if (!client.equals(other.client))
			return false;
		if (reunion == null) {
			if (other.reunion != null)
				return false;
		} else if (!reunion.equals(other.reunion))
			return false;
		return true;
	}
	
	

}
