package edu.ucj.programacion.pec1.eduardoVieira;

public class GestionColegios {

	public static void main(String[] args) {
		//https://github.com/BoolachA/pec1_EduardoVieira --> repositorio github
		
		//Creamos 3 colegios con distinto numero de aulas
		//Colegio(Nombre,direccion,numero de aulas) ---> en cada aula caben 3 alumnos
		Colegio[] colegios = new Colegio[3];
		colegios[0] = new Colegio("Colegio A", "Calle 1", 3);
		colegios[1] = new Colegio("Colegio B", "Calle 2", 2);
		colegios[2] = new Colegio("Colegio C", "Calle 3", 7);
		
		//Puedes modificar el numero de alumnos en la funcion crearAlumnos
		//El colegio 1 recibirá 4 alumnos
		recibirAlumnos(colegios[0],UtilsColegio.crearAlumnos(4));
		//El colegio 2 recibirá 6 alumnos
		recibirAlumnos(colegios[1],UtilsColegio.crearAlumnos(6));
		//El colegio 3 recibirá 10 alumnos
		recibirAlumnos(colegios[2],UtilsColegio.crearAlumnos(10));
		//El metodo UtilsColegio.crearAlumnos(x) devuelve un Array de tipo Alumno con x elementos.
		
		
		//Prueba del metodo printAlumnos
		colegios[1].printAlumnos(1);

	}
	
	private static void recibirAlumnos(Colegio colegios, Alumno[] alumnos) {
		for(int x=0;x<alumnos.length;x++) {
			//Llamamos el metodo asignarAsiento de un cierto colegio para cada alumno del Array recibido
			colegios.asignarAsiento(alumnos[x]);			
		}
		
	}

}
