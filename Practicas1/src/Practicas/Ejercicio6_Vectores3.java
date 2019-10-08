package Practicas;

import java.util.Scanner;

/*
 * Usando algun arreglo, alguna subrutina fuera del main, realiza evaluacion al usuario
 * que sen 3 preguntas (de cualquier cosa), que el programa informe las respuestas 
 * correctas/incorrectas.
 * 
 * */

public class Ejercicio6_Vectores3 {
	static char []caract = {'+','-','*','/'};
	static float [][]rta = new float[10][2];
	static int cant = 10;
	static Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args) {
		System.out.println("Haras 10 preguntas: Conteste.");
		System.out.println("==============================");
		ev1();
		System.out.println("==============================");
		
		for(int i=0; i<cant;i++) {
			if(rta[i][0] == rta[i][1]) {
				System.out.println("La Repuesta "+(i+1)+" es correcta!");
				System.out.println("* Respuesta: " +rta[i][1]+" *");
				System.out.println("================================");
			}
			else{
				System.out.println("La Repuesta "+(i+1)+" es incorrecta!");
				System.out.println("* Respuesta: " +rta[i][1]+" *");
				System.out.println("================================");
			}
		}
	}
	
	public static void ev1() {
		
		for(int i=0; i<cant; i++) {
			int a = (int)Math.floor(Math.random()*10+1);
			int b = (int)Math.floor(Math.random()*10+1);
			int c = (int)Math.floor(Math.random()*3+1);
			System.out.print("Cuanto es "+a+""+caract[c]+""+b+": ");
			float d = scan.nextFloat();
			rta[i][0] = d;
			
			if(c+1 == 1) {
				rta[i][1] = a+b;
			}
			else{
				if(c+1 == 2){
					rta[i][1] = a-b;
				}
				else {
					if(c+1 == 3){
						rta[i][1] = a*b;
					}
					if(c+1 == 4) {
						rta[i][1] = a/b;
					}
				}
			}
		}
		scan.close();
	}
}
