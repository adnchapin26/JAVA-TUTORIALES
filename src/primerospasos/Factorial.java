// 25-07-2018
import javax.swing.*;

public class Factorial {

	public static void main(String[] args) {
		long resultado = 1L;
		
		int numero = Integer.parseInt(JOptionPane.showInputDialog("Digite un numero: "));
		
		// EMPIEZA DESDE EL NUMERO INTRODUCIDA, Y VA DISMINUYENDO HASTA LLEGAR A CERO
		for (int i = numero; i > 0; i--) {
			// IR MULTIPLICANDO POR EL NUMERO ITERADOR, ALMACENANDOLO EN RESULTADO
			resultado *= i;
		}
		
		System.out.println("El factorial de " + numero + " es: " + resultado);

	}

}
