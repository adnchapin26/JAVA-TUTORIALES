import java.util.Scanner;

import javax.swing.JOptionPane;

public class Areas {

	private static Scanner entrada;

	public static void main(String[] args) {
		entrada = new Scanner(System.in);
		
		System.out.print("Elige una opci�n: \n"
				+ "1. Cuadradado \n"
				+ "2. Rect�ngulo \n"
				+ "3. Tri�ngulo \n"
				+ "4. Circulo \n"
				+ "Indique su opcion: ");
		
		int figura = entrada.nextInt();
		
		System.out.println();
		
		switch (figura) {
			case 1: // CUADRADO
				float lado = Float.parseFloat(JOptionPane.showInputDialog("Introduce el lado: "));
				
				System.out.printf("El area del cuadrado es %.2f ", Math.pow(lado, 2));
				
				break;
			case 2: // RECT�NGULO
				float base = Float.parseFloat(JOptionPane.showInputDialog("Introduce la base: "));
				float altura = Float.parseFloat(JOptionPane.showInputDialog("Introduce la altura: "));
				
				System.out.printf("El area del rectangulo es: %.2f", (base*altura));
				
				break;	
			case 3: // TRI�NGULO
				base = Float.parseFloat(JOptionPane.showInputDialog("Introduce la base: "));
				altura = Float.parseFloat(JOptionPane.showInputDialog("Introduce la altura: "));
				
				System.out.printf("El area del triangulo es: %.2f", (base*altura)/2);
				
				break;
				
			case 4: // CIRCULO
				float radio = Float.parseFloat(JOptionPane.showInputDialog("Introduce la radio: "));
				
				System.out.printf("El area del circulo es: %.2f", (Math.PI * ( Math.pow(radio, 2) )) );
				break;
		
			default:
				System.out.println("\tLa opcion no es correcta.");
		}// FIN DEL SWITCH
		

	}

}
