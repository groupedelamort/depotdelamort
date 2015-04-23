package com.projetdelamort.metier.services;


import java.util.List;

public interface DAO<T> {
	public void create(T arg0);

	public List<T> readAll();

	public T readById(Long id);

	public void update(T arg0);

	public void delete(T arg0);
}