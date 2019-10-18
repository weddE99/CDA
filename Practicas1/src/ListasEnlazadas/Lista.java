package ListasEnlazadas;

public class Lista {
	public class Nodo{
		int info;
		Nodo siguienteNodo;
	}
	
	private Nodo primerNodo;
	
	public Lista() {
		primerNodo = null;
	}
	
	public int contador() {
		int contador = 0; 
		Nodo reco = primerNodo;
		while(reco != null) {
			contador++;
			reco = reco.siguienteNodo;
		}
		System.out.println("Cantidad de elementos: "+contador);
		return contador;
	}
	
	public void insertar(int x) {
		Nodo nodo1 = new Nodo();
		nodo1.info = x;
		if(primerNodo == null) {
			nodo1.siguienteNodo = null;
			primerNodo = nodo1;
		}
		else {
			nodo1.siguienteNodo = primerNodo;
			primerNodo = nodo1;
		}
	}
	
	public void insertarAntesDe(int x, int y) {
		Nodo temporal = primerNodo;
		Nodo n1 = new Nodo();
		while(temporal.info != y && temporal.siguienteNodo != null) {
			temporal = temporal.siguienteNodo;
		}
		if(temporal.siguienteNodo == null) {
			n1.info = x;
			n1.siguienteNodo = primerNodo;
			primerNodo = n1;
		}
		else{
			n1.info = x;
			n1.siguienteNodo = temporal.siguienteNodo;
			temporal.siguienteNodo = n1;
		}
	}
	
	public void imprimir() {
		Nodo reco = primerNodo;
		System.out.println("Listado de todos los elementos de la pila.");
		while(reco != null) {
			System.out.print(reco.info+"  ");
			reco = reco.siguienteNodo;
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		Lista lista = new Lista();
		lista.insertar(2);
		lista.insertar(4);
		lista.insertar(6);
		lista.insertar(8);
		lista.insertar(10);
		lista.insertar(12);
		lista.imprimir();
		lista.contador();
		System.out.println();
		/*		valor1 = valor		valor2 = dato siguiente de valor1*/
		lista.insertarAntesDe(24, 14);
		lista.imprimir();
		lista.contador();
		System.out.println();
	}
}
