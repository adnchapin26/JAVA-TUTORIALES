// 25-07-2018
import javax.swing.JOptionPane;

public class CompruebaMail {

	public static void main(String[] args) {
		boolean esMail = false;
		boolean hayPunto = false;
		int conteo_arroba = 0;
		
		String mail = JOptionPane.showInputDialog("Introduce tu correo: ");
		
		for (int i = 0; i < mail.length(); i++) {
			// LEER CADA CARACTER DEL MAIL INTRODUCIDO POR EL USUARIO
			if ( mail.charAt(i) == '@') {
				esMail = true;
				conteo_arroba++;
			}
			
			if ( mail.charAt(i) == '.') {
				hayPunto = true;
			}
		}
		
		if ( esMail == true  && conteo_arroba == 1 && hayPunto == true) {
			System.out.println("El correo si tiene un @, si es una dirección de correo.");
		}else if ( esMail == false ){
			System.out.println("El correo introducido no es una dirección correcta.");
		}else if ( hayPunto == false) {
			System.out.println("El correo es incorrecto. No tiene un punto.");
		}else if ( conteo_arroba > 1 ) {
			System.out.println("La direccion de correo es invalida, tiene mas de un @");
		}
		
		

	}

}
