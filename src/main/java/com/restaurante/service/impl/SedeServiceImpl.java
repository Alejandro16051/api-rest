package com.restaurante.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

import com.restaurante.commons.GenericServiceImpl;
import com.restaurante.dao.api.SedeDaoAPI;
import com.restaurante.model.Sede;
import com.restaurante.service.api.SedeServiceAPI;

@Service
public class SedeServiceImpl extends GenericServiceImpl<Sede, Integer> implements SedeServiceAPI{

	@Autowired
	private SedeDaoAPI sedeDaoAPI;
	
	@Override
	public CrudRepository<Sede, Integer> getDao() {
		return sedeDaoAPI;
	}

}
