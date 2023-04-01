package edu.ucj.programacion.pec1.eduardoVieira;

public class Aula {
	private int numero;
	private int planta;
	private Alumno[] asientos = new Alumno[3];
	
	public Aula(int numero, int planta) {
		this.numero = numero;
		this.planta = planta;
	}
	
	//Para este setter, necesitamos dar como parametro el asiento y un alumno
	public void setAsiento(int asiento, Alumno alumno) {
		this.asientos[asiento] = alumno;
	}
	
	//Getters
	public int getPlanta() {
		return planta;
	}
	public Alumno getAsiento(int asiento) {
		//Para este getter, necesitamos dar como parametro el numero del asiento (0-2)
		return asientos[asiento]; //Se devuelve un objeto de tipo Alumno, si está el asiento vacio se devuelve null
	}

}
