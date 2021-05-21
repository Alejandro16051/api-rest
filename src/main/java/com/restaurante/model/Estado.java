package com.restaurante.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tb_estado")
public class Estado {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id_estado;
	private String descripcion_estado;
	
	
	
	public int getId_estado() {
		return id_estado;
	}
	public void setId_estado(int id_estado) {
		this.id_estado = id_estado;
	}
	public String getDescripcion_estado() {
		return descripcion_estado;
	}
	public void setDescripcion_estado(String descripcion_estado) {
		this.descripcion_estado = descripcion_estado;
	}

}
