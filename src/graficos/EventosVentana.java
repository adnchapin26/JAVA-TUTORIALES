// 09-08-2018

package graficos;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JFrame;

public class EventosVentana {

	public static void main(String[] args) {
		
		MarcoVentana miMarco = new MarcoVentana();
			miMarco.setTitle("Ventana 1");
			miMarco.setBounds(200, 200, 500, 350);
		MarcoVentana miMarco2 = new MarcoVentana();
			miMarco2.setTitle("Ventana 2");
			miMarco2.setBounds(800, 200, 500, 350);

			// EXIT_ON_CLOSE: AL DAR CLIC EN LA "X" FINALIZAR LA EJECUCIÓN DE LA APLICACIÓN
		miMarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			/// DISPOSE_ON_CLOSE: SOLO CERRARÁ LA SEGUNDA VENTANA, SIN TERMINAR LA APLICACIÓN
		miMarco2.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		
	}

}


class MarcoVentana extends JFrame{
	private static final long serialVersionUID = 1L;

	public MarcoVentana() {
		// setTitle("Respondiendo");
		// setBounds(300, 300, 500, 350);
		setVisible(true);
		
		/*
		M_Ventana oyente_ventana = new M_Ventana();		
		addWindowListener(oyente_ventana); // INDICAR A MarcoVentana ESTE A LA ESCUCHA
		*/
		
		// NOS AHORRAMOS LA INSTANCIA, DIRECTAMENTE LA INSTANCIAMOS
		addWindowListener( new M_Ventana() ); 
	}
}


		
			/* NOS PERMITE HEREDER LOS METODOS DE LA CLASE INTERFAZ WindowListener,
			 * POR LO QUE NO NECESITAREMOS SOBRE-ESCRIBIR LOS METODOS DE WindowListener
			 */
class M_Ventana extends WindowAdapter{
	// LOS PODEMOS OMITIR, PORQUE SOLAMENTE ESTAMOS HEREDANDO METODOS DE WindowAdapter,
	// Y NO DE WindowListenr
/*
	@Override
	public void windowActivated(WindowEvent e) {
		System.out.println("Ventana Activada.");
	}
	
	@Override
	public void windowClosed(WindowEvent e) {
		System.out.println("La ventana ha sido cerrada.");
	}

	@Override
	public void windowClosing(WindowEvent e) {
		System.out.println("Cerrando Ventana...");
	}

	@Override
	public void windowDeactivated(WindowEvent e) {
		System.out.println("Ventana Desactivada.");
	}

	@Override
	public void windowDeiconified(WindowEvent e) {
		System.out.println("Ventana Restaurada.");
	}
*/
	@Override
	public void windowIconified(WindowEvent e) {
		System.out.println("Ventana Minimazada.");
	}

	@Override
	public void windowOpened(WindowEvent e) {
		System.out.println("Ventana abierta.");
	}

}