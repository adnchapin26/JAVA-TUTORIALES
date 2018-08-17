// 27-07-2018

package poo;

import java.util.Arrays;
import java.util.Date;
import java.util.GregorianCalendar;


public class UsoEmpleado {

	public static void main(String[] args) {
		Jefatura jefe_RRHH = new Jefatura("Marcos Lopez", 6500, 2018, 6, 12);
		jefe_RRHH.setIncentivo(1200.5);
		
		Empleado[] empleados = new Empleado[5]; // ARREGLO DE 4 ESPACIOS
		empleados[0] = new Empleado("Carlos Perez", 3000, 2018, 07, 28);
		empleados[1] = new Empleado("Dennis Lopez", 2400.7, 2018, 05, 11);
		empleados[2] = new Empleado("Juan Ramos");
			/*--- 	POLIMORFISMO EN ACCIÓN  ---*/
		empleados[3] = jefe_RRHH; 
		empleados[4] = new Jefatura("Jorge Perez", 4500, 2018, 11, 8);
		
		// REFUNDICION DE UN OBJETO A OTRO ( CASTING DE UN OBJETO )
		Jefatura jefa_Finanzas = (Jefatura) empleados[4];
		jefa_Finanzas.setIncentivo(2500);		
		
		System.out.println( jefa_Finanzas.tomar_decision("Dar más días de vacaciones a los empleados.\n") );
		System.out.println("Estableciendo bonus: ");
		System.out.println("Nombre jefa: " + jefa_Finanzas.getNombre() + "\nBonus: " + jefa_Finanzas.establece_bonus(500) );
		System.out.println("\nNombre empleado: " + empleados[1].getNombre() + "\nBonus: " + empleados[1].establece_bonus(200));
		
		
		System.out.println("\n");
		// UTILIZANDO EL FOR TRADICIONAL PARA RECORRER EL ARREGLO
		for (int i = 0; i < empleados.length; i++ ) {
			empleados[i].setSueldo(5); // IMCREMENTA UN 5 % EL SUELDO DE CADA EMPLEADO
		}
		
		
		// ORDENAR EL ARREGLO DE OBJETOS
		Arrays.sort(empleados);

		
		// RECORRER EL ARREGLO, UTILIZANDO EL FOR MEJORADO
		for ( Empleado x : empleados ) {
			System.out.println("ID: " + x.getID() );
			System.out.println("Nombre: " + x.getNombre() );
			System.out.printf("Sueldo: Q. %.2f\n", x.getSueldo() );
			System.out.println("Fecha de alta: " + x.getFechaContrato() );
			System.out.println();
		}
		
		// APUNTAMOS A null, LA INSTANCIA DE LA CLASE, PARA QUE EL RECOGEDOR DE BASURA, LO PUEDA ELIMINAR
		empleados = null;
	}

}

/*
 * AL NO TRABAJAR MODULARMENTE. SOLO UNA CLASE DEBE SER PUBLICA, EL QUE CONTENDRA
 * EL MÉTODO MAIN. (CLASE QUE SE LLAMARA IGUAL AL ARCHIVO "*.java"
 */

class Empleado implements Comparable<Object>, Trabajadores{ // IMPLEMENTAMOS LA INTERFAZ COMPARABLE
	/*
	 * MÉTODOS
	 */	
	// MÉTODO CONSTRUCTOR
	public Empleado(String nombre, double sueldo, int anio, int mes, int dia) { // METODO CONSTRUCTOR
		this.nombre = nombre;
		this.sueldo = sueldo;
		GregorianCalendar calendario = new GregorianCalendar(anio, (mes-1), dia); // LLAMAMOS AL CONTRUCTOR;
		this.altaContrato = calendario.getTime(); // DEVUELVE LA FECHA
		
		//  CADA VEZ QUE CREAMOS ASIGNAMOS EL ID RESPECTIVO AL EMPLEADO, E INCREMENTAMOS AL ID STATIC
		Id = IdSiguiente;
		IdSiguiente++;
			
	}
	
	// MÉTODO CONSTRUCTOR 2
	public Empleado(String nombre) {
		// LLAMA AL CONSTRUCTOR 1
		this (nombre, 1800, 2018, 04, 18); 
	}
	
	// GETTERS
	public String getNombre() {
		return nombre;
	}
	
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
		sueldo += aumento; // APLICAR EL NUEVO SUELDO
	}
	
	// ORDNEAR LAS INSTANCIAS DE LA CLASE POR SUELDO
	public int compareTo(Object miObjeto) {
		
		// REFUNDICION O CASTING
			// TRANSFORMAR miObjeto A UN OBJETO DE LA CLASE EMPLEADO PARA HACER LA COMPARACION
		Empleado otroEmpleado = (Empleado) miObjeto;
		
		// ORDENAR POR MEDIO DE SUELDO
		if (this.Id < otroEmpleado.Id) {
			return -1; // SI EL SUELDO DE UNO ES MENOR QUE OTRO
		}else if ( this.Id > otroEmpleado.Id) {
			return 1; // SU EL SUELDO DE UNO ES MAYOR QUE OTRO
		}else { // SI SON IGUALES
			return 0;
		}
	}
	
	public double establece_bonus(double gratificacion) {		
		return (Trabajadores.bonus_base + gratificacion); 
	}
	
	/*
	 * ATRIBUTOS
	 */
	
	private String nombre;
	private double sueldo;
		// PARA ALMACENAR EL DATO QUE RETORNA DE .getTime() DE UN OBJETO DE GregorianCalendar
	private Date altaContrato;  
	private static int IdSiguiente = 1;
	private int Id;	
}

// final: IMPIDE LA CREACION DE CLASES HIJAS DE LA CLASE JEFATURA ( NO PERMITE QUE HEREDEN DE ELLA)
final class Jefatura extends Empleado implements Jefes{
	/*
	 * MÉTODOS
	 */
	public Jefatura(String nombre, double sueldo, int anio, int mes, int dia) {
		// LLAMA AL CONSTRUCTOR 1 DE LA SUPER CLASE (CLASE EMPLEADO)
		super(nombre, sueldo, anio, mes, dia);
		
	}
	
	// SETTERS
	public void setIncentivo(double incentivo) {
		this.incentivo = incentivo;
	}
	
	// GETTERS
	public double getSueldo() {
						// UTILIZA EL METODO getSueldo() DE LA CLASE PADRE (SUPER CLASE)
		double sueldoJefe = super.getSueldo();
		return sueldoJefe + incentivo;
	}
	
	// DEBEMOS REDEFINIR EL METODO TOMAR_DECISIONES AL IMPLEMENTAR LA INTERFAZ JEFES
	public String tomar_decision(String decision) {
		return "Un miembro de la direccion ha tomado la decision de: " + decision;
	}
	
	// DEBEMOS REDEFINIR EL METODO ESTABECE BONUS AL IMPLEMENTAR LA INTERFAZ JEFES Y
	// HEREDA DE LA INTERFAZ TRABAJADORES
	public double establece_bonus(double gratificacion) {
		double prima = 2000;
		
		return (Trabajadores.bonus_base + prima + gratificacion);
	}
	
	
	
	/*
	 * ATRIBUTOS
	 */
	private double incentivo;
	
}

/*
class Director extends Jefatura{
	// CONSTRUCTOR
	public Director(String nombre, double sueldo, int anio, int mes, int dia) {
		// LLAMAMOS AL CONSTRUCTOR DE LA CLASE PADRE, (JEFATURA)
		super(nombre, sueldo, anio, mes, dia);
	}
}
*/