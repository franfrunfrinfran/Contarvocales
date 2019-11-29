package es.Studium.ContarVocales;

import java.util.Scanner;
import java.util.Vector;

public class Ejercicio17ContarVocales {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner teclado=new Scanner(System.in);

		
		int contar=0;
		
		String cadena;
		
		System.out.println("Escriba una cadena");
		cadena=teclado.next();
		
		

		System.out.println(funcontar(cadena));
		
	}
	 public static int funcontar(String a)
	 {
	
		 String cadena=a;
		 int contar=0;
			
			for(int j=0;j<cadena.length();j++)
			{
				if((cadena.charAt(j)=='a')||(cadena.charAt(j)=='e')||(cadena.charAt(j)=='i')||(cadena.charAt(j)=='o')||(cadena.charAt(j)=='u'))
				{
					contar++;
				}
			}
			return contar;
	 }
}
