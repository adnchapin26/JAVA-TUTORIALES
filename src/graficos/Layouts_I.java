// 15-08-2018

package graficos;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Layouts_I {

	public static void main(String[] args) {

		Marco_Layout mimarco = new Marco_Layout();
		mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		mimarco.setVisible(true);
		
		
	}// FIN DEL MÉTODO main

}// FIN DE LA CLASE Layouts_I

class Marco_Layout extends JFrame{
	private static final long serialVersionUID = 1L;
	
	// CONSTRUCTOR
	public Marco_Layout() {
		setTitle("Prueba acciones");
		setBounds(200, 100, 600, 300); // X, Y, ANCHURA, ALTURA
		
		Panel_Layout lamina = new Panel_Layout();
		Panel_Layout2 lamina2 = new Panel_Layout2();
		
		// INDICIAR A LA CLASE Marco_Layout, DONDE COLOCAR LAS LAMINAS
		add(lamina, BorderLayout.NORTH);
		add(lamina2, BorderLayout.SOUTH);
		
	}
	
}// FIN DE LA CLASE Marco_Layout

class Panel_Layout extends JPanel{
	private static final long serialVersionUID = 1L;
	
	// CONTRUCTOR
	public Panel_Layout() {
		// setLayout( new FlowLayout( FlowLayout.LEFT, 80, 30 ) ); // ALINEADO, SEPARACION HORIZONTAL, SEPARACION VERTICAL
		setLayout( new FlowLayout(FlowLayout.LEFT) );
		add( new JButton("Amarillo") );
		add(new JButton("Rojo") );
	}
	
}// FIN DE LA CLASE Panel_Layout

class Panel_Layout2 extends JPanel{
	private static final long serialVersionUID = 1L;
	
	public Panel_Layout2() {
		setLayout( new BorderLayout(0, 0) ); // ESPACIO HORIZONTAL, ESPACIO VERTICAL ENTRE CADA COMPONENTE
		
		add(new JButton("Azul"), BorderLayout.WEST);
		add(new JButton("Verde"), BorderLayout.EAST);
		add(new JButton("Negro"), BorderLayout.CENTER);	
	}
}

class Panel_Layout3 extends JPanel{
	private static final long serialVersionUID = 1L;
	
	public Panel_Layout3() {
		
		
	}
	
	
}