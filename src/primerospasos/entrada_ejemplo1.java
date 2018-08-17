package primerospasos;

import java.util.Scanner;

public class entrada_ejemplo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner entrada=new Scanner (System.in);

System.out.println("INTRODUCE TU NOMBRE , PORFAVOR : ");
String nombre_usuario=entrada.nextLine();

System.out.println("INTRODUCE LA EDAD PORFAVOR : ");
int edad=entrada.nextInt();

System.out.println("HOLA  "+nombre_usuario+" EL ANO QUE VIENE TENDRAS " + (edad+1)+ " anos");

	}

}
