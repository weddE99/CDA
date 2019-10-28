package practicasRepasoPolinomio;

import java.util.Scanner;

public class Polinomio {
	private int grado;
	private int[] polinomio;
	
	public Polinomio(){

	}
	
	public void ingresarGrado(int grado) {
		this.grado = grado;
		this.polinomio = new int[this.grado+1];
	}
	
	public void ingresarCoeficientes() {
		Scanner input = new Scanner(System.in);
		System.out.print("Ingrese el grado del polinomio: ");
		ingresarGrado(input.nextInt());
		
		System.out.println();
		for(int i=this.grado; i>=1; i--) {
			System.out.print("Ingrese el coeficiente de grado "+i+": ");
			polinomio[i] = input.nextInt();
		}
		System.out.print("Ingrese el termino independiente: ");
		polinomio[0] = input.nextInt();
		System.out.print("\nEvaluar el polinomio en el grado: ");
		evaluarEnX(input.nextInt());
		input.close();
	}
	
	public void evaluarEnX(int x) {
		int valor = 0;
		for (int i = this.grado; i >= 0; i--){
			valor = this.polinomio[i] + (x * valor);
		}
		System.out.println("El polinomio evaluado en "+x+" es igual a: "+valor);
	}
}
