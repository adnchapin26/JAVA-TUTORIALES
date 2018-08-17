// 26-07-2018

public class EjemploArray2D {

	public static void main(String[] args) {
		// DECLARACION DE VARIABLES
		double acumulado;
		double interes = 0.10; // 10%
		double[][] saldo = new double[6][5]; // TABLA DE 6 FILAS Y 5 COLUMNAS
		
		// REALIZAR LOS CALCULOS
		for (int i = 0; i < 6; i++) { // RECORRIENDO FILAS
			saldo[i][0] = 10000; // ASIGNAR EL VALOR EN LA PRIMERA FILA DE CADA COLUMNA
			acumulado = saldo[i][0];
			
				/* INICIAR EL RECORRIDO DESDE LA SEGUNDA COLUMNA, YA QUE LA PRIMERA COLUMNA
					TIENE EL SALDO INICIAL */
			for (int j = 1; j < 5; j++) { // RECORRIENDO COLUMNAS, 
				acumulado += (acumulado * interes);
				saldo[i][j] = acumulado;
			}
			
			interes += 0.01; // INCREMENTAR EL INTERES EN UN 1%
		}
		
		// IMPRIMIR LA MATRIZ
		for (double[] filas : saldo) {
			for (double columna : filas) {
				System.out.printf("%.2f |", columna);
			}
			System.out.println();
		}

	}

}
