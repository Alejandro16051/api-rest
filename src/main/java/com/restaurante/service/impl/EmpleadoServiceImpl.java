package com.restaurante.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

import com.restaurante.commons.GenericServiceImpl;
import com.restaurante.dao.api.EmpleadoDaoAPI;
import com.restaurante.model.Empleado;
import com.restaurante.service.api.EmpleadoServiceAPI;

@Service
public class EmpleadoServiceImpl extends GenericServiceImpl<Empleado, Integer> implements EmpleadoServiceAPI{

	@Autowired
	private EmpleadoDaoAPI empleadoDaoAPI;
	
	@Override
	public CrudRepository<Empleado, Integer> getDao() {
		return empleadoDaoAPI;
	}

}
