package com.projetdelamort.dao;


import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.projetdelamort.metier.entities.Client;
import com.projetdelamort.metier.entities.Login;
import com.projetdelamort.metier.services.DAO;

@Repository("genericSpringDAO")
@Transactional
public class GenericSpringDAO<T> implements DAO<T> {
	@Autowired
	private SessionFactory sessFact;
	private Class genericDAOClass;

	/**
	 * Constructeur, passer en argument la classe de l'objet : Objet.class
	 * 
	 * @param genericDAOClass
	 */
	
	
	public GenericSpringDAO(Class genericDAOClass) {
		this.genericDAOClass = genericDAOClass;
	}

	public GenericSpringDAO() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public void create(T arg0) {
		getSession().save(arg0);
	}
				
				
				
	protected Session getSession() {
		return sessFact.getCurrentSession();
	}
		

	@SuppressWarnings("unchecked")
	@Override
	public List<T> readAll() {
		return getSession().createQuery("from " + this.getGenericDAOClass().getName()).list();
	}

	/**
	 * Lire une entrée à partir de son ID
	 * 
	 * @param l'id de l'entrée à récupérer
	 */
	@SuppressWarnings("unchecked")
	@Override
	public T readById(Long id) {
		return (T) getSession().get(this.getGenericDAOClass(), id);
	}

	@Override
	public void update(T arg0) {
		getSession().update(arg0);
	}

	/**
	 * Supprime l'entrée en argument
	 * 
	 * @param l'entrée à supprimer
	 */
	@Override
	public void delete(T arg0) {
		getSession().delete(arg0);
	}

	public Class getGenericDAOClass() {
		return genericDAOClass;
	}

	public void setGenericDAOClass(Class genericDAOClass) {
		this.genericDAOClass = genericDAOClass;
	}
	
}




