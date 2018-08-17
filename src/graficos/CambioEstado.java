// 09-08-2018

package graficos;

import java.awt.Frame;
import java.awt.event.WindowEvent;
import java.awt.event.WindowStateListener;

import javax.swing.JFrame;

public class CambioEstado {

	public static void main(String[] args) {
		MarcoEstado miMarco = new MarcoEstado();
		
		miMarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

}

class MarcoEstado extends JFrame{
	private static final long serialVersionUID = 1L;

	// MÉTODO CONSTRUCTOR
	public MarcoEstado() {
		setVisible(true);
		setBounds(300, 200, 500, 350);
		
		// AGREGAMOS EL MÉTODO PARA ESTAR ATENTO A UN CAMBIO DE ESTADO DE VENTANA
		addWindowStateListener( new CambiaEstado() );
	}
	
}

/* CLASE PARA CONTROLAR EL CAMBIO DE ESTADO DE UNA VENTANA, DEBEMOS IMPLEMENTAR
 * LA INTERFAZ WindowStateLister. */
class CambiaEstado implements WindowStateListener{
	
	@Override
	public void windowStateChanged(WindowEvent e) {
		// System.out.println("La ventana ha cambiado de estado.");
		
		if ( e.getNewState() == Frame.MAXIMIZED_BOTH )
			System.out.println("La ventana ha sido maximizado.");
		else if ( e.getNewState() == Frame.NORMAL)
			System.out.println("La ventana esta en su estado normal.");
		else if ( e.getNewState() == Frame.ICONIFIED )
			System.out.println("La ventana ha sido minimizada.");
		
	}
}