package listaenlazadaejemplo;

public class ListaEnlazada {
	Nodo head = null;
	
	public void insert(int pos, int data) {
		if(pos > this.size()) {
			this.append(data);
		} else {
			Nodo nuevo = new Nodo(data);
			if(pos == 0) {
				nuevo.next = this.head;
				this.head = nuevo;
			} else {
				int count = 0;
				Nodo aux = this.head;
				while(count < pos - 1 /*&& aux != null*/) {
					count++;
					aux = aux.next;
				}
				nuevo.next = aux.next;
				aux.next = nuevo;
			}
		}
	}
	
	public String imprimir() {
		String cadena = "";
		Nodo aux = this.head;
		while(aux != null) {
			cadena = cadena + aux.info + " -> ";
			aux = aux.next;
		}
		cadena = cadena + "[";
		return cadena;
	}
	
	public void append(int data) {
		Nodo nuevo = new Nodo(data);
		if(this.isEmpty()) {
			this.head = nuevo;
		} else {
			Nodo aux = this.head;
			while(aux.next != null) {
				aux = aux.next;
			}
			aux.next = nuevo;
		}
	}
	
	public boolean isEmpty() {
		return this.head == null;
	}
	
	public int size() {
		int size = 0;
		Nodo aux = this.head;
		while(aux != null) {
			size++;
			aux = aux.next;
		}
		return size;
	}
	
	public Nodo getElement(int pos) {
		int count = 0;
		Nodo aux = this.head;
		Nodo element = null;
		while(aux.next != null) {
			if(count == pos) {
				element = aux;
			}
			count++;
			aux = aux.next;
		}
		return element;
	}
	
	public void empty() {
		this.head = null;
	}
	
	public void reserve() {
		Nodo prev = null;
		Nodo current = this.head;
		Nodo currentNext = this.head;
		
		while(current != null) {
			currentNext = currentNext.next;
			current.next = prev;
			prev = current;
			current = currentNext;
		}
		
		this.head = prev;
	}
}