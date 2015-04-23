package com.projetdelamort.dao;

import java.util.List;

import com.projetdelamort.metier.entities.Client;
import com.projetdelamort.metier.entities.Login;
import com.projetdelamort.metier.services.ISpecificDAO;

@SuppressWarnings("rawtypes")
public class SpecificDAOImpl extends GenericSpringDAO implements ISpecificDAO {

	/**
	 * Récupérer le client à partir du login 
	 * @param Login login : le login du client
	 * @return Client : le client correspondant
	 */
	public Client getClientByLogin (Login login){
		Client client = null;
		
		String req = "from Login left join fetch Login where idLogin="+login.getIdLogin();
		
		client = (Client) getSession().createQuery(req);
		
		return client;
		
		
	}

}
