// 05-08-2018

package graficos;

import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class EscribiendoEnMarco {

	public static void main(String[] args) {
		
		MarcoConTexto ventana = new MarcoConTexto();
		
		ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		

	}// FIN DEL main

}// FIN DE LA CLASE ESCRIBIENDOENMARCO

class MarcoConTexto extends JFrame{
	
	private static final long serialVersionUID = 1L;

	public MarcoConTexto() {
		setVisible(true);
		setSize(600, 400);
		setLocation(400, 200);
		setTitle("Primer marco con Texto");
		
		Lamina miLamina = new Lamina(); // INSTANCIAMOS DE LA CLASE LAMINA
		
		add(miLamina); // AGREGAMOS LA LAMINA AL MARCO
		
	}// FIN DEL CONSTRUCTOR
	
}// FIN DE LA CLASE MARCOCONTEXTO


class Lamina extends JPanel{
	
	private static final long serialVersionUID = 1L;

	public void paintComponent(Graphics g) {
		// LLAMAR AL PAINTCOMPONENTE DE LA CLASE PADRE
		super.paintComponent(g);

			// drawString(String TEXTO, int coordenada_x, int coordenada_y) 
		g.drawString("HOLA MUNDO", 100, 100); // DIBUJA UN TEXTO
		
	}// FIN DEL METODO paintComponent
}// FIN DE LA CLASE LAMINA
