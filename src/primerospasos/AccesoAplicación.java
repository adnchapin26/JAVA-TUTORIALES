// 25-07-2018
import javax.swing.*;

public class AccesoAplicaci�n {

	public static void main(String[] args) {
		String clave_correcta = new String("Marcos");
		String clave_usuario = "";
		
		// MIENTRA LA CLAVE NO SEA LA CORRECTA
		while ( clave_correcta.equals(clave_usuario) == false ) {
			clave_usuario = JOptionPane.showInputDialog("Introdue la contrase�a: ");
			
			if ( clave_correcta.equals(clave_usuario) == false) {
				System.out.println("Contrase�a incorrecta.");
			}
		}
		
		System.out.println("Contrase�a correcta. Acceso permitido.");

	}

}
