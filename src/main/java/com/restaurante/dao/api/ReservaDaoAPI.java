package com.restaurante.dao.api;

import org.springframework.data.repository.CrudRepository;

import com.restaurante.model.Reserva;

public interface ReservaDaoAPI extends CrudRepository<Reserva, Integer>{

}
