package com.projetdelamort.metier.services;

import java.util.List;

public interface IService<T> {

	
	public void create (T arg0);
	public T readById (long arg0);
	public List<T> readAll ();
	public void update (long arg0);
	public void delete (long arg0);
	
}
