package com.restaurante.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name = "tb_sede")
public class Sede {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_sede")
	private int id_sede;
	
	private String nombre_sede;
	private String direccion_sede;
	private String latitud_sede;
	private String longitud_sede;
	/*
	@JsonIgnoreProperties({ "hibernateLazyInitializer", "handler" })
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "id_estado")
	private Estado tb_estado;*/

	
	
	public int getId_sede() {
		return id_sede;
	}

	public void setId_sede(int id_sede) {
		this.id_sede = id_sede;
	}

	public String getNombre_sede() {
		return nombre_sede;
	}

	public void setNombre_sede(String nombre_sede) {
		this.nombre_sede = nombre_sede;
	}

	public String getDireccion_sede() {
		return direccion_sede;
	}

	public void setDireccion_sede(String direccion_sede) {
		this.direccion_sede = direccion_sede;
	}

	public String getLatitud_sede() {
		return latitud_sede;
	}

	public void setLatitud_sede(String latitud_sede) {
		this.latitud_sede = latitud_sede;
	}

	public String getLongitud_sede() {
		return longitud_sede;
	}

	public void setLongitud_sede(String longitud_sede) {
		this.longitud_sede = longitud_sede;
	}
/*
	public Estado getTb_estado() {
		return tb_estado;
	}

	public void setTb_estado(Estado tb_estado) {
		this.tb_estado = tb_estado;
	}*/
	

}
