package com.restaurante.model;

//import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
//import javax.persistence.Temporal;
//import javax.persistence.TemporalType;

@Entity
@Table(name = "tb_reserva")
public class Reserva {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_reserva")
	private int id_reserva;

	private int id_mesa;
	private int id_estado;

	/* @Temporal(TemporalType.TIMESTAMP) */
	private String fechainicio_reserva;
	/*
	 * @Temporal(TemporalType.TIMESTAMP)
	 */
	private String fechafin_reserva;

	public int getId_reserva() {
		return id_reserva;
	}

	public void setId_reserva(int id_reserva) {
		this.id_reserva = id_reserva;
	}

	public int getId_mesa() {
		return id_mesa;
	}

	public void setId_mesa(int id_mesa) {
		this.id_mesa = id_mesa;
	}

	public int getId_estado() {
		return id_estado;
	}

	public void setId_estado(int id_estado) {
		this.id_estado = id_estado;
	}

	public String getFechainicio_reserva() {
		return fechainicio_reserva;
	}

	public void setFechainicio_reserva(String fechainicio_reserva) {
		this.fechainicio_reserva = fechainicio_reserva;
	}

	public String getFechafin_reserva() {
		return fechafin_reserva;
	}

	public void setFechafin_reserva(String fechafin_reserva) {
		this.fechafin_reserva = fechafin_reserva;
	}

}
