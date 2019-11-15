package mazoCartas;

public class Mazo {
	private Cartas[] cartas;
	private int posSiguienteCarta;
	public static final int NUMERO_CARTAS = 40;
	
	public Cartas[] getCartas() {
		return cartas;
	}
	public void setCartas(Cartas[] cartas) {
		this.cartas = cartas;
	}
	public int getPosSiguienteCarta() {
		return posSiguienteCarta;
	}
	public void setPosSiguienteCarta(int numCartas) {
		this.posSiguienteCarta = numCartas;
	}
	
	public Mazo() {
		this.cartas = new Cartas[NUMERO_CARTAS];
		this.posSiguienteCarta = 0;
		crearBaraja();
		barajar();
	}
	
	private void crearBaraja() {
		String[] palos = Cartas.PALOS;
		
		for(int i=0; i<palos.length; i++) {
			for(int j=0; j<Cartas.LIMITE_CARTA_PALO; j++) {
				if (j != 7 || j != 8) {
					if(j >= 9) cartas[(( i * (Cartas.LIMITE_CARTA_PALO-2))+(j-2))] = new Cartas(j+1,palos[i]);
					else cartas[(( i * (Cartas.LIMITE_CARTA_PALO-2))+j)] = new Cartas(j+1,palos[i]);
				}
			}
		}
	}
	
	public void barajar() {
		int posAleatoria = 0;
		Cartas c;
		
		for(int i=0; i<cartas.length; i++) {
			posAleatoria = (int)(Math.random()*12+1);
			c = cartas[i];
			cartas[i] = cartas[posAleatoria];
			cartas[posAleatoria] = c;
		}
		this.posSiguienteCarta = 0;
	}

	public int cartasDisponibles() {
        return NUMERO_CARTAS - posSiguienteCarta;
    }
	
	public void mostrarBaraja() {
		if(cartasDisponibles() == 0) {
            System.out.println("No hay cartas que mostrar");
        } 
		else {
        	for(int i=posSiguienteCarta; i<cartas.length; i++) {
                System.out.println(cartas[i]);
            }
        }
	}
	
	public Cartas[] darCartas() {
		Cartas[] darCartas = null;
		if(cartasDisponibles() == 0) {
			System.out.println("No hay cartas que mostrar");
		}
		else {
			darCartas = new Cartas[2];
			for(int i=0; i<darCartas.length; i++) {
				darCartas[i] = cartas[posSiguienteCarta];
			}
			return darCartas;
		}
		return darCartas;
	}
}
