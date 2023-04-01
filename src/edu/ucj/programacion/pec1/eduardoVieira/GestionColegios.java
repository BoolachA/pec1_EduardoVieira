package edu.ucj.programacion.pec1.eduardoVieira;

public class GestionColegios {

	public static void main(String[] args) {
		Alumno[] alumnos = UtilsColegio.crearAlumnos(3);
		Colegio colegio1 = new Colegio("Colegio A", "Calle C", 7);
		colegio1.asignarAsiento(alumnos[1]);

	}

}
