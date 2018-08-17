// 15-08-2018

package graficos;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Calculadora {

	public static void main(String[] args) {

		MarcoCalculadora miMarco = new MarcoCalculadora();
		miMarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		miMarco.setVisible(true);
	}

}

class MarcoCalculadora extends JFrame{
	private static final long serialVersionUID = 1L;
	
	public MarcoCalculadora() {
		setTitle("Calculadora");
		setBounds(500, 200, 500, 400);
		
		LaminaCalculadora miLamina = new LaminaCalculadora();
		add(miLamina);
		// pack(); // EL CONTENEDOR SE ADAPTA A LOS COMPONENTES DE SU INTERIOR
	}
}

class LaminaCalculadora extends JPanel{
	private static final long serialVersionUID = 1L;
	JPanel miLamina2 = new JPanel();
	JButton pantalla = new JButton("0");
	boolean principio = true;
	private double resultado;
	private String ultimaOperacion;
	
	public LaminaCalculadora() {
		setLayout( new BorderLayout() );
		
		pantalla.setEnabled(false); // DESHABILITAR BOTON
		add(pantalla, BorderLayout.NORTH); // AGREGAR EL BOTON A LA PARTE SUPERIOR DE LA LAMINA
		
		// CREAR OTRA LAMINA
		miLamina2.setLayout( new GridLayout(4, 4) ); // ESTABLECER FILAS, COLUMNAS
		
		ponerBoton("7"); ponerBoton("8"); ponerBoton("9"); ponerBoton("/");
		ponerBoton("4"); ponerBoton("5"); ponerBoton("6"); ponerBoton("*");
		ponerBoton("1"); ponerBoton("2"); ponerBoton("3"); ponerBoton("+");
		ponerBoton("0"); ponerBoton("."); ponerBoton("="); ponerBoton("-");
		
		/* // ALTERNATIVO
		JButton boton7 = new JButton("7"); miLamina2.add(boton7);
		JButton boton8 = new JButton("8"); miLamina2.add(boton8);
		JButton boton9 = new JButton("9"); miLamina2.add(boton9);
		JButton botonDivision = new JButton("/"); miLamina2.add(botonDivision);
		JButton boton4 = new JButton("4"); miLamina2.add(boton4);
		JButton boton5 = new JButton("5"); miLamina2.add(boton5);
		JButton boton6 = new JButton("6"); miLamina2.add(boton6);
		JButton botonMultiplicacion = new JButton("*"); miLamina2.add(botonMultiplicacion);
		JButton boton1 = new JButton("1"); miLamina2.add(boton1);
		JButton boton2 = new JButton("2"); miLamina2.add(boton2);
		JButton boton3 = new JButton("3"); miLamina2.add(boton3);
		JButton botonSuma = new JButton("+"); miLamina2.add(botonSuma);
		JButton boton0 = new JButton("0"); miLamina2.add(boton0);
		JButton botonPunto = new JButton("."); miLamina2.add(botonPunto);
		JButton botonIgual = new JButton("="); miLamina2.add(botonIgual);
		JButton botonResta = new JButton("-"); miLamina2.add(botonResta);
		*/
		
		add(miLamina2, BorderLayout.CENTER); // AGREGAR EL GRIDLAYOUT, AL CENTRO	
		ultimaOperacion = "="; // PARA NO TIRAR ERROR AL PRIMER VALOR
	}
	
	// MÉTODO ALTERNATIVO PARA AGREGAR LOS BOTONES 
	private void ponerBoton (String rotulo) {
		// CREAR NUEVO JButton
		JButton boton = new JButton(rotulo);
		
		// PONERLO EN ESCUCHA, ASOCIANDO CON LA CLASE CORRESPONDIENTE
		if ( rotulo.equals("/") || rotulo.equals("*") || rotulo.equals("+") || rotulo.equals("-") 
				|| rotulo.equals("=") ){
			boton.addActionListener(new AccionOperacion() );
		}else {
			boton.addActionListener( new InsertarNumero() );
		}
		
		
		// AGREGAR EL BOTON A LA miLamina2
		miLamina2.add(boton);
	}
	
	// CLASE INTERNA PARA GESTIONAR LOS EVENTOS
	private class InsertarNumero implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {

			String entrada = e.getActionCommand(); // DEVUELVE EL STRING (TEXTO) DEL COMPONENTE DEL EVENTO
			
			if (principio ) {
				pantalla.setText("");
				principio = false;
			}
			
			pantalla.setText( pantalla.getText() + entrada);
			
		}
	}
	
	private class AccionOperacion implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			
			String operacion = e.getActionCommand();
			
			calcular(Double.parseDouble( pantalla.getText()), operacion);
			
			ultimaOperacion = operacion;
			
			principio = true;
		}
		
		public void calcular(double x, String operacion) {
			if ( x == 0 ) {
				// SI AUN NO HA INGRESADO ALGUN VALOR
			}else if ( ultimaOperacion.equals("+") ) {
				resultado += x;
			}else if ( ultimaOperacion.equals("-") ) {
				resultado -= x;
			}else if ( ultimaOperacion.equals("*") ) {
				resultado *= x;
			}else if ( ultimaOperacion.equals("/") ) {
				resultado /= x;
			}else if ( ultimaOperacion.equals("=")){
				resultado = x;
				
				
			}
			
			pantalla.setText(""+resultado );
		}
		
	}
	
}