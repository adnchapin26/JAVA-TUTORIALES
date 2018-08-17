// 08-08-2018

package graficos;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class PruebaEventos {

	public static void main(String[] args) {
		
		MarcoConBotones mimarco = new MarcoConBotones();
		
		mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		mimarco.setVisible(true);
		

	}

}

class MarcoConBotones extends JFrame{
	private static final long serialVersionUID = 1L;
	
	// CONSTRUCTOR
	public MarcoConBotones() {
		setTitle("Botones y Eventos");
		setBounds(400, 200, 500, 300); // X, Y, ANCHURA, ALTURA
		
		// CREAMOS UNA INSTANCIA DE LA CLASE LAMINA
		LaminaBotones miLamina = new LaminaBotones();
		
		// AGREGAR UNA LAMINA AL MARCO
		add(miLamina);
				
	}// FIN DLE CONSTRUCTOR
	
}// FIN DE LA CLASE MarcoConBotones
				
class LaminaBotones extends JPanel{
	private static final long serialVersionUID = 1L;
	// CREAMOS UN BOTON
	JButton botonAzul = new JButton("Azul"); // EN EL CONSTRUCTOR, RECIBE EL TEXTO AL BOTON
	JButton botonAmarillo = new JButton("Amarillo"); // EN EL CONSTRUCTOR, RECIBE EL TEXTO AL BOTON
	JButton botonRojo = new JButton("Rojo"); // EN EL CONSTRUCTOR, RECIBE EL TEXTO AL BOTON	
	
	// CONSTRUCTOR
	public LaminaBotones() {
		add(botonAzul);
		add(botonAmarillo);
		add(botonRojo);
		
		// CREAMOS INSTANCIA DE LA CLASE INTERNA
		ColorFondo azul = new ColorFondo(Color.BLUE);
		ColorFondo amarillo = new ColorFondo(Color.YELLOW);
		ColorFondo rojo = new ColorFondo(Color.RED);
		
		botonAzul.addActionListener( azul ); // EN EL PARENTESIS, VA EL OBJETO OYENTE
		botonAmarillo.addActionListener( amarillo );
		botonRojo.addActionListener( rojo );
		
	}// FIN DEL CONSTRUCTOR
	
	// CLASE INTERNA
	private class ColorFondo implements ActionListener{
		private Color colorDeFondo; 

		// COSNTRUCTOR
		public ColorFondo(Color c) {
			colorDeFondo = c;
		}// FIN DEL CONSTRUCTOR

		// MÉTODO QUE DEBEMOS DECLARAR, AL IMPLEMENTAR LA INTERFAZ ActionListener
		@Override
		public void actionPerformed(ActionEvent e) {
			setBackground(colorDeFondo);
		}// FIN DEL MÉTODO actionPerformed

	}// FIN DE LA CLASE INTERNA: ColorFondo 

}// FIN DE LA CLASE LaminaBotones
