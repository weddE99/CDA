package Ejercicios;

import java.util.Scanner;
import java.lang.Character;

public class mainPreguntas {
	static char []caract = {'+','-','*','/'};
	static int cant = 5;
	
	public static void main(String []args) {
		mostrar();
	}
	
	public static void mostrar() {
		Scanner scan = new Scanner(System.in);
		char respuesta = ' ';
			for(int i=0; i<cant; i++) {
				int a = (int)Math.floor(Math.random()*10+1);
				int b = (int)Math.floor(Math.random()*10+1);
				int c = (int)Math.floor(Math.random()*3+1);
				System.out.print("Cuanto es "+a+caract[c]+b+": ");
				int d = scan.nextInt();
				System.out.println("=================================");
				Preguntas pregunta = new Preguntas(a,b,c+1,d);
				pregunta.imprimirRespuesta();
				System.out.println("=================================");
					
				do {
					System.out.print("Desea seguir resolviendo preguntas? (s/n): ");
					respuesta = scan.next().charAt(0);
					respuesta = Character.toLowerCase(respuesta);
				}while(respuesta != 's' && respuesta != 'n');
				
				if(respuesta == 'n') break;
			}
			if(cant==5) System.out.print("\n** Alcanzo el limite de preguntas!! **");
			System.out.print("\n** Finalizado!! **");
		scan.close();
	}
}
