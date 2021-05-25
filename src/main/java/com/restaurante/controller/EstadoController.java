package com.restaurante.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.restaurante.model.Estado;
import com.restaurante.service.api.EstadoServiceAPI;

@RestController
@CrossOrigin(origins = "*", methods= {RequestMethod.GET,RequestMethod.POST})
@RequestMapping(value = "estados")
public class EstadoController {
	
	@Autowired
	private EstadoServiceAPI estadoServiceAPI;
	
	//metodos http - LISTA
	
	@GetMapping(value = "/allEstado")
	public List<Estado> getAll() {
		return estadoServiceAPI.getAll();
	}
	
	//metodos http - GUARDAR y ACTUALIZAR
	
	@PostMapping(value = "/saveEstado")
	public ResponseEntity<Estado> save(@RequestBody Estado estado){
		Estado obj = estadoServiceAPI.save(estado);
		
		return new ResponseEntity<Estado>(obj, HttpStatus.OK);
	}
	
	//metodos http - ELIMINAR
	
	@DeleteMapping(value = "/deleteEstado/{id}")
	public ResponseEntity<Estado> delete(@PathVariable Integer id){
		Estado estado = estadoServiceAPI.get(id);
		if (estado != null) {
			estadoServiceAPI.delete(id);
		}else {
			return new ResponseEntity<Estado>(estado, HttpStatus.INTERNAL_SERVER_ERROR);
		}
		
		return new ResponseEntity<Estado>(estado, HttpStatus.OK);
	}

}
