package edu.ucj.programacion.pec1.eduardoVieira;

public class Colegio {
	private String nombre;
	private String direccion;
	private Aula[] aulas;
	
	private int numAulas;
	
	public Colegio(String nombre, String direccion, int numAulas) {
		this.nombre = nombre;
		this.direccion = direccion;
		
		crearAulas(numAulas);
		
	}
	
	private void crearAulas(int numAulas) {
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
				if(aulas[x].getAsiento(z) != null) {
					continue;
				}else {
					aulas[x].setAsiento(z, alumno);
					System.out.println("Alumno " + alumno.getNombre() + " " + alumno.getApellidos() + "\nDNI: " + 
					alumno.getDni() + "\nAsignado el asiento " + (z+1) + "/3 de la clase " + (x+1) + "\n" );
					asignado = true;
					break;
				}
			}
		}
		
	}
	
	public int getAulaPlanta(int aula) {
		return aulas[aula].getPlanta();
	}
	
	public void printAlumnos(int aula) {
		for(int x=0;x<3;x++) {
			if(aulas[aula].getAsiento(x) != null) {
				System.out.println(aulas[aula].getAsiento(x).getNombre());
			}else {
				System.out.println("asiento vacio");
			}
		}
	}

}
