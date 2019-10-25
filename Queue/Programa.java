package Queue;
import java.util.LinkedList;
import java.util.Queue;

public class Programa {
	public static void main(String[]args) {
		Queue<Integer> cola = new LinkedList<Integer>();
		
		for(int i=0; i<10; i++) {
			cola.add(i*i);
		}
		System.out.println("Datos de la pila: "+cola);
		cola.remove();
		System.out.println("Datos de la pila: "+cola);
		Integer aux = cola.peek();
		System.out.println(aux);
		cola.poll();
		System.out.println("Datos de la pila: "+cola);
		int aux2 = cola.size();
		System.out.println(aux2);
		cola.add(100);
		System.out.println("Datos de la pila: "+cola);
	}
}
