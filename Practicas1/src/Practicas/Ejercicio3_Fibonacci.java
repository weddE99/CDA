package Practicas;

public class Ejercicio3_Fibonacci {
	
	public static void main(String[] args){
		int a = 0;
		int b = 1;
		int c;
		
		System.out.println("Numero 1: "+a+"\nNumero 2: "+b);
		for(int i=0; i<7;i++){
			c = a+b;
			a = b;
			b = c;
			System.out.println(c);
		}
	}
}
