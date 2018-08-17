// 27-07-2018

package poo;

public class Prueba_Final_Static {

	public static void main(String[] args) {
		Empleados trabajador1 = new Empleados("Marcos");
		Empleados trabajador2 = new Empleados("Xavier");
		Empleados trabajador3 = new Empleados("Dennis");
		
		// INTENTAMOS CAMBIAR EL NOMBRE, PERO DARA ERROR YA QUE EL ATRIBUTO NOMBRE ES FINAL
			// UNA VEZ INICIADO EN EL CONSTRUCTOR, YA NO PUEDE MODIFICARSE
		// trabajador1.setNombre("Carlos");

		System.out.println(trabajador1.mostrar_informacion() + "\n\n" +
				trabajador2.mostrar_informacion() + "\n\n" +
				trabajador3.mostrar_informacion());
		System.out.println();
		System.out.println( Empleados.getID() );
		
		
	}

}


class Empleados{
	/*
	 *  ATRIBUTOS
	 */
	private final String nombre;
	private String seccion;
	private int Id_Actual;
	
	private static int Id_Siguiente = 1; // PERTENECE A LA CLASE, PARA ASIGNARLE UN ID A CADA OBJETO
	
	/*
	 *  MÉTODOS
	 */
	public Empleados(String nombre) {
		this.nombre = nombre;
		seccion = "Administración";

		//  CADA VEZ QUE CREAMOS ASIGNAMOS EL ID RESPECTIVO AL EMPLEADO, E INCREMENTAMOS AL ID STATIC
		Id_Actual = Id_Siguiente;
		Id_Siguiente++;
	}
	
	
	/* ESTE SETTER, YA NO FUNCIONA, YA QUE ESTA INTENTADO CAMBIAR EL VALOR DE UN ATRIBUTO "FINAL"
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	*/
	
	public void setSeccion(String seccion) {
		this.seccion = seccion;
	}
	
	public static String getID() {
		return "El Id siguiente es: " + Id_Siguiente;
	}
	
	public String mostrar_informacion() {
		return "ID: " + Id_Actual + "\nNombre: " + nombre + "\nSeccion: " + seccion;
	}
	
}