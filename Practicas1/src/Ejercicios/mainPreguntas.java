package Ejercicios;

import java.util.Scanner;

public class mainPreguntas {
	static char []caract = {'+','-','*','/'};
	static int cant = 1;
	
	public static void main(String []args) {
		Scanner scan = new Scanner(System.in);
		for(int i=0; i<cant; i++) {
			int a = (int)Math.floor(Math.random()*10+1);
			int b = (int)Math.floor(Math.random()*10+1);
			int c = (int)Math.floor(Math.random()*3+1);
			System.out.print("Cuanto es "+a+""+caract[c]+""+b+": ");
			int d = scan.nextInt();
			System.out.println("=================================");
			Preguntas pregunta = new Preguntas(a,b,c+1,d);
			pregunta.imprimirRespuesta();
			System.out.println("=================================");
		}
		scan.close();
	}
}
