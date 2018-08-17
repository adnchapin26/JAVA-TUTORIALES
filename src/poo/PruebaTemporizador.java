// 30-07-2018
package poo;

import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;

import javax.swing.JOptionPane;
import javax.swing.Timer;

public class PruebaTemporizador {

	public static void main(String[] args) {
		// UNA CLASE INTERFAZ NO PUEDE INSTANCIAR OBJETOS DIRECTAMENTE
		// INSTANCIA DE ActionListener, PERO INICIADA EN HORA
		Hora oyente = new Hora(); // ActionListener oyente = new Hora(); 
		
		// CREAMOS UNA INSTANCIA DE LA CLASE TIMER
		 	// Timer(int retardo, ActionListener interfaz) 
		Timer miTemporizador = new Timer(1000, oyente);
		
		// EMPEZAR EL TEMPORIZADOR
		miTemporizador.start();
		
		// SOLO PARA VER EN PRACTICA 
		JOptionPane.showMessageDialog(null, "Pulsa \"Aceptar\" para detener ejecución");
		
		System.exit(0); // DETENER LA EJECUCIÓN DEL PROGRAMA
	}

}

class Hora implements ActionListener{
	
	// ESTAMOS OBLIGADOS A DESARROLLAR TODOS LOS MÉTODOS DE ActionListener
	public void actionPerformed(ActionEvent e) {
		Date ahora = new Date();
		System.out.println("Hora actual: " + ahora);
		
		Toolkit.getDefaultToolkit().beep();
	}
	
	
}