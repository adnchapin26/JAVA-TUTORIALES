// 28-07-2018

package poo;

import java.util.Date;
import java.util.GregorianCalendar;

public class UsoPersona {

	public static void main(String[] args) {
		// CREAMOS UN ARREGLO DE OBJETO DE PERSONA
		Persona[] personas = new Persona[2]; // INSTANCIAMOS UN ARREGLO DE ARREGLO CLASE PERSONA
		
		// INSTANCIAMOS UNA CLASE DE EMPLEADO2 EN LA CLASE PERSONAS
		personas[0] = new Empleado2("Marcos Lopez", 5000, 2018, 7, 28);
		// INSTANCIAMOS UNA CLASE DE ALUMNO EN LA CLASE PERSONAS
		personas[1] = new Alumno("Xavier Garcia", "Ingeniería en Sistemas");
		

		for ( Persona x : personas) {
			System.out.println( x.getNombre() );
			
			// SEGUN EL OBJETO, ACTUARA DE UNA FORMA U OTRA, YA QUE ES UN MÉTODO ABSTRACTO
			System.out.println( x.dame_descripcion() );
			
			System.out.println();
		}
		

	} // FIN DEL main

} // FIN DE LA CLASE UsoPersona

abstract class Persona{
	// ATRIBUTOS
	private String nombre;
	
	// CONSTRUCTOR
	public Persona(String nombre) {
		this.nombre = nombre;
	}
	
	// GETTER
	public String getNombre() {
		return nombre;
	}
	
	// MÉTODO ABSTRACTO: // SE DEBE DEFINIR EN LAS CLASES HIJAS
	public abstract String dame_descripcion(); // UN METODO ABSTRACTO NO SE CONSTRUYE EN LA CLASE ABSTRACTA
	
	
}

class Empleado2 extends Persona{
	private double sueldo;
	private Date altaContrato; // PARA ALMACENAR EL DATO QUE RETORNA DE .getTime() DE UN OBJETO DE GregorianCalendar  
	private static int IdSiguiente = 1;
	private int Id;
	
	// MÉTODO CONSTRUCTOR
	public Empleado2(String nombre, double sueldo, int anio, int mes, int dia) { // METODO CONSTRUCTOR
		super(nombre); // LLAMAMOS AL METODO CONSTRUCTO DE LA SUPER CLASE (CLASE PERSONA
		
		this.sueldo = sueldo;
		GregorianCalendar calendario = new GregorianCalendar(anio, (mes-1), dia); // LLAMAMOS AL CONTRUCTOR;
		this.altaContrato = calendario.getTime(); // DEVUELVE LA FECHA
		
		//  CADA VEZ QUE CREAMOS ASIGNAMOS EL ID RESPECTIVO AL EMPLEADO, E INCREMENTAMOS AL ID STATIC
		Id = IdSiguiente;
		IdSiguiente++;
			
	}
	
	// GETTERS
	public double getSueldo() {
		return sueldo;
	}
	
	public Date getFechaContrato() {
		return altaContrato;
	}
	
	public int getID() {
		return Id;
	}
	
	// SETTERS
	public void setSueldo(double porcentaje) {
		double aumento = sueldo * (porcentaje / 100);  // AUMENTA EL SUELDO A UN PORCENTAJE INDICADO
		sueldo += aumento; // APLICAR EL ALUMNO A SUELDO
	}	
	
	// ¡ OBLIGATORIO ! NECESITAMOS DEFINIR LA CLASE ABSTRACTA HEREDADA DE LA CLASE PERSONA
	public String dame_descripcion() {
		return "Este empleado, tiene un Id: " + Id + " con un sueldo de: " + sueldo;
	}
}

class Alumno extends Persona{
	// ATRIBUTOS
	private String carrera;
	
	// MÉTODO CONSTRUCTOR
	public Alumno(String nombre, String carrera) {
		super(nombre); // LLAMAMOS AL CONSTRUCTO DE LA SUPER CLASE ( CLASE PERSONA)
		this.carrera = carrera;
	}
	
	// ¡ OBLIGATORIO ! NECESITAMOS DEFINIR LA CLASE ABSTRACTA HEREDADA DE LA CLASE PERSONA 
	public String dame_descripcion() {
		return "Este alumno esta estudiando la carrera de: " + carrera;
	}
	
}