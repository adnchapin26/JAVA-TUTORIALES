package primerospasos;

public class Calculos_conMath {

	public static void main(String[] args) {
		
	//	double raiz= Math.sqrt(9);
		float num1=5.85F;
		
		int resultado=Math.round(num1);
		
		System.out.println(resultado);
		
		
		//refundiciones : FORZAR A TRANSFORMAR UN VALOR AL VALOR DESEADO AL PONERLE EL TIPO ANTES DE MATH.
		
		double num2=5.85F;
		
		int resultado2=(int)Math.round(num1);
		
		System.out.println(resultado2);
		
		
		double base=5;
		double exponente=3;
		
		int resultado3=(int)Math.pow(base, exponente);//le ponemos el int antes del math para convertir a entero
		System.out.println("EL RESULTADO DE  BASE  " + base + "  POR EL EXPONENTE  " + exponente+ "  ES : " + resultado3);
		
		
	}

}
