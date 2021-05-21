package com.restaurante.dao.api;

import org.springframework.data.repository.CrudRepository;

import com.restaurante.model.Empleado;

public interface EmpleadoDaoAPI extends CrudRepository<Empleado, Integer> {

}
