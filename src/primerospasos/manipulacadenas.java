package primerospasos;

import javax.swing.plaf.synth.SynthSpinnerUI;

public class manipulacadenas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String nombre="Mauricio"; // en char son '' y en string "
		
		System.out.println("MI NOMBRE ES :  "+nombre);
		
		System.out.println("MI NOMBRE TIENE  : "+nombre.length()+ " LETRAS");
		
		System.out.println("LA PRIMERA LETRA DE MI NOMBRE ES ES :  " + nombre.charAt(0));
		
		//ULTIMA LETRA
		
		int ultima_letra;//variable para almacenar ultima letra
		ultima_letra=nombre.length();// cuenta el total de letras con length   en este caso seria 4
		
		System.out.println("LA ULTIMA LETRA ES  " +nombre.charAt(ultima_letra-1)); // -1 porque java empieza desde 0
			
		
	}

}
