// 25-07-2018

public class UsoArrays {

	public static void main(String[] args) {
		// DECLARACIÓN DE UN ARREGLO ENTERO
		/*
		int[] mi_matriz = new int[5];
		// INICILIZAR LOS INDICES, DEL ARREGLO
		mi_matriz[0] = 5;
		mi_matriz[1] = 38;
		mi_matriz[2] = -15;
		mi_matriz[3] = 92;
		mi_matriz[4] = 71;
		*/
		
		// FOMRA CORRECTA PARA INICIALIZAR UN ARREGLO ES EN SU DECLARACION
			// AUTOMATICA RESERVA UN ARREGLO DE TAMAÑO 5
		int[] mi_matriz = {5, 38, -15, 92, 71, 30, 60, 34, 75}; 
		
		
		/*
		// IMPRIMIR INDIVIDUALMENTE CADA INDICE DEL ARREGLO
		System.out.println(mi_matriz[0]);
		System.out.println(mi_matriz[1]);
		System.out.println(mi_matriz[2]);
		System.out.println(mi_matriz[3]);
		System.out.println(mi_matriz[4]);
		*/
		
		// FORMA CORRECTA PARA RECORRER UN ARREGLO
			// length; OBTIENE EL TAMAÑO DEL ARREGLO
		for (int i = 0; i < mi_matriz.length; i++) {
			System.out.println("["+i+"]: " + mi_matriz[i]);
		}
		
		
	}

}
