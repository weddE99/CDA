package Practicas;

public class Ejercicio7_MainInvertirNombre {
	public static void main(String []args) {
		Ejercicio7_InvertirNombre clases = new Ejercicio7_InvertirNombre();
		System.out.println("Nombre original: Wilson");
		System.out.println("Nombre invertido: "+clases.InvertirNombre("Wilson"));
		System.out.println("\nContador de palabras:");
		clases.ContarFrecuencia("Palabra Palabras Palabra");
	}
}
