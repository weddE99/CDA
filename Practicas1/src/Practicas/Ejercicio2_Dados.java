package Practicas;
import java.lang.Math;

public class Ejercicio2_Dados {
	public static void main(String[] args){
		int[] dado = new int[5];
		int sumaDados = 0;

		for(int i=0; i<dado.length; i++){
		dado[i] = (int)Math.floor(Math.random()*6+1);
			System.out.println("El dado "+(i+1)+" tiene el valor: "
					+dado[i]);
			sumaDados += dado[i];
		}
		
		System.out.println("\nLa suma de los dados da: "+sumaDados);
	}
}

