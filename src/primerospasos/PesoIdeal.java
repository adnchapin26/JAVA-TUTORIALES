// 25-07-2018

import javax.swing.JOptionPane;

public class PesoIdeal {

	public static void main(String[] args) {
		String genero = new String("");
		
		// EJECUTAR MIENTRAS NO SE ESPECIFUE EL GENERO DEL LA PERSONA
		do {
			genero = JOptionPane.showInputDialog("Ingrese tu genero: (H/M)\n H: Hombre\nM: Mujer");
		}while ( genero.equalsIgnoreCase("H") == false && genero.equalsIgnoreCase("M") == false);

		int altura = Integer.parseInt(JOptionPane.showInputDialog("Introduce tu altura en cm: "));
		
		int pesoIdeal = 0;
		
		// SI ES HOMBRE
		if ( genero.equalsIgnoreCase("H") ) {
			pesoIdeal = altura - 110;
		}else if ( genero.equalsIgnoreCase("M") ) {
			pesoIdeal = altura - 120;
		}
		
		System.out.println("Tu peso ideal es: " + pesoIdeal + " kg.");	
	}

}
