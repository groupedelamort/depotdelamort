package com.projetdelamort.dao;

import java.util.List;

import com.projetdelamort.metier.entities.Client;
import com.projetdelamort.metier.entities.Compte;
import com.projetdelamort.metier.entities.Login;
import com.projetdelamort.metier.entities.Operation;
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
		
		String req = "from Login as l left join fetch l.client where l.idLogin="+login.getIdLogin();
		
		client = (Client) getSession().createQuery(req);
		
		return client;
	}

	
	@SuppressWarnings("unchecked")
	@Override
	public List<Operation> getOperationsByCompte(Compte compte) {
		
		return (List<Operation>) getSession().createQuery("from Operation left join fetch Compte where operation.compte = "+compte.getNumCompte());
	}


	@Override
	public Login checkConnection(Login login) {
		return (Login) getSession().createQuery("from Login where login="+login.getLogin()+" and mdp = "+login.getMdp());
	}

}
