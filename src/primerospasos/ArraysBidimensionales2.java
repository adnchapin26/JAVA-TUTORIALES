// 26-07-2018

public class ArraysBidimensionales2 {

	public static void main(String[] args) {
		// DECLARACION E INICIALIZACION DE UNA MATRIZ
		int[][] matriz = {
				{10, 15, 18, 19, 21},
				{5, 25, 37, 41, 15},
				{7, 19, 32, 14, 90},
				{85, 2, 7, 40, 27}
		};
		
		// RECORRER UNA MATRIZ
		for (int i = 0; i < 4; i++) { // RECORRE LAS FILAS
			for (int j = 0; j < 5; j++) { // RECORRE LAS COLUMNAS
				System.out.print(matriz[i][j] + " ");
			}
			System.out.println();
		}
		
		// RECORRER LA MATRIZ BIDIMENSIONAL CON EL BUCLE FOR EACH
		System.out.println("\nRecorriendo la matriz mediante for each");
		for ( int[] fila : matriz) { // LEE LAS FILAS
			for (int columna : fila) { // ASIGNA A X, LAS COLUMNAS DE ESA FILA
				// COLUMNA TIENE ALMACENADO EL VALOR DE LA FILA Y EL INDICE DE LA COLUMNA
				System.out.print(columna + " ");
			}
			System.out.println();
		}
		

	}

}
