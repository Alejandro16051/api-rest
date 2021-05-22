package com.restaurante.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

import com.restaurante.commons.GenericServiceImpl;
import com.restaurante.dao.api.MesaDaoAPI;
import com.restaurante.model.Mesa;
import com.restaurante.service.api.MesaServiceAPI;

@Service
public class MesaServiceImpl extends GenericServiceImpl<Mesa, Integer> implements MesaServiceAPI{

	@Autowired
	private MesaDaoAPI mesaDaoAPI;
	
	@Override
	public CrudRepository<Mesa, Integer> getDao() {
		return mesaDaoAPI;
	}

}
