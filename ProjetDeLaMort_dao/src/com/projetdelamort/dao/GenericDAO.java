package com.projetdelamort.dao;


import java.util.ArrayList;
import java.util.List;
import org.hibernate.Transaction;
import org.hibernate.Session;

public class GenericDAO<T> implements DAO<T> {

	private Class<T> genericDAOClass;

	/**
	 * Constructeur, passer en argument la classe de l'objet : Objet.class
	 * 
	 * @param genericDAOClass
	 */
	public GenericDAO(Class<T> genericDAOClass) {
		this.genericDAOClass = genericDAOClass;
	}

	@Override
	public void create(T arg0) {
		Transaction tx = null;
		Session s = HibernateUtil.getSessionFactory().getCurrentSession();
		try {
			tx = s.beginTransaction();
			s.save(arg0);
			tx.commit();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	public List<T> readAll() {
		List<T> list = new ArrayList<T>();
		Transaction tx = null;
		Session s = HibernateUtil.getSessionFactory().getCurrentSession();
		try {
			tx = s.beginTransaction();
			// ////////////////////////////////////////
			// // TOUT DOUX //////////////////////////
			// //////////////////////////////////////
			s.createQuery("from " + this.getGenericDAOClass().getName());
			tx.commit();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return list;
	}

	/**
	 * Lire une entrée à partir de son ID
	 * 
	 * @param l
	 *            'id de l'entrée à récupérer
	 */
	@SuppressWarnings("unchecked")
	@Override
	public T readById(Long id) {
		T list = null;
		Transaction tx = null;
		Session s = HibernateUtil.getSessionFactory().getCurrentSession();
		try {
			tx = s.beginTransaction();
			list = (T) s.get(this.getGenericDAOClass(), id);
			tx.commit();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return list;
	}

	@Override
	public void update(T arg0) {
		Transaction tx = null;
		Session s = HibernateUtil.getSessionFactory().getCurrentSession();
		try {
			tx = s.beginTransaction();
			s.update(arg0);
			tx.commit();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Supprime l'entrée en argument
	 * 
	 * @param l
	 *            'entrée à supprimer
	 */
	@Override
	public void delete(T arg0) {
		Transaction tx = null;
		Session s = HibernateUtil.getSessionFactory().getCurrentSession();
		try {
			tx = s.beginTransaction();
			s.delete(arg0);
			tx.commit();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public Class getGenericDAOClass() {
		return genericDAOClass;
	}

	public void setGenericDAOClass(Class genericDAOClass) {
		this.genericDAOClass = genericDAOClass;
	}
}