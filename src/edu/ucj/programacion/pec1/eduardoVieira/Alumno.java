package edu.ucj.programacion.pec1.eduardoVieira;

public class Alumno {
	private String nombre;
	private String apellidos;
	private String dni;
	
	public Alumno(String nombre, String apellidos, String dni) {
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.dni = dni;
	}
	
	public String getNombre() {
		return nombre;
	}

}
