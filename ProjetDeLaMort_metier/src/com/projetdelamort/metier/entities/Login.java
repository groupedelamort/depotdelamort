package com.projetdelamort.metier.entities;


import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Version;

@Entity
@Table(name="Logins")
public class Login implements Serializable {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long idLogin;
	private String login;
	private String mdp;
	/*
	@OneToOne(mappedBy="login")
	private Client client;
	*/
	@Version
	private int version;
	
	
	public Login() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public long getIdLogin() {
		return idLogin;
	}
	public void setIdLogin(long idLogin) {
		this.idLogin = idLogin;
	}
	public String getLogin() {
		return login;
	}
	public void setLogin(String login) {
		this.login = login;
	}
	public String getMdp() {
		return mdp;
	}
	public void setMdp(String mdp) {
		this.mdp = mdp;
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
		result = prime * result + (int) (idLogin ^ (idLogin >>> 32));
		result = prime * result + ((login == null) ? 0 : login.hashCode());
		result = prime * result + ((mdp == null) ? 0 : mdp.hashCode());
		result = prime * result + version;
		return result;
	}

	

	@Override
	public String toString() {
		return "Login [idLogin=" + idLogin + ", login=" + login + ", mdp="
				+ mdp + "]";
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Login other = (Login) obj;
		if (idLogin != other.idLogin)
			return false;
		if (login == null) {
			if (other.login != null)
				return false;
		} else if (!login.equals(other.login))
			return false;
		if (mdp == null) {
			if (other.mdp != null)
				return false;
		} else if (!mdp.equals(other.mdp))
			return false;
		if (version != other.version)
			return false;
		return true;
	}
	
}
