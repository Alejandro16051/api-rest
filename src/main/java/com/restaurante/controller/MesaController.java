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

import com.restaurante.model.Mesa;
import com.restaurante.service.api.MesaServiceAPI;

@RestController
@RequestMapping(value = "mesas")
public class MesaController {
	
	@Autowired
	private MesaServiceAPI mesaServiceAPI;
	
	//metodos http - LISTA
	
	@GetMapping(value = "/allMesa")
	public List<Mesa> getAll() {
		return mesaServiceAPI.getAll();
	}
	
	//metodos http - GUARDAR y ACTUALIZAR
	
	@PostMapping(value = "/saveMesa")
	public ResponseEntity<Mesa> save(@RequestBody Mesa mesa){
		Mesa obj = mesaServiceAPI.save(mesa);
		
		return new ResponseEntity<Mesa>(obj, HttpStatus.OK);
	}
	
	//metodos http - ELIMINAR
	
	@DeleteMapping(value = "/deleteMesa/{id}")
	public ResponseEntity<Mesa> delete(@PathVariable Integer id){
		Mesa mesa = mesaServiceAPI.get(id);
		if (mesa != null) {
			mesaServiceAPI.delete(id);
		}else {
			return new ResponseEntity<Mesa>(mesa, HttpStatus.INTERNAL_SERVER_ERROR);
		}
		
		return new ResponseEntity<Mesa>(mesa, HttpStatus.OK);
	}

}
