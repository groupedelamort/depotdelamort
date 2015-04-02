package com.groupe.gestion.compte.metier;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Version;

@Entity
public class Login implements Serializable {
	
	private long idLogin;
	private String login;
	private String mdp;
	
	@Version
	private int version;
	
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
	
	
	
}
