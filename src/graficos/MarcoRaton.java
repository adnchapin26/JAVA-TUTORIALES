// 12-08-2018

package graficos;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

import javax.swing.JFrame;

public class MarcoRaton {

	public static void main(String[] args) {
		MarcoRaton2 miMarco = new MarcoRaton2();
		
		miMarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);	
	}

}// FIN DE LA CLASE MarcoRaton

class MarcoRaton2 extends JFrame{
	private static final long serialVersionUID = 1L;
	
	// CONSTRUCTOR
	public MarcoRaton2() {
		setVisible(true);
		setBounds(100, 200, 600, 450);
		
		// PONER A LA ESCUCHA, EL MARCO, AL CAPTAR EVENTOS POR EL MOUSE
		addMouseListener( new EventosDeRaton() );
		addMouseMotionListener( new EventosDeRaton2() );
	}
	
}// FIN DE LA CLASE MarcoRaton2

// class EventosDeRaton extends MouseAdapter: NOS AYUDA A NO SOBREESCRIBIR TODOS LOS MÉTODOS DE MouseListener
class EventosDeRaton implements MouseListener{

	@Override
	public void mouseClicked(MouseEvent e) {
		// System.out.println("Has hecho click en la coordenada: (" + e.getX() + ", " + e.getY() + ")" );
		// System.out.println("Has dado: " + e.getClickCount() + " clics seguidos.");
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// System.out.println("Has entrado al marco.");
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// System.out.println("Has salido del marco");
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// System.out.println("Estas de clickeando.");
		
		if ( e.getModifiersEx() == MouseEvent.BUTTON1_DOWN_MASK ) {
			System.out.println("Has pulsado el botón izquierdo.");
		}else if ( e.getModifiersEx() == MouseEvent.BUTTON3_DOWN_MASK ) {
			System.out.println("Has pulsado el botón dereho.");
		}
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// System.out.println("Has dejado de clikear.");
	}
	
}// FIN DE LA CLASE EventosDeRaton

class EventosDeRaton2 implements MouseMotionListener{

	@Override
	public void mouseDragged(MouseEvent arg0) {
		System.out.println("Estas arrastrando.");
	}

	@Override
	public void mouseMoved(MouseEvent arg0) {
		System.out.println("Estas moviendo el mouse.");
	}
	
}