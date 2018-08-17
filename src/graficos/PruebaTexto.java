// 16-08-2018

package graficos;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class PruebaTexto {

	public static void main(String[] args) {

		MarcoTexto mimarco = new MarcoTexto();
		mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		mimarco.setVisible(true);

	}// FIN DEL MÉTODO main

}// FIN DE LA CLASE PruebaTexto

class MarcoTexto extends JFrame{
	private static final long serialVersionUID = 1L;
	
	// CONSTRUCTOR
	public MarcoTexto() {
		setBounds(100, 200, 600, 350);
		
		LaminaTexto milamina = new LaminaTexto();
		
		add(milamina);
		
		setVisible(true);
	}// FIN DEL CONSTRUCTOR
	
}// FIN DE LA CLASE MarcoTexto

class LaminaTexto extends JPanel{
	private static final long serialVersionUID = 1L;
	JTextField campo1;
	private JLabel resultado;
	
	// CONSTRUCTOR
	public LaminaTexto() {
		
		setLayout(new BorderLayout() ); // INDICAR QUE LA LAMINA TENDRA UNA DISPOSICION BorderLayout
		
		JPanel milamina2 = new JPanel();
		milamina2.setLayout(new FlowLayout());
		
		JLabel texto = new JLabel("Email:");
		milamina2.add(texto);	
				
		campo1 = new JTextField(20); // TEXTO, TAMAÑO COLUMNA		
		milamina2.add(campo1); // AGREGA EL CAMPO A LA LAMINA

		resultado = new JLabel("", JLabel.CENTER); // TEXTO, ALINEACION HORIZONTAL
		add(resultado, BorderLayout.CENTER);
		
		JButton miBoton = new JButton("Comprobar");
		milamina2.add(miBoton); // AGREGAR EL BOTON A LA LAMINA
		
		miBoton.addActionListener( new DameTexto() ); // PONER EN ESCUCHA AL BOTON
		
		add(milamina2, BorderLayout.NORTH);
		
	}// FIN DEL CONSTRUCTOR
	
	private class DameTexto implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			int correcto = 0; // CONTEO DE '@'
			String email = campo1.getText().trim(); // trim(): QUITA LOS ESPACIOS ADICIONALES
			
			for ( int i = 0; i < email.length() ; i++ ) {
				if ( email.charAt(i) == '@') { // charAt(int): RETORNAR EL VALOR DE UN INDICE
					correcto++;
				}
			}
			
			if ( correcto != 1) {
				resultado.setText("Email incorrecto.");
			}else {
				resultado.setText("Email correcto.");
			}
			
		}
		
	}// FIN DE LA CLASE DameTexto
	
}// FIN DE LA CLASE LaminaTexto