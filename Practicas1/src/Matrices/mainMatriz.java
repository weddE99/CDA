package Matrices;

import java.util.Scanner;

public class mainMatriz {
	public static int i;
	public static int j;
	public static void main(String []args) {
		Scanner scanner = new Scanner(System.in);
		
		do {
			System.out.print("Ingrese filas: ");
			i = scanner.nextInt();
			System.out.print("Ingrese Columnas: ");
				j = scanner.nextInt();
		
			if(i==j) {
				Matriz matriz = new Matriz(i,j);
				matriz.ImprimirMatrices();
			}
			else System.out.println("\nERROR: la matriz no es cuadrada.\n");
		}while(i != j);
		
		scanner.close();
	}
}
