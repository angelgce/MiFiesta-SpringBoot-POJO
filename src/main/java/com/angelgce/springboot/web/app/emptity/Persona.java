package com.angelgce.springboot.web.app.emptity;

//Mi Clase POJO para guardar personas
public class Persona {

	private String nombre;
	private String apellido;
	private String correo;
	private String numero_telefonico;

	public Persona() {
	}

	public Persona(String nombre, String apellido, String correo, String numero_telefonico) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.correo = correo;
		this.numero_telefonico = numero_telefonico;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getCorreo() {
		return correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}

	public String getNumero_telefonico() {
		return numero_telefonico;
	}

	public void setNumero_telefonico(String numero_telefonico) {
		this.numero_telefonico = numero_telefonico;
	}


	

	

}
