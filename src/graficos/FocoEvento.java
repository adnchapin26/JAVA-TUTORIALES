// 12-08-2018

package graficos;

import java.awt.Graphics;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class FocoEvento {

	public static void main(String[] args) {
		MarcoFoco miMarco = new MarcoFoco();
		
		miMarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}

class MarcoFoco extends JFrame{
	private static final long serialVersionUID = 1L;
	
	// METODO CONSTRUCTOR
	public MarcoFoco() {
		setVisible(true);
		setBounds(100, 100, 400, 300); // X, Y; ANCHURA, ALTURA
		
		// AGREGAMOS AL MARCO UNA LAMINA
		this.add( new LaminaFoco() );
		
	}// FIN DEL METODO CONSTRUCTOR
	
}

class LaminaFoco extends JPanel{
	private static final long serialVersionUID = 1L;
	// CREAR DOS CUADROS DE TEXTOS
	JTextField cajaTexto1;
	JTextField cajaTexto2;
	
	public void paintComponent(Graphics g) {
		super.paintComponent(g); // LLAMAR AL METODO DE LA SUPER CLASE, PARA REALIZAR ALGUANS OPERACIONES
		
		this.setLayout(null); // PERMITE COLOCAR LOS ELEMENTOS, DONDE QUERRAMOS
		
		// INSTANCIAR LAS CAJAS DE TEXTO
		cajaTexto1 = new JTextField();
		cajaTexto2 = new JTextField();
		
		cajaTexto1.setBounds(120, 10, 150, 20);// X, Y, ANCHURA, ALTURA
		cajaTexto2.setBounds(120, 50, 150, 20);// X, Y, ANCHURA, ALTURA
		
		this.add(cajaTexto1); // AGREGAR EL COMPONENTE A LA LAMINA
		this.add(cajaTexto2); // AGREGAR EL COMPONENTE A LA LAMINA
		
		// CREAMOS INSTANCIA DE LA CLASE PRIVADA ( CLASE OYENTE)
		cajaTexto1.addFocusListener( new LanzaFocos() );
		
	}	
	
	private class LanzaFocos implements FocusListener{

		@Override
		public void focusGained(FocusEvent e) {
			
		}

		@Override
		public void focusLost(FocusEvent e) {
			String email = cajaTexto1.getText(); // PERMITE CAPTURAR EL TEXTO
			boolean comprobacion = false;
			
			for ( int i = 0; i < email.length(); i++)
				if ( email.charAt(i) == '@' )
					comprobacion = true;
			
			System.out.println( (comprobacion == true) ? 
					"El correo es correcto." : "El correo es invalido." );
		}
		
	}
}

