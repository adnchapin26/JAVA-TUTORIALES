// 05-08-2018

package graficos;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
import java.awt.geom.Rectangle2D;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class PruebaDibujo {

	public static void main(String[] args) {
		MarcoConDibujos miMarco = new MarcoConDibujos();
		
		miMarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		miMarco.setVisible(true);
		

	}

}

class MarcoConDibujos extends JFrame{
	private static final long serialVersionUID = 1L;

	public MarcoConDibujos() {
		setTitle("Marco con dibujos");
		setSize(600, 400);
		setLocation(500, 100);
		setResizable(false);
		
		LaminaConFiguras miLamina = new LaminaConFiguras();
		
		add(miLamina);
	}
}

class LaminaConFiguras extends JPanel{
	private static final long serialVersionUID = 1L;
	
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		
			// COORDENADA X INICIO, COORDENADA Y INICIO, ANCHO, ALTURA 
		// g.drawRect(50, 50, 200, 200);
			// COORDENADA X1, COORDENADA Y1, COORDENADA X2, COORDENADA Y2
		// g.drawLine(100, 100, 300, 200);
			// COORDENADA X, COORDENADA Y, ANCHO, ALTURA, ANGULO INICIAL, INICIA ARCO
		// g.drawArc(50, 100, 100, 200, 120, 150);
		
		/*
		 * FIGURAS 2D
		 */
		// DIBJUAR UN RECTANGULO 2D
		Graphics2D g2 = (Graphics2D) g;
		Rectangle2D rectangulo = new Rectangle2D.Double(100, 100, 200, 150);
		g2.draw(rectangulo);
		
		// DIBUJAR UN ELIPSE2D
		Ellipse2D elipse = new Ellipse2D.Double();
		elipse.setFrame(rectangulo); // TOMAR COMO RADIO EL RECTANGULO
		g2.draw(elipse);
		
		// DIBUHAR UNA LINEA 2D
		g2.draw(new Line2D.Double(100, 100, 300, 250));
		
		// DIBUJUAR UN CIRUCLO QUE ABARQUE LAS FIGURAS 2D
		double CentroenX = rectangulo.getCenterX(); // OBTENER EL CENTRO EN EL EJE DE LA X
		double CentroenY = rectangulo.getCenterY(); // OBTENER EL CENTRO EN EL EJE DE LA Y
		double radio = (CentroenX + CentroenY) / 3;
		Ellipse2D circulo = new Ellipse2D.Double();
		circulo.setFrameFromCenter(CentroenX, CentroenY, CentroenX+radio, CentroenY+radio);
		g2.draw(circulo);
	}
}