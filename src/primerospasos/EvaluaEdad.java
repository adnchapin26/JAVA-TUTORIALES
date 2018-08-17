// 25-07-2018

import java.util.Scanner;

public class EvaluaEdad {

	private static Scanner entrada;

	public static void main(String[] args) {
		entrada = new Scanner(System.in);
		
		System.out.print("Ingrese tu edad: ");
		int edad = entrada.nextInt();
		
		if ( edad < 18 ) {
			System.out.println("Eres \"joven\".");
		}else if( edad < 65) {
			System.out.println("Eres \"maduro\".");
		}else {
			System.out.println("Cuidate.");
		}
		
		
		
	}

}
