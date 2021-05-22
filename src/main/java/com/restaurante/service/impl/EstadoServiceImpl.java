package com.restaurante.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

import com.restaurante.commons.GenericServiceImpl;
import com.restaurante.dao.api.EstadoDaoAPI;
import com.restaurante.model.Estado;
import com.restaurante.service.api.EstadoServiceAPI;

@Service
public class EstadoServiceImpl extends GenericServiceImpl<Estado, Integer> implements EstadoServiceAPI{

	@Autowired
	private EstadoDaoAPI estadoDaoAPI;
	
	@Override
	public CrudRepository<Estado, Integer> getDao() {
		return estadoDaoAPI;
	}

}
