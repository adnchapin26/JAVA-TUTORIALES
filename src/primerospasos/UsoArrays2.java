// 25-07-2018
import javax.swing.JOptionPane;

public class UsoArrays2 {

	public static void main(String[] args) {
		String[] paises = new String[5];
		
		for (int i = 0; i < paises.length; i++) {
			paises[i] = JOptionPane.showInputDialog("Digite el nombre del pais ["+i+"]: ");
		}

		System.out.println("\nRecorrido con el bucle for each: ");
		int contador = 1;
		for (String i: paises) {
			System.out.println("["+ (contador++) + "]: " + i);
		}
		
		/* GENERAR MATRIZ DE ELEMENTOS ALEATORIOS */
		int[] matriz_aleatorio = new int[100];
		
		// LLENAR LA MATRIZ DE DATOS DE UN RANGO DE 1-100
		for (int i = 0; i < matriz_aleatorio.length; i++ ) {
			matriz_aleatorio[i] = (int) Math.round(Math.random() * (100 + 1));
		}
		
		System.out.println("\nRecorriendo la matriz aleatorio: ");
		contador = 1;
		for (int i : matriz_aleatorio) {
			System.out.println("["+ (contador++) + "]: " + i);
		}
		
	}

}
