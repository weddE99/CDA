package blackjack;

public class Cartas {
	private String numero;
	private String palo;
	
	public static final String[] PALOS = {"Picas","Diamantes","Treboles","Corazones"};
	public static final String[] NUMEROS = {"AS","2","3","4","5","6","7","8","9","J","Q","K"};
	public static final int LIMITE_CARTA_PALO = 12;
	
	public String getNumero() {
		return numero;
	}
	public void setNumero(String numero) {
		this.numero = numero;
	}
	public String getPalo() {
		return palo;
	}
	public void setPalo(String palo) {
		this.palo = palo;
	}
	
	public Cartas(String numero, String palo) {
		this.numero = numero;
		this.palo = palo;
	}
	
	public Cartas() {
		
	}
	
	@Override
	public String toString() {
		String a = null;
		if(getPalo() == "Picas") a = "["+getNumero()+" de ♠]";
		if(getPalo() == "Diamantes") a = "["+getNumero()+" de ♦]";
		if(getPalo() == "Treboles") a = "["+getNumero()+" de ♣]";
		if(getPalo() == "Corazones") a = "["+getNumero()+" de ♥]";
		return a;
	}
}