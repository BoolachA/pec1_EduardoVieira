package edu.ucj.programacion.pec1.eduardoVieira;

import java.util.Scanner;

public class UtilsColegio {
	public static Alumno[] crearAlumnos(int numAlumnos) {
		//Creamos el Array de alumnos con la longitud deseada
		Alumno[] alumnos = new Alumno[numAlumnos];
		
		//Creamos los arrays nombres, apellidos y dnis con la longitud deseada para almacenar la información
		String[] nombres = new String[numAlumnos];
		String[] apellidos = new String[numAlumnos];
		String[] dnis = new String[numAlumnos];
		
		//Creamos un scanner para pedir la info al usuario
		Scanner scanner = new Scanner(System.in);
		//En cada for pediremos un dato x veces al usuario y lo guardamos en sus respectivas posiciones
		for(int x=0;x<numAlumnos;x++) {
			System.out.println("Nombre del alumno " + (x+1) + ": ");
			nombres[x] = scanner.nextLine();
		}
		for(int x=0;x<numAlumnos;x++) {
			System.out.println("Apellidos del alumno " + (x+1) + ": ");
			apellidos[x] = scanner.nextLine();
		}
		for(int x=0;x<numAlumnos;x++) {
			System.out.println("DNI del alumno " + (x+1) + ": ");
			dnis[x] = scanner.nextLine();
		}
		//Lo correcto seria utilizar aqui scanner.close();
		//Sin embargo al utilizar este metodo varias veces, dejaré el scanner abierto para utilizarlo más veces sin errores
		
		//Con la información recompilada creamos los objetos alumnos finales
		for(int x=0;x<numAlumnos;x++) {
			alumnos[x] = new Alumno(nombres[x],apellidos[x],dnis[x]);
		}
		
		//Retornamos el Array final
		return alumnos;
	}

}