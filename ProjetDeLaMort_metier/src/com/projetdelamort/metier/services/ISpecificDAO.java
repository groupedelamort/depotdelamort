package com.projetdelamort.metier.services;

import com.projetdelamort.metier.entities.Client;
import com.projetdelamort.metier.entities.Login;
import com.projetdelamort.metier.entities.Operation;

public interface ISpecificDAO {
	
	public Client getClientByLogin (Login login);
	public Login getLoginByLogin (String login);
	public Operation 
}
