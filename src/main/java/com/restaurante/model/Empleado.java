package com.restaurante.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
//import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
//import javax.persistence.JoinColumn;
//import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

//import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name = "tb_empleado")
public class Empleado {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_empleado")
	private int id_empleado;

	private String dni_empleado;
	private String nombre_empleado;
	private String apellido_empleado;

	@Temporal(TemporalType.TIMESTAMP)
	private Date fechanac_empleado;

	private String telefono_empleado;
	private String correo_empleado;
	private String domicilio_empleado;

	/* @JsonIgnoreProperties({ "hibernateLazyInitializer", "handler" }) */
	/*
	 * @ManyToOne(fetch = FetchType.LAZY, targetEntity = Sede.class)
	 * 
	 * @JoinColumn(name = "id_sede", referencedColumnName = "id_sede") private Sede
	 * tb_sede;
	 */

	private int id_sede;

	public int getId_empleado() {
		return id_empleado;
	}

	public void setId_empleado(int id_empleado) {
		this.id_empleado = id_empleado;
	}

	public String getDni_empleado() {
		return dni_empleado;
	}

	public void setDni_empleado(String dni_empleado) {
		this.dni_empleado = dni_empleado;
	}

	public String getNombre_empleado() {
		return nombre_empleado;
	}

	public void setNombre_empleado(String nombre_empleado) {
		this.nombre_empleado = nombre_empleado;
	}

	public String getApellido_empleado() {
		return apellido_empleado;
	}

	public void setApellido_empleado(String apellido_empleado) {
		this.apellido_empleado = apellido_empleado;
	}

	public Date getFechaNac_empleado() {
		return fechanac_empleado;
	}

	public void setFechaNac_empleado(Date fechaNac_empleado) {
		this.fechanac_empleado = fechaNac_empleado;
	}

	public String getTelefono_empleado() {
		return telefono_empleado;
	}

	public void setTelefono_empleado(String telefono_empleado) {
		this.telefono_empleado = telefono_empleado;
	}

	public String getCorreo_empleado() {
		return correo_empleado;
	}

	public void setCorreo_empleado(String correo_empleado) {
		this.correo_empleado = correo_empleado;
	}

	public String getDomicilio_empleado() {
		return domicilio_empleado;
	}

	public void setDomicilio_empleado(String domicilio_empleado) {
		this.domicilio_empleado = domicilio_empleado;
	}

	public Date getFechanac_empleado() {
		return fechanac_empleado;
	}

	public void setFechanac_empleado(Date fechanac_empleado) {
		this.fechanac_empleado = fechanac_empleado;
	}

	public int getId_sede() {
		return id_sede;
	}

	public void setId_sede(int id_sede) {
		this.id_sede = id_sede;
	}

	/*
	 * public Sede getTb_sede() { return tb_sede; }
	 * 
	 * public void setTb_sede(Sede tb_sede) { this.tb_sede = tb_sede; }
	 */

}
