// 25-07-2018
import java.util.*;

public class AdivinarNumero {

	private static Scanner entrada;

	public static void main(String[] args) {
		
		// GENERAR NUMERO ALEATORIO
		int aleatorio = (int) (Math.random() * (100 +1)); // MULTIPLICA POR EL NUEMRO MAXIMO + 1
		
		entrada = new Scanner(System.in);
		
		int numero = 0; // ESTA VARIABLE SERÁ PARA QUE EL USUARIO INGRESE UN NUMERO
		int intentos = 0; // LLEVARA EL CONTROL DE INTENTOS DEL USUARIO HASTA ADIVINAR EL RANDOM
		
		while ( numero != aleatorio ) {
			intentos++; // EN CADA BUCLE, EL CONTADOR AUMENTARÁs
			
			System.out.print("Digite un numero entre (0-100): ");
			numero = entrada.nextInt();
			
			// SI EL NUMERO INGRESADO ES MAYOR AL NUMERO ALEATORIO
			if ( numero > aleatorio ) {
				System.out.println("\tError. El numero aleatorio es menor.");
			}else if ( numero < aleatorio ) {
				// SI EL NUMERO INGRESADO ES MENOR AL NUMERO ALEATORIO
				System.out.println("\tError. El numero aleatorio es mayor.");
			}
			
			// SI ACIERTA EL NUMERO ALEATORIO
			if ( numero == aleatorio ) {
				System.out.println("\tFelicicidaes. ¡Has acertado!");
				System.out.println("\tIntento No. : " + intentos);
			}
		}
	}

}
