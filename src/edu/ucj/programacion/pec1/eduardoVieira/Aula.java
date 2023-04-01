package edu.ucj.programacion.pec1.eduardoVieira;

public class Aula {
	private int numero;
	private int planta; //3 salas por planta
	private Alumno[] asientos = new Alumno[3];
	
	public Aula(int numero, int planta) {
		this.numero = numero;
		this.planta = planta;
	}
	
	public Alumno getAsiento(int asiento) {
		return asientos[asiento];
	}
	
	public void setAsiento(int asiento, Alumno alumno) {
		this.asientos[asiento] = alumno;
	}
	
	public int getPlanta() {
		return planta;
	}

}
