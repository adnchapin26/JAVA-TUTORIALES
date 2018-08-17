package poo;

import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;

import javax.swing.JOptionPane;
import javax.swing.Timer;

public class PruebaTemporizador2 {

	public static void main(String[] args) {
		Reloj miReloj = new Reloj();
		
		miReloj.enMarcha(1000, true);
		
		JOptionPane.showMessageDialog(null, "Pulsa en \"Aceptar\" para finalizar el programa");
		
		System.exit(0);
	}

}


class Reloj{	
/*
	public Reloj(int intervalo, boolean sonido) {
		this.intervalo = intervalo;
		this.sonido = sonido;
	}
*/
	public void enMarcha(int intervalo, final boolean sonido) {
		// SOLO LAS CLASES INTERNAS PUEDE TENER EL ACCESO PRIVATE
		// LAS CLASES INTERNAS LOCALES NO DEBEN TENER MODIFICADOR DE ACCESO
		class DameLaHora2 implements ActionListener{
			public void actionPerformed(ActionEvent e) {
				Date ahora = new Date();
				
				System.out.println("Hora cada " + (intervalo/1000) + " segundo(s): " + ahora);
				
				if ( sonido )
					Toolkit.getDefaultToolkit().beep();
			}
		}
		
		ActionListener oyente = new DameLaHora2();
		Timer miTemporizador = new Timer(intervalo, oyente);
		miTemporizador.start();
	}
}