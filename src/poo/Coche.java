// 27-07-2018

package poo;

public class Coche {
	// ATRITUBOS
	 // Private: NO SON VISIBLES DESDE OTRA CLASE, SOLO PUEDEN MODIFCARSE DESDE LA MISMA CLASE. 
	private int ruedas; // PARA REPRESENTAR EL NUMERO DE RUEDAS
	private int largo; // PARA REPRESENTAR EN CM EL LARGO
	private int ancho; // PARA REPRESENTAR EN CM EL ANCHO
	private int motor; // PARA RESEPRENTAR EN METROS CUBICOS
	private int peso_plataforma; // PARA REPRESENTAR EL PESO DE LA BASE DEL COCHE
	private String color;
	private int peso_total;
	private boolean asientos_cuero, climatizador;
	
	// MÉTODOS
	
	/*
	 * MÉTODO CONSTRUCTOR:
	 * ES UN METODO ESPECIAL QUE SE ENCARGA DE DAR UN ESTADO INICIAL
	 * A NUESTRO OBJETO.
	 * -> SIEMPRE DEBE TENER EL MISMO NOMBRE QUE LA CLASE
	 */
	public Coche() {
		ruedas = 4;
		largo = 2000;
		ancho = 300;
		motor = 1600;
		peso_plataforma = 500;
	}
	
	// MÉTODO GETTER: DEVUELVE EL VALOR DE UNA PROPIEDAD
	public int getRuedas() {
		return ruedas;
	}
	
	public int getLargo() {
		return largo;
	}
	
	public int getAncho() {
		return ancho;
	}
	
	public int getMotor() {
		return motor;
	}
	
	public int getPesoPlafaforma() {
		return peso_plataforma;
	}
	
	// MÉTODO SETTER: MODIFICAR EL VALOR DE LAS PROPIEDADES DE LOS OBJETOS
	public void setColor(String color) {
		// THIS: HACE REFENIA AL ATRIBUTO COLOR DE LA CLASE, PARA PODER RECONOER A COLOR DE LA REFERENCIA
		this.color = color;
	}
	
	public void setAsientos(String asientos) {
		if ( asientos.equalsIgnoreCase("Si") ) {
			this.asientos_cuero = true;
		}else if ( asientos == "No" ) {
			this.asientos_cuero = false;
		}
	}
	
	public void setClimatizador(String climatizador) {
		if ( climatizador.equalsIgnoreCase("Si") ) {
			this.climatizador = true;
		}else {
			this.climatizador = false;
		}
	}
	
	// OTROS MÉTODOS
	public String dime_color() {
		return ("El color del coche es: " + color);
	}
	
	public String dime_datos_generales() {
		return "La plataforma del vehiculo tiene " + ruedas + " ruedas. "
				+ "Mide " + (largo/1000) + " metros, con un ancho de " + ancho +
				" cm y un peso de plataforma de " + peso_plataforma + " kg.";
	}
	
	public String dime_asientos() {
		if ( this.asientos_cuero == true ) {
			return "El coche tiene asientos de cuero.";
		}else {
			return "El coche tiene asientos de serie.";
		}
	}
	
	public String dime_climatizador() {
		if ( this.climatizador == true ) {
			return "El coche incorpora climatizador.";
		}else {
			return "El coche lleva aire acondicionado.";
		}
	}
	
	/*
	 * EL USO DE ESTE MÉTODO NO ES TAN RECOMENDADO
	 */
	// SETTER + GETTER
	public String dime_peso_coche() {
		int peso_carroceria = 500;
		
		// SETTER
		peso_total = peso_plataforma + peso_carroceria;
		
		if ( asientos_cuero == true ) {
			peso_total += 50;
		}
		
		if ( climatizador == true ) {
			peso_total += 20;
		}
		
		return "El peso total del coche es: " + peso_total; // GETTER
	}
	
	// GETTER
	public int precio_coche() {
		int precio_final = 10000; // PRECIO NORMAL SIN EXTRAS
		
		if ( asientos_cuero == true ) {
			precio_final += 2000;
		}
		
		if ( climatizador == true ) {
			precio_final += 1500;
		}
		
		return precio_final;
	}
}
