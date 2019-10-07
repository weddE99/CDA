package Practicas;

import java.util.Scanner;

public class Ejercicio4_Vectores {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String frase = new String();
		
		System.out.printf("Ingrese una frase: ");
		frase = scan.nextLine();
		scan.close();
		
		//for(int i=0; i<frase.length(); i++) {
		//	System.out.println(frase.charAt(i));	/*char.At (devuelve caracteres de un string).*/
		//}
		
		int i = 0;
		while(i < frase.length()) {
			System.out.println(frase.charAt(i));
			i++;
		}
	}
}
