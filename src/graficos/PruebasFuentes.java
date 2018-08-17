// 06-08-2018

package graficos;

import java.awt.GraphicsEnvironment;

import javax.swing.JOptionPane;

public class PruebasFuentes {

	private static int contador;

	public static void main(String[] args) {
		setContador(1);
		
		// PARA ALMACENAR EL NOMBRE DE LAS FUENTES DEL S.O
		String[] nombreDeFuentes = GraphicsEnvironment.getLocalGraphicsEnvironment().getAvailableFontFamilyNames();

		String fuente = JOptionPane.showInputDialog("Introduce el nombre de la fuente: ");
		boolean existeFuente = false;
		
		
		// RECORRER EL ARREGLO
		for (String x : nombreDeFuentes) {
			// System.out.printf("%10s\t%s\n", contador++, x); // IMPRIMIR EL NOMBRE DE LAS FUENTES
			
			if ( x.equals(fuente) )
				existeFuente = true;
			
		}
		
		
		if ( existeFuente )
			System.out.println("La fuente se encuentra instalada.");
		else
			System.out.println("La fuente no está instalada.");
			

	}

	public static int getContador() {
		return contador;
	}

	public static void setContador(int contador) {
		PruebasFuentes.contador = contador;
	}

}
