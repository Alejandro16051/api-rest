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

import com.restaurante.model.Sede;
import com.restaurante.service.api.SedeServiceAPI;

@RestController
@RequestMapping(value = "sedes")
public class SedeController {
	
	@Autowired
	private SedeServiceAPI sedeServiceAPI;
	
	//metodos http - LISTA
	
	@GetMapping(value = "/allSede")
	public List<Sede> getAll() {
		return sedeServiceAPI.getAll();
	}
	
	//metodos http - GUARDAR y ACTUALIZAR
	
	@PostMapping(value = "/saveSede")
	public ResponseEntity<Sede> save(@RequestBody Sede sede){
		Sede obj = sedeServiceAPI.save(sede);
		
		return new ResponseEntity<Sede>(obj, HttpStatus.OK);
	}
	
	//metodos http - ELIMINAR
	
	@DeleteMapping(value = "/deleteSede/{id}")
	public ResponseEntity<Sede> delete(@PathVariable Integer id){
		Sede sede = sedeServiceAPI.get(id);
		if (sede != null) {
			sedeServiceAPI.delete(id);
		}else {
			return new ResponseEntity<Sede>(sede, HttpStatus.INTERNAL_SERVER_ERROR);
		}
		
		return new ResponseEntity<Sede>(sede, HttpStatus.OK);
	}

}
