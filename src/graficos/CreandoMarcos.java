// 30-07-2018
package graficos;

import javax.swing.*;

public class CreandoMarcos {

	public static void main(String[] args) {
		// CREAR INSTANCIA DE LA CLASE MIMARCO
		miMarco marco1 = new miMarco();
		
		// HACER VISIBLE EL MARCO
		marco1.setVisible(true);
		
		// INDICAR QUE DEBE HACER AL CERRAR EL MARCO1
		marco1.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );

		
	}// FIN DEL METODO main

} // FIN DE LA CLASE CREANDOMARCOS

class miMarco extends JFrame{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	// Constructor
	public miMarco() {
		
		// ESTABLECER EL TAMAÑO DEL miMarco
		//setSize(500, 300); // ANCHURA, ALTURA
		
		// ESTABLER LA UBICACION DE ESTE JFRAME
		//setLocation(500, 300); // COORDENAD_X, COORDENADA_Y
		
		// ESTABLECE EN UN SOLO METODO
		setBounds(500, 300, 500, 300); // X, Y, ANCHURA, ALTURA
		
		// PERMITIR QUE PUEDA SER REDIMENSIONAR O NO
		//setResizable(false);
		
		// ESTABLEE EL FRAME EN SU MAYOR TAMAÑO
		//setExtendedState(Frame.MAXIMIZED_BOTH);
		
		setTitle("Creando Marcos - básico");
		
	}// FIN DEL CONSTRUCTOR
	
}// FIN DE LA CLASE miMarco