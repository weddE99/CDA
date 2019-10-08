package Ejercicios;

public class Preguntas {
	private int valorA;
	private int valorB;
	private int cuenta;
	private float valorC;
	public int respuesta;
	
	public int getCuenta() {
		return cuenta;
	}
	public void setCuenta(int cuenta) {
		this.cuenta = cuenta;
	}
	
	public int getValorA() {
		return valorA;
	}
	public void setValorA(int valorA) {
		this.valorA = valorA;
	}

	public int getValorB() {
		return valorB;
	}
	public void setValorB(int valorB) {
		this.valorB = valorB;
	}
	
	public float suma(int valorA, int valorB){
		valorC = valorA + valorB;
		return valorC;
	}
	
	public float resta(int valorA, int valorB){
		valorC = valorA - valorB;
		return valorC;
	}
	
	public float multiplicacion(int valorA, int valorB){
		valorC = valorA * valorB;
		return valorC;
	}
	
	public float division(int valorA, int valorB){
		valorC = valorA / valorB;
		return valorC;
	}
	
	public void imprimirRespuesta(){
		int cuenta = getCuenta();
		if(cuenta == 1) {
			float rta = suma(valorA, valorB);
			if(respuesta == rta) System.out.println("Su respuesta fue correcta!");
			else System.out.println("* Su respuesta fue incorrecta!");
			System.out.println("* La suma es de: "+rta);
		}
		else {
			if(cuenta == 2) {
				float rta = resta(valorA, valorB);
				if(respuesta == rta) System.out.println("Su respuesta fue correcta!");
				else System.out.println("* Su respuesta fue incorrecta!");
				System.out.println("* La resta es de: "+rta);
			}
			else {
				if(cuenta == 3) {
					float rta = multiplicacion(valorA, valorB);
					if(respuesta == rta) System.out.println("Su respuesta fue correcta!");
					else System.out.println("* Su respuesta fue incorrecta!");
					System.out.println("* La multiplicacion es de: "+rta);
				}
				else {
					if(cuenta == 4) {
						float rta = division(valorA, valorB);
						if(respuesta == rta) System.out.println("Su respuesta fue correcta!");
						else System.out.println("* Su respuesta fue incorrecta!");
						System.out.println("* La division es de: "+rta);
					}
				}
			}
		}
	}
	
	public Preguntas(int valorA, int valorB, int cuenta, int respuesta) {
		super();
		this.valorA = valorA;
		this.valorB = valorB;
		this.cuenta = cuenta;
		this.respuesta = respuesta;
	}
	public Preguntas() {
		
	}
	
}
