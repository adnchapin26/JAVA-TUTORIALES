// 06-08-2018


package graficos;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class TrabajandoConFuentes {

	public static void main(String[] args) {
		MarcoConFuentes miMarco = new MarcoConFuentes();
		
		
		miMarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		miMarco.setVisible(true);

	}

}


class MarcoConFuentes extends JFrame{
	private static final long serialVersionUID = 1L;

	public MarcoConFuentes() {
		setTitle("Marco con fuentes");
		setSize(400, 400);
		
		LaminaConFuentes miLamina = new LaminaConFuentes();
		
		add(miLamina);
		
		// ESTABLER COLOR FRONTAL DE TODOS LOS ELEMENTOS
		miLamina.setForeground(Color.BLUE);
	}
}

class LaminaConFuentes extends JPanel{
	private static final long serialVersionUID = 1L;

	public void paintComponent(Graphics g) {
		super.paintComponent( g );
		
		// CASTING DE G A G2 (Graphics2D)
		Graphics2D g2 = (Graphics2D) g;
		
		// CREAMOS INSTANCIA DE LA CLASE FONT
		Font miFuente = new Font("Arial Black", Font.BOLD, 24); // String name, int style, int size
		g2.setFont(miFuente); // ESTABLECER LA FUENTE A LA LAMINA
		// g2.setColor(Color.BLUE);
		g2.drawString("Marcos Lopez", 100, 100);
		
		
		g2.setFont(new Font("Arial", Font.ITALIC, 14) );
		// g2.setColor(new Color(150, 60, 40) );
		g2.drawString("Universidad Mariano Galvez", 40, 200);
		
		
	}
}