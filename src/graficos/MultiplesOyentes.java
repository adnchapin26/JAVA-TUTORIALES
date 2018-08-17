package graficos;
// 13-08-2018

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class MultiplesOyentes {

	public static void main(String[] args) {
		MarcoPrincipal miMarco = new MarcoPrincipal();
		miMarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		miMarco.setVisible(true);
		
	}// FIN DEL MÉTODO maiN

}// FIN DE LA CLASE MultiplesOyentes

class MarcoPrincipal extends JFrame{
	private static final long serialVersionUID = 1L;
	
	public MarcoPrincipal() {
		setTitle("Prueba varios");
		setBounds(1000, 50, 300, 200);
		
		LaminaPrincipal lamina = new LaminaPrincipal();
		add(lamina);
		
	}// FIN DEL CONSTRUCTOR
}// FIN DE LA CLASE MarcoPrincipal

class LaminaPrincipal extends JPanel{
	private static final long serialVersionUID = 1L;
	JButton botonCerrar; // LO DECLARAMOS CON MAS AMBITO, PARA PODER USARLO EN VARIOS MÉTODOS
	
	// MÉTODO CONSTRUCOTR
	public LaminaPrincipal() {
		JButton botonNuevo = new JButton("Nuevo");
		this.add(botonNuevo);
		
		botonCerrar = new JButton("Cerrar");
		this.add(botonCerrar);

		// PONER A LA ESCUCHA A: botonNuevo
		botonNuevo.addActionListener( new OyenteNuevo() );
		
	}// FIN DEL CONSTRUCTOR
	
	private class OyenteNuevo implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent e) {
			MarcoEmergente marco = new MarcoEmergente(botonCerrar);
			marco.setVisible(true);
		}// FIN DEL MÉTODO actionPerformed
	}// FIN DE LA CLASE OyenteNuevo
	
}// FIN DE LA CLASE LaminaPrincipal

//CLASE PRIVADA, PARA IR CREANDO NUEVAS VENTANAS
class MarcoEmergente extends JFrame{
	private static final long serialVersionUID = 1L;
	private static int contador = 0;
		
	// MÉTODO CONSTRUCTOR
	public MarcoEmergente(JButton boton_cerrar_todo) {
		contador++;
		setTitle("Ventana " + contador);
			
		setBounds((40*contador), (80*contador), 300, 200);
		
		// PONER A LA ESCUCHA, AL BOTON CERRAR, DESDE LA OTRA VENTANA PRINCIPAL, PARA PDOER CERRAR TODO.
		boton_cerrar_todo.addActionListener( new CerrarTodo() );
	}// FIN DEL CONSTRUCTOR
	
	private class CerrarTodo implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent arg0) {
			// CERRAR LA VENTANA, SIN TERMINAR LA EJECUCION DEL PROGRAMA
			dispose(); // ESTO PERMITIRA CERRAR TODOS LOS OBJETOS Y LIBERAR RECURSOS
			contador = 0;
		}/// FIN DEL MÉTODO actionPerformed
	}// FIN DE LA CLASE CerrarTodo
}// FIN DE LA CLASE MarcoEmergente