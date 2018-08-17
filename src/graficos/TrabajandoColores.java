// 06-08-2018

package graficos;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.SystemColor;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Rectangle2D;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class TrabajandoColores {

	public static void main(String[] args) {
		MarcoConColor miMarco = new MarcoConColor();
		
		miMarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		miMarco.setVisible(true);
	}
}


class MarcoConColor extends JFrame{
	
	private static final long serialVersionUID = 1L;

	public MarcoConColor() {
		setTitle("Prueba con colores");
		setSize(400, 400);
		
		LaminaConColor miLamina = new LaminaConColor();
		
		add(miLamina);
		
		// ESTABLECER EL COLOR SEGUN EL S.O. A LA VENTANA
		miLamina.setBackground(SystemColor.window);
		
	}
}

class LaminaConColor extends JPanel{
	
	private static final long serialVersionUID = 1L;

	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		
		Graphics2D g2 = (Graphics2D) g;
		
		// DIBUJO DE RECTÁNGULO
		Rectangle2D rectangulo = new Rectangle2D.Double(100, 100, 200, 150);
		// g2.draw(rectangulo);
		
		g2.setPaint(Color.RED); // TOMAR UN COLOR ROJO
		g2.fill(rectangulo); // RELLENAR EL RECTANGULO ROJO
		
		
		// DIBUJANDO ELIPSE
		Ellipse2D elipse = new Ellipse2D.Double();
		elipse.setFrame(rectangulo);
		// g2.draw(elipse);
		
		g2.setPaint(new Color(109, 172, 59).darker().brighter() );
		g2.fill(elipse);
				
	}
}