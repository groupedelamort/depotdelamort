package com.projetdelamort.metier.services;

import java.util.List;

import com.projetdelamort.metier.entities.Client;
import com.projetdelamort.metier.entities.Compte;
import com.projetdelamort.metier.entities.Login;
import com.projetdelamort.metier.entities.Operation;

public interface ISpecificDAO {
	
	public Client getClientByLogin (Login login);
	public Login checkConnection (Login login);
	public List<Operation> getOperationsByCompte (Compte compte);
}
