// 27-07-2018

package poo;

// import javax.swing.JOptionPane;

public class UsoVehiculo {

	public static void main(String[] args) {
/*
		Coche micoche = new Coche(); // INSTANCIAR UNA CLASE ( EJEMPLAR DE CLASE )
		
		System.out.println(micoche.dime_datos_generales());
		
		System.out.println("\nModificando el atributo color del coche: ");
		micoche.setColor( JOptionPane.showInputDialog("Ingrese el color del coche: ") );
		System.out.println(micoche.dime_color());
		
		System.out.println();
		micoche.setAsientos( JOptionPane.showInputDialog("¿Tiene asientos de cuero? ") );
		System.out.println(micoche.dime_asientos());
		micoche.setClimatizador( JOptionPane.showInputDialog("¿Tiene aire acondicionado? ") );
		System.out.println(micoche.dime_climatizador());
		
		System.out.println();
		System.out.println(micoche.dime_peso_coche());
		System.out.println("El precio total del coche es: " + micoche.precio_coche());
*/
		// CREAR INSTANCIAS DE CLASES
		Coche miCoche1 = new Coche();
		Furgoneta miFurgoneta1 = new Furgoneta(7, 580);

		miCoche1.setColor("Rojo");
		
		// ACCEDER METODOS HEREDADOS DE LA CLASE COCHE
		miFurgoneta1.setColor("Azul");
		miFurgoneta1.setAsientos("Si");
		miFurgoneta1.setClimatizador("Si");
		
		System.out.println(miCoche1.dime_datos_generales() + " " + miCoche1.dime_color() );
		System.out.println();
		System.out.println(miFurgoneta1.dime_datos_generales());
		System.out.println(miFurgoneta1.dimeDatosFurgoneta());
	}

	
}
