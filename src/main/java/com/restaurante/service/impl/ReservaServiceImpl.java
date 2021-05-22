package com.restaurante.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

import com.restaurante.commons.GenericServiceImpl;
import com.restaurante.dao.api.ReservaDaoAPI;
import com.restaurante.model.Reserva;
import com.restaurante.service.api.ReservaServiceAPI;

@Service
public class ReservaServiceImpl extends GenericServiceImpl<Reserva, Integer> implements ReservaServiceAPI{

	@Autowired
	private ReservaDaoAPI reservaDaoAPI;
	
	@Override
	public CrudRepository<Reserva, Integer> getDao() {
		return reservaDaoAPI;
	}

}
