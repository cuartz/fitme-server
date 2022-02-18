package com.fitme.server.model;

import javax.annotation.processing.Generated;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.GenerationType;

@Entity
@Table(name= "clientes")
public class Cliente {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@Column(name="nombres")
	private String nombres;
	@Column(name="apellidos")
	private String apellidos;
	@Column(name="edad")
	private int edad;
	
	public Cliente() {
		
	}
	
	public Cliente(String nombres, String apellidos, int edad) {
		super();
		this.nombres = nombres;
		this.apellidos = apellidos;
		this.edad = edad;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getNombres() {
		return nombres;
	}

	public void setNombres(String nombres) {
		this.nombres = nombres;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}



}
