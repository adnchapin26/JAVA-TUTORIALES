// 12-08-2018

package graficos;
import java.awt.Color;
import java.awt.event.ActionEvent;
import javax.swing.AbstractAction;
import javax.swing.Action;
import javax.swing.ActionMap;
import javax.swing.InputMap;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.KeyStroke;

public class PruebaAcciones {
	public static void main(String[] args) {
		MarcoAccion miMarco = new MarcoAccion();
		
		miMarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		miMarco.setVisible(true);

	}// FIN DEL MÉTODO main
}// FIN DE LA CLASE PruebaAcciones

class MarcoAccion extends JFrame{
	private static final long serialVersionUID = 1L;

	public MarcoAccion() {
		setTitle("Prueba acciones");
		setBounds(300, 200, 600, 300);
		
		PanelAccion lamina = new PanelAccion();
		
		add(lamina);
	}// FIN DEL CONSTRUCTOR
	
}// FIN DE LA CLASE MarcoAccion

class PanelAccion extends JPanel{
	private static final long serialVersionUID = 1L;
	
	// METODO CONSTRUTOR
	public PanelAccion() {		
		// PONER EL OBJETO EVENTO A LA ESCUCHA
		AccionColor accionAmarillo = new AccionColor("Amarilo", Color.YELLOW );
		AccionColor accionAzul = new AccionColor("Azul", Color.BLUE );
		AccionColor accionRojo = new AccionColor("Rojo", Color.RED );
		
		this.add( new JButton(accionAmarillo) );
		this.add( new JButton(accionAzul) );
		this.add( new JButton(accionRojo) );
		
		// ALMACENAR EN "mapaEntrada" EL VALOR QUE DEVUELVE EL MÉTODO getInputMap
			// getInputMap: PROPORCIONA UN VINCULO ENTRE UN EVENTO Y UN OBJETO
				// WHEN_IN_FOCUSED_WINDOW: EL COMANDO RESIDIRA EN EL COMPONENTE "X" QUE ESTA EN LA VENTANA QUE TIENE EL FOCO.
				// WHEN_FOCUSED: EL MANDO RESIDIRA AL COMPONENTE ( PUEDE SER EL MISMO BOTON) QUE TIENE EL FOCO.
					// EN ESTE CASO NO NOS SIRVE, PORQUE HEMOS PUESTO COMO OYENTE A LA PROPIA LAMINA, NO AL BOTON
						// YA QUE ES LA LAMINA QUE CAMBIARA DE COLOR, CON DARLE CLIC AL BOTON, Y CON ASIGNACIÓN DE TECLAS.
				// WHEN_ANCESTOR_OF_FOCUSED_COMPONENT: // EL COMPONENTE QUE RECIBIRÁ EL COMANDO SE ENCUENTRA EN LA LAMINA QUE TENGA EL FOCO. 
		InputMap mapaEntrada = getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
	
		// CREAR COMBINACION DE TECLA
		// KeyStroke teclaAmarillo = KeyStroke.getKeyStroke("ctrl A");
		
		// ASIGNAR COMBINACION DE TECLAS A OBJETO
			// CREA UNA NOMBRE AL NOMBRE DEL OBJETO KeyStroke
		mapaEntrada.put( KeyStroke.getKeyStroke("ctrl Y") , "fondo_amarillo" );
		mapaEntrada.put( KeyStroke.getKeyStroke("ctrl B") , "fondo_azul" );
		mapaEntrada.put( KeyStroke.getKeyStroke("ctrl R") , "fondo_rojo" );
		
		// CREAR MAPA ACCION
		ActionMap mapaAccion = getActionMap(); // ALMACENAR EL EVENTO
			// ASGINAR VINCULO ENTRE OBJETO CREADO, CON LA ACCION
		mapaAccion.put("fondo_amarillo", accionAmarillo );
		mapaAccion.put("fondo_azul", accionAzul );
		mapaAccion.put("fondo_rojo", accionRojo );
		
		
	}// FIN DEL CONSTRUCTOR	
	
	private class AccionColor extends AbstractAction{
		private static final long serialVersionUID = 1L;

		// MÉTODO CONSTRUCTOR
		public AccionColor(String nombre, Color colorBoton) {
			// ALMACENAR VALORES DEL OBJETO EVENTO ( ALMACENAR EN FORMATO CLAVE)
			putValue(Action.NAME, nombre);
			putValue(Action.SHORT_DESCRIPTION, "Poner la lámina de color " + nombre);
			putValue("colorDeFondo", colorBoton);
		}// FIN DEL CONSTRUCTOR
		
		@Override
		public void actionPerformed(ActionEvent e) {
			Color c = (Color) getValue("colorDeFondo"); // ALMACENAR EL COLOR DE LA CLAVE "colorDeFondo"
			setBackground(c);
			System.out.println("Nombre: " + getValue(Action.NAME) + ". Desripción: " + getValue(Action.SHORT_DESCRIPTION) );
		}// FIN DEL MÉTODO actionPerformed
	}// FIN DE LA CLASE AccionColor

}// FIN DE LA CLASE PanelAccion