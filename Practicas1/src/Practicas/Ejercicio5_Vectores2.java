package Practicas;

public class Ejercicio5_Vectores2 {
	/*
	*	Encontrar numero entero entre 1 y 10000 con el mayor numero de divisores.
	*/
	public static void main(String[] args) {
		int numero = 10000;
		int max = 0;
		int cantMax = 0;
	 
		for(int i = 1; i <= numero; i++){
			int cant = 0;
			for(int j = 1; j <= (i/2); j++) {
				if((i % j) == 0){
					cant++;
				}
				if(cant >= cantMax) {
					max = i;
					cantMax = cant;
				}
			}
		}
		System.out.println("El maximo numero divisor es de: "+max+" con "+cantMax+" divisores.");
	}
}
