package primerospasos;

public class manipulacadenasII {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String frase="HOY ES UN ESTUPENDO DIA PARA APRENDER A PROGRAMAR EN JAVA";
		
	
		//	EXTRAER UN FRAGMENTO DE UN TEXTO
		String frase_resumen=frase.substring(29, 57)+ " IRNOS A LA PLAYA Y OLVIDARNOS DE TODO";// SE TOMAN 2 PARAMETRO DEL NUMERO DE LETRA DONDE QUIERES EMPEZAR , DONDE QUIERES TERMINAR
		
		System.out.println(frase_resumen);
		
		
String frase_resumen2=frase.substring(0, 29)+ " IRNOS A LA PLAYA Y OLVIDARNOS DE TODO";// SE TOMAN 2 PARAMETRO DEL NUMERO DE LETRA DONDE QUIERES EMPEZAR , DONDE QUIERES TERMINAR
		
		System.out.println(frase_resumen2);

	}

}
