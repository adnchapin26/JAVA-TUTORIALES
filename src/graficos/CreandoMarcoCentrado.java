// 05-08-2018

package graficos;

import java.awt.Dimension;
import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.JFrame;

public class CreandoMarcoCentrado {

	public static void main(String[] args) {
		MarcoCentrado miVentana = new MarcoCentrado();
		
		miVentana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		miVentana.setVisible(true);
	}
}


class MarcoCentrado extends JFrame{

	private static final long serialVersionUID = 1L;

	public MarcoCentrado() {
		// ALMACENAR EL MEDIO POR DONDE SE ESTA EJECUTANDOE EL PROGRAMA
		Toolkit miPantalla = Toolkit.getDefaultToolkit();
		
		// PROPORCIONA EL TAMAÑO DE LA VENTANA
		Dimension tamPantalla = miPantalla.getScreenSize();
		
		// EXTRAER EL ANCHO Y ALTURA DE LA PANTALLA
		int anchoPantalla = tamPantalla.width; // OBTENER LA ANCHURA DE LA PANTALLA
		int alturaPantalla = tamPantalla.height; // OBTENER LA ALTURA DE LA PANTALLA

		// ESTABLECER EL TAMAÑO DE LA VENTANA
		setSize(anchoPantalla/2, alturaPantalla/2);
		// COLOCAR EL JFRAME EN EL CENTRO
		setLocation(anchoPantalla/4, alturaPantalla/4);
		
		setResizable(false); // NO PERMITIR MAXIMIZAR
		setTitle("Marco centrado");
		
		// CONOCER UN ICONO
		Image miIcono = miPantalla.getImage("src/graficos/icono1.png");
		setIconImage(miIcono); // ESTABLECER EL ICONO AL JFRAME		
	} // FIN DEL CONSTRUCTOR
	
}