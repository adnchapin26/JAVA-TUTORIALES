// 27-07-2018

package poo;

public class Furgoneta extends Coche{
	/*
	 * ATRIBUTOS
	 */
	private int capacidad_carga;
	private int plazas_extra;
	
	/*
	 * MÉTODOS
	 */
	
	// MÉTODO CONSTRUCTOR 1
	public Furgoneta(int capacidad_carga, int plazas_extra) {
		// LLAMAR AL CONSTRUCTOR DE LA CLASE PADRE
		super();
		this.capacidad_carga = capacidad_carga;
		this.plazas_extra = plazas_extra;
	}
	
	// MÉTODOS GETTERS
	public String dimeDatosFurgoneta() {
		return "La capacitda de carga es: " + capacidad_carga + "\nLa Plazas son: " + plazas_extra;
	}
	
}
