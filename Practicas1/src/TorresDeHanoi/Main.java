package TorresDeHanoi;

import java.util.Scanner;

public class Main {
	static int contador = 0;
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
        System.out.print("Numero de discos: ");
        int n = sc.nextInt();
        System.out.println();
        Hanoi(n,1,2,3);  //  1:origen  2:auxiliar  3:destino
        System.out.println("\nContador de pasos: "+contador);
        sc.close();
	}
	
	public static void Hanoi(int n, int origen,  int auxiliar, int destino){
		contador++;
        if(n==1) {
        	System.out.println("mover disco de " + origen + " a " + destino);
        }
        else{
		    Hanoi(n-1, origen, destino, auxiliar);
		    System.out.println("mover disco de "+ origen + " a " + destino);
		    Hanoi(n-1, auxiliar, origen, destino);
        }
	}
}
