package listaenlazadaejemplo;

public class Programa {
	public static void main(String []args) {
		ListaEnlazada lista = new ListaEnlazada();
		lista.append(1);
		lista.append(2);
		lista.append(3);
		System.out.println(lista.imprimir());
		lista.reserve();
		System.out.println(lista.imprimir());
	}
}
