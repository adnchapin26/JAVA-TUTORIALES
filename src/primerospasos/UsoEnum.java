import java.util.Scanner;

// 30-07-2018

public class UsoEnum {
	// UN OBJETO ENUM NO PUEDE SER DECLARADO DENTRO DEL main
	// enum Talla{ MINI, MEDIANO, GRANDE, MUY_GRANDE};
	
	private static Scanner entrada;

	enum Talla{
		// ASIGNAMOS LAS ABREVIAUTRAS DE LAS CONSTANTES ENUMERADAS
		MINI("S"), MEDIANO("M"), GRANDE("L"), MUY_GRANDE("XL");
		
		// CONSTRUCTOR DE UNA CLASE ENUM
			// ESTO AL SER PRIVATE, NO PERMITE CREAR INSTANCIAS
		private Talla(String abreviatura) {
			this.abreviatura = abreviatura;
		}
		
		public String getAbreviatura() {
			return abreviatura;
		}
		
		// ATRIBUTOS
		private String abreviatura;
	}
	
	public static void main(String[] args) {
		entrada = new Scanner(System.in);
		
		System.out.print("Ingrese una abreviación para tu talla: MINI, MEDIANO, GRANDE, MUY_GRANDE: ");
		String abreviatura_usuario = entrada.nextLine().toUpperCase(); // PASAR A MAYUSCULAS LO INGRESADO
		
		// RETORNA LA CONSTANTE DEL NOMBRE ENUMERADA, ABREVIATURA DE LAS TALLAS
		Talla la_talla = Enum.valueOf(Talla.class, abreviatura_usuario);
		
		System.out.println("Talla: " + la_talla);
		System.out.println("Abreviatura: " + la_talla.getAbreviatura() );
		
		

	}

}
	