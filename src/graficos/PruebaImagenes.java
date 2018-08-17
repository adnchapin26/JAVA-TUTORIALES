// 06-08-2018

package graficos;

import java.awt.Graphics;
import java.awt.Image;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class PruebaImagenes {

	public static void main(String[] args) {
		MarcoImagen miMarco = new MarcoImagen();
		
		miMarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		miMarco.setVisible(true);

	}

}

class MarcoImagen extends JFrame{

	private static final long serialVersionUID = 1L;
	
	public MarcoImagen() {
		setTitle("Marco con Imagen");
			// COORDNEADA X, COORDENADA Y, ANCHURA, ALTURA 
		setBounds(150, 50, 900, 600);
		
		LaminaConImagen miLamina = new LaminaConImagen();
		
		add(miLamina);
		
	}
	
	
	
}

class LaminaConImagen extends JPanel{
	private static final long serialVersionUID = 1L;
	private Image imagen; // PARA PODER ALMACENAR LA IMAGEN 
	
	public LaminaConImagen() {
		// MANEJO DE EXCEPCION, POR SI NO ENCUENTRA LA IMAGEN
		try {
			
			// ALMACENAR LA RUTA DE LA IMAGEN
			// File miImagen = new File("src/graficos/IMG-20170725-WA0047.jpg");
			
			// CARGAR LA IMAGEN
			// imagen = ImageIO.read( new File("src/graficos/IMG-20170725-WA0047.jpg") );
			// g.drawImage(imagen, 50, 50, null); // Image imagen, int x, int y, ImageObserver observer
			
			imagen = ImageIO.read( new File ("src/graficos/icono1.png") );
		} catch (IOException e) {
			System.out.println("Error. No se pudo cargar la imagen especificada.");
		}
	}
	
	
	public void paintComponent(Graphics g) {
		super.paintComponent(g); // PERMITE QUE CADA VEZ QUE SE REDIMENSIONA, SE ACTUALIZA
		
				
		int anchuraImagen = imagen.getWidth(this); // this: HACE REFERENCIA AL OBJETO QUE ESTAMOS USANDO
		int alturaImagen = imagen.getHeight(this);
		
		g.drawImage(imagen, 0,  0,  null); // PINTA LA PRIMERA IMAGEN
		
		// HACER LA IMAGEN MOSAICO
		for (int x = 0; x < 300; x++) {
			for (int y = 0; y < 200; y++) {
				// ESTO SIRVE PARA NO IMPRIMRI NUEVAMENTE LA IMAGEN, EN LA YA PINTADA
				if ( x + y > 0 ) {
					// COORDENADA X, COORDENADA Y, ANCHO, ALTURA, DESTINO X, DESTINO Y
					g.copyArea(0, 0, anchuraImagen, alturaImagen , anchuraImagen*x, alturaImagen*y);
				}
			}
		}

	}
}