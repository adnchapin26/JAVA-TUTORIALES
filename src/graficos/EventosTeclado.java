// 12-08-2018

package graficos;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;

public class EventosTeclado {

	public static void main(String[] args) {
		MarcoConTeclas miVentana = new MarcoConTeclas();
		
		miVentana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		miVentana.setVisible(true);

	}

}// FIN DE LA CLASE EventosTeclado

class MarcoConTeclas extends JFrame{
	private static final long serialVersionUID = 1L;

	// CONSTRUCTOR
	public MarcoConTeclas() {
		setVisible(true);
		setBounds(300, 100, 600, 450);
		
		this.addKeyListener( new EventoTecla() );
	
	}// FIN DEL CONSTRUCTOR
	
	
}// FIN DE LA CLASE MarcoConTeclas

// IMPLEMENTAMOS LA INTERFAZ KeyListener
class EventoTecla implements KeyListener{

	@Override
	public void keyPressed(KeyEvent e) {
		int tecla = e.getKeyCode();
		System.out.print("El valor de la tecla presionada es: " + tecla );	
	}

	@Override
	public void keyReleased(KeyEvent e) {
		
	}

	@Override
	public void keyTyped(KeyEvent e) {
		char tecla = e.getKeyChar();
		System.out.println(" = " + tecla);
	}
	
}// FIN DE LA CLASE EventoTecla