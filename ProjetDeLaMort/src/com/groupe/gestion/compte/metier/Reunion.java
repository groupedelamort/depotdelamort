package com.groupe.gestion.compte.metier;

import java.io.Serializable;

import java.util.Calendar;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Version;

@Entity
@Table(name="Reunions")
public class Reunion implements Serializable{
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long idReunion;
	private String titre;
	private Calendar dateReunion;
	
	@OneToMany(mappedBy="id.reunion",fetch=FetchType.LAZY)
	private List<ClientReunion> clientReunion;
	
	@Version
	private int version;

	public Reunion() {
		super();
		// TODO Auto-generated constructor stub
	}

	public long getIdReunion() {
		return idReunion;
	}

	public void setIdReunion(long idReunion) {
		this.idReunion = idReunion;
	}

	public String getTitre() {
		return titre;
	}

	public void setTitre(String titre) {
		this.titre = titre;
	}

	public Calendar getDateReunion() {
		return dateReunion;
	}

	public void setDateReunion(Calendar dateReunion) {
		this.dateReunion = dateReunion;
	}

	public List<ClientReunion> getClientReunion() {
		return clientReunion;
	}

	public void setClientReunion(List<ClientReunion> clientReunion) {
		this.clientReunion = clientReunion;
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
				+ ((clientReunion == null) ? 0 : clientReunion.hashCode());
		result = prime * result
				+ ((dateReunion == null) ? 0 : dateReunion.hashCode());
		result = prime * result + (int) (idReunion ^ (idReunion >>> 32));
		result = prime * result + ((titre == null) ? 0 : titre.hashCode());
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
		Reunion other = (Reunion) obj;
		if (clientReunion == null) {
			if (other.clientReunion != null)
				return false;
		} else if (!clientReunion.equals(other.clientReunion))
			return false;
		if (dateReunion == null) {
			if (other.dateReunion != null)
				return false;
		} else if (!dateReunion.equals(other.dateReunion))
			return false;
		if (idReunion != other.idReunion)
			return false;
		if (titre == null) {
			if (other.titre != null)
				return false;
		} else if (!titre.equals(other.titre))
			return false;
		if (version != other.version)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Reunion [idReunion=" + idReunion + ", titre=" + titre
				+ ", dateReunion=" + dateReunion + ", clientReunion="
				+ clientReunion + "]";
	}
	
	
}
