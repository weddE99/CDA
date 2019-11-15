package mazoCartas;

public class Cartas {
	private int numero;
	private String palo;
	
	public static final String[] PALOS = {"Espada","Oro","Basto","Copa"};
	public static final int LIMITE_CARTA_PALO = 12;
	
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public String getPalo() {
		return palo;
	}
	public void setPalo(String palo) {
		this.palo = palo;
	}
	
	public Cartas(int numero, String palo) {
		this.numero = numero;
		this.palo = palo;
	}
	
	@Override
	public String toString() {
		return "carta -> "+getNumero()+" de "+getPalo();
	}
}