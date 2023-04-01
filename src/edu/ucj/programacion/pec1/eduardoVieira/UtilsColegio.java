package edu.ucj.programacion.pec1.eduardoVieira;

import java.util.Scanner;

public class UtilsColegio {
	public static Alumno[] crearAlumnos(int numAlumnos) {
		Alumno[] alumnos = new Alumno[numAlumnos];
		
		String[] nombres = new String[numAlumnos];
		String[] apellidos = new String[numAlumnos];
		String[] dnis = new String[numAlumnos];
		
		Scanner scanner = new Scanner(System.in);
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
		scanner.close();
		
		for(int x=0;x<numAlumnos;x++) {
			alumnos[x] = new Alumno(nombres[x],apellidos[x],dnis[x]);
		}
		
		return alumnos;
	}

}