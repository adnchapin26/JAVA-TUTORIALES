import javax.swing.JOptionPane;

// 25-07-2018

public class EntradaNumeros {

	public static void main(String[] args) {
		// double x = 10000.0;
		
			// PRINTF: IMPRIME CON FORMATO
				// %1.2f: IMPRIME UN NUMERO FLOTANTED (DOUBLE) CON DOS NUMEROS DESPUES DEL PUNTO
		// System.out.printf("%1.2f", (x/3) );
		
		double num1 = Double.parseDouble(JOptionPane.showInputDialog("Introduce un numero: "));
		
		System.out.printf("La raiz de %.2f es: %.2f", num1, Math.sqrt(num1));
		
	}

}
