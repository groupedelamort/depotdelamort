package com.projetdelamort.metier.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.projetdelamort.metier.entities.Login;

@Service
public class GenericService<T> implements IService<T> {

	@Autowired
	DAO dao;
	
	
	@Override
	public void create(T arg0) {
		dao.create(arg0);		
	}

	@Override
	public T readById(long arg0) {
		
		return (T) dao.readById(arg0);
	}

	@Override
	public List<T> readAll() {
		// TODO Auto-generated method stub
		return dao.readAll();
	}

	@Override
	public void update(long arg0) {
		dao.update(arg0);
	}

	@Override
	public void delete(long arg0) {
		dao.delete(arg0);	
	}

}
