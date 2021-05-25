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

import com.restaurante.model.Reserva;
import com.restaurante.service.api.ReservaServiceAPI;

@RestController
@CrossOrigin(origins = "*", methods= {RequestMethod.GET,RequestMethod.POST})
@RequestMapping(value = "reservas")
public class ReservaController {
	
	@Autowired
	private ReservaServiceAPI reservaServiceAPI;
	
	//metodos http - LISTA
	
	@GetMapping(value = "/allReserva")
	public List<Reserva> getAll() {
		return reservaServiceAPI.getAll();
	}
	
	//metodos http - GUARDAR y ACTUALIZAR
	
	@PostMapping(value = "/saveReserva")
	public ResponseEntity<Reserva> save(@RequestBody Reserva reserva){
		Reserva obj = reservaServiceAPI.save(reserva);
		
		return new ResponseEntity<Reserva>(obj, HttpStatus.OK);
	}
	
	//metodos http - ELIMINAR
	
	@DeleteMapping(value = "/deleteReserva/{id}")
	public ResponseEntity<Reserva> delete(@PathVariable Integer id){
		Reserva reserva = reservaServiceAPI.get(id);
		if (reserva != null) {
			reservaServiceAPI.delete(id);
		}else {
			return new ResponseEntity<Reserva>(reserva, HttpStatus.INTERNAL_SERVER_ERROR);
		}
		
		return new ResponseEntity<Reserva>(reserva, HttpStatus.OK);
	}

}
