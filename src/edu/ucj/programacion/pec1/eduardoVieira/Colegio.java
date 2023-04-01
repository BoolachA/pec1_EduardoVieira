package edu.ucj.programacion.pec1.eduardoVieira;

public class Colegio {
	private String nombre;
	private String direccion;
	private Aula[] aulas;
	
	//Constructor
	public Colegio(String nombre, String direccion, int numAulas) {
		this.nombre = nombre;
		this.direccion = direccion;
		
		//En el constructor, a parte de inicializar las variables, también creamos aulas con el metodo abajo
		crearAulas(numAulas);
		
	}
	
	private void crearAulas(int numAulas) {
		//Creamos un array vacio de tipo Aula
		aulas = new Aula[numAulas];
		
		for(int x=0;x<numAulas;x++) {
			//Si el aula es par, la ponemos en la segunda planta, si es impar la ponemos en la primera
			if(x%2==0) {
				aulas[x] = new Aula(x,2);
			}else {
				aulas[x] = new Aula(x,1);
			}
			
		}
		
	}
	
	public void asignarAsiento(Alumno alumno) {
		boolean asignado = false;
		
		for(int x=0;x<aulas.length & !asignado;x++) {
			for(int z=0;z<3;z++) {
				//Recorremos el Array de aulas hasta encontrar un null en getAsiento()
				//El metodo getAsiento devuelve el objeto alumno almacenado en dicho asiento
				if(aulas[x].getAsiento(z) != null) {
					continue;
				}else {
					//Si encontramos un asiento vacio (null), asignamos el alumno a este asiento
					aulas[x].setAsiento(z, alumno);
					System.out.println("Alumno " + alumno.getNombre() + " " + alumno.getApellidos() + "\nDNI: " + 
					alumno.getDni() + "\nAsignado el asiento " + (z+1) + "/3 de la clase " + (x+1) + "\n" );
					//Cambiamos "asginado" a true para finalizar el primer bucle
					asignado = true;
					//Con el break finalizamos el segundo bucle
					break;
				}
			}
		}
		
	}
	
	//Getter: como parametro se necesita el numero del aula para devolver su planta
	public int getAulaPlanta(int aula) {
		return aulas[aula].getPlanta();
	}
	
	//En el main podemos llamar este metodo para ver todos los alumnos de un aula
	public void printAlumnos(int aula) {
		System.out.println("Alumnos de la clase " + aula + " del colegio " + nombre);
		for(int x=0;x<3;x++) {
			if(aulas[aula].getAsiento(x) != null) {
				System.out.println(aulas[aula].getAsiento(x).getNombre());
			}else {
				//Si encontramos un null en algun asiento, informamos que el asiento está vacío
				System.out.println("asiento vacio");
			}
		}
	}

}
