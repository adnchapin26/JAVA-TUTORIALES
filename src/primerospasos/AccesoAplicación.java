// 25-07-2018
import javax.swing.*;

public class AccesoAplicación {

	public static void main(String[] args) {
		String clave_correcta = new String("Marcos");
		String clave_usuario = "";
		
		// MIENTRA LA CLAVE NO SEA LA CORRECTA
		while ( clave_correcta.equals(clave_usuario) == false ) {
			clave_usuario = JOptionPane.showInputDialog("Introdue la contraseña: ");
			
			if ( clave_correcta.equals(clave_usuario) == false) {
				System.out.println("Contraseña incorrecta.");
			}
		}
		
		System.out.println("Contraseña correcta. Acceso permitido.");

	}

}
