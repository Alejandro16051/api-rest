package com.restaurante.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.restaurante.model.Empleado;
import com.restaurante.service.api.EmpleadoServiceAPI;

@RestController
@RequestMapping(value = "empleados")
public class EmpleadoController {
	
	@Autowired
	private EmpleadoServiceAPI empleadoServiceAPI;
	
	//metodos http - LISTA
	
	@GetMapping(value = "/allEmpleado")
	public List<Empleado> getAll() {
		return empleadoServiceAPI.getAll();
	}
	
	//metodos http - GUARDAR y ACTUALIZAR
	
	@PostMapping(value = "/saveEmpleado")
	public ResponseEntity<Empleado> save(@RequestBody Empleado empleado){
		Empleado obj = empleadoServiceAPI.save(empleado);

		return new ResponseEntity<Empleado>(obj, HttpStatus.OK);
	}
	
	//metodos http - ELIMINAR
	
	@DeleteMapping(value = "/deleteEmpleado/{id}")
	public ResponseEntity<Empleado> delete(@PathVariable Integer id){
		Empleado empleado = empleadoServiceAPI.get(id);
		if (empleado != null) {
		empleadoServiceAPI.delete(id);
		}else {
			return new ResponseEntity<Empleado>(empleado, HttpStatus.INTERNAL_SERVER_ERROR);
		}
		
		return new ResponseEntity<Empleado>(empleado, HttpStatus.OK);
	}
	

}
