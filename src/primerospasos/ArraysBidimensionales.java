// 25-07-2018

public class ArraysBidimensionales {

	public static void main(String[] args) {
		/*
		 * RECORDAR:
		 * LOS INDICES DE LA MATRIZ LUEGO DE SU CREACIÓN,
		 * DEBES ACCEDER MEDIANTE SU INDICE HASTA n-1
		 */
		
		// CREACION DE UNA MATRIZ DE 4 FILAS Y 5 COLUMNAS
		int[][] matriz = new int[4][5];
		
		
		// RELLENANDO LA MATRIZ
		matriz[0][0] = 1;
		matriz[0][1] = 2;
		matriz[0][2] = 3;
		matriz[0][3] = 4;
		matriz[0][4] = 5;
		
		matriz[1][0] = 14;
		matriz[1][1] = 26;
		matriz[1][2] = 34;
		matriz[1][3] = 45;
		matriz[1][4] = 57;
		
		matriz[2][0] = 13;
		matriz[2][1] = 24;
		matriz[2][2] = 36;
		matriz[2][3] = 47;
		matriz[2][4] = 58;
		
		matriz[3][0] = 14;
		matriz[3][1] = 25;
		matriz[3][2] = 37;
		matriz[3][3] = 43;
		matriz[3][4] = 52;
		
		// RECORRER TODA LA MATRIZ
		for (int fila = 0; fila < 4; fila++ ) { // RECORRE LAS FILAS
			for (int columna = 0; columna < 5; columna++ ) { // RECORRE LAS COLUMNAS
				System.out.println("["+fila+"]["+columna+"]: " + matriz[fila][columna]);
			}
			System.out.println(); // SALTO DE LINEA, LUEGO DE IMPRIMRI UNA COLUMAN COMPLETA
		}
		

	}

}
