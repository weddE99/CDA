package Practicas;

public class Ejercicio7_InvertirNombre {
	
	public String InvertirNombre(String nombre) {
		int tamNombre = nombre.length();
		String[] parts = nombre.split("");
		nombre = "";
		for(int i=tamNombre; i>0; i--) {
			nombre += parts[i-1];
		}
		return nombre;
	}
	
	public void ContarFrecuencia(String frase) {
		String[] palabras = frase.split(" ");
		int[] contador = new int[50];
		
		for(int i=0; i<palabras.length; i++) {
			int tamPalabra = palabras[i].length();
			contador[tamPalabra]+=1;
		}
		
		for(int i=0; i<contador.length; i++){
			if(contador[i] != 0) {
				System.out.println("*  Hay "+contador[i]+" palabra/s que tengan un largo de "+i+" letras.");
			}
		}
	}
}
