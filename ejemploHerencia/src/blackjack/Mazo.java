package blackjack;

import java.util.Scanner;

public class Mazo {
	private Cartas[] cartas;
	protected Cartas[] jugador;
	protected Cartas[] crupier;
	private int posSiguienteCarta;
	protected static final int NUMERO_CARTAS = 48;
	protected static int posCartaJ = 0;
	protected static int posCartaC = 0;
	
	public Cartas[] getCartas() {
		return cartas;
	}
	public void setCartas(Cartas[] cartas) {
		this.cartas = cartas;
	}
	public Cartas[] getJugador() {
		return jugador;
	}
	public void setJugador(Cartas[] jugador) {
		this.jugador = jugador;
	}
	public Cartas[] getCrupier() {
		return crupier;
	}
	public void setCrupier(Cartas[] crupier) {
		this.crupier = crupier;
	}
	public int getPosSiguienteCarta() {
		return posSiguienteCarta;
	}
	public void setPosSiguienteCarta(int numCartas) {
		this.posSiguienteCarta = numCartas;
	}
	
	public Mazo() {
		this.cartas = new Cartas[NUMERO_CARTAS];
		this.jugador = new Cartas[NUMERO_CARTAS];
		this.crupier = new Cartas[NUMERO_CARTAS];
		
		this.posSiguienteCarta = 0;
		posCartaJ = 0;
		posCartaC = 0;
		
		crearBaraja();
		for(int i=0; i<10; i++) {
			barajar();
		}
	}
	
	private void crearBaraja() {
		String[] palos = Cartas.PALOS;
		String[] numeros = Cartas.NUMEROS;
		
		for(int i=0; i<palos.length; i++) {
			for(int j=0; j<Cartas.LIMITE_CARTA_PALO; j++) {
				cartas[((i * (Cartas.LIMITE_CARTA_PALO)) + j)] = new Cartas(numeros[j], palos[i]);
			}
		}
	}
	
	public void barajar() {
		int posAleatoria = 0;
		Cartas c;
		
		for(int i=0; i<cartas.length; i++) {
			posAleatoria = (int)(Math.random()*Cartas.LIMITE_CARTA_PALO+1);
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
	
	public Cartas[] darCartas(String p) {
		if(cartasDisponibles() == 0) {
			System.out.println("No hay cartas que mostrar");
		}
		else {
			for(int i=0; i<1; i++) {
				if(p=="j") {
					jugador[posCartaJ] = cartas[posSiguienteCarta];
					posCartaJ++;
					posSiguienteCarta++;
				}
				else if(p=="c") {
					crupier[posCartaC] = cartas[posSiguienteCarta];
					posCartaC++;
					posSiguienteCarta++;
				}
			}
			return jugador;
		}
		return jugador;
	}
	
	public int sumadorValores(Cartas a, int valor) {
		if(a.getNumero() == "J" || a.getNumero() == "Q" || a.getNumero() == "K" ) {
			valor +=10;
		}
		else {
			if(a.getNumero() == "AS") {
				valor +=1;
			}
			else valor += Integer.parseInt(a.getNumero());
		}
		return valor;
	}
	
	public void mostrarResultado() {
		int valorManoJ = 0;
		int valorManoC = 0;
		
        System.out.println("Tus Cartas: ");
    	System.out.println("--------------------");
    	
    	for(int i=0; i<jugador.length; i++) {
    		if(jugador[i] != null) { 
    			System.out.println(jugador[i]);
    			valorManoJ = sumadorValores(jugador[i],valorManoJ);
    		}
    	}
    	
    	System.out.println("--------------------");
    	System.out.println("Cartas del crupier: ");
    	System.out.println("--------------------");

    	for(int i=0; i<crupier.length; i++) {
    		if(crupier[i] != null) { 
    			System.out.println(crupier[i]);
    			valorManoC = sumadorValores(crupier[i],valorManoC);
    		}
    	}
    	
    	System.out.println("--------------------");
    	System.out.println("Suma de las cartas del jugador: "+valorManoJ);
    	System.out.println("Suma de las cartas del crupier: "+valorManoC);
    	
    	if(valorManoJ > valorManoC && valorManoJ <=21 || valorManoC >21 && valorManoJ <=21) {
    		System.out.println("\nHas ganado!! :D");
    	}
    	else {
    		System.out.println("\nHas perdido!! D:");
    	}
    	System.out.println("--------------------");
	}
	
	public void ejecutarJuego(){
		Scanner sc = new Scanner(System.in);
		int rta;
		
		do {
			Mazo m = new Mazo();
			m.darCartas("j");
			m.darCartas("c");
			m.darCartas("j");
			m.darCartas("c");
        
			do {       
				System.out.println("====================="+
						   "===========");
				System.out.println("Tus Cartas: ");
				System.out.println("--------------------");
        	
				for(int i=0; i<m.jugador.length; i++) {
					if(m.jugador[i] != null) System.out.println(m.jugador[i]);
				}
        	
				System.out.println("--------------------");
				System.out.println("Cartas del crupier: ");
				System.out.println("--------------------");
				
				for(int i=0; i<m.crupier.length; i++) {
					if(m.crupier[i] != null) {
						if(i == 0) System.out.println(m.crupier[i]);
						else System.out.println("[ ?? ]");
					}
				}
				System.out.println("--------------------");
				System.out.println("====================="+
						   "===========");
				System.out.println("* Pedir Otra Carta (1)\n* Salir (2)");
				System.out.print("Opcion: ");
				rta = sc.nextInt();
        	
				if(rta == 1) {
					m.darCartas("j");
					int valorManoC = 0;
					
					for(int i=0; i<m.crupier.length; i++) {
			    		if(m.crupier[i] != null) { 
			    			valorManoC = sumadorValores(m.crupier[i],valorManoC);
			    		}
			    	}
					
					if(valorManoC <= 16) m.darCartas("c");
					
					System.out.println("\n====================="+
							   "===========\n");
					System.out.println();
				}
				
			}while(rta != 2);
			System.out.println("\n\n====================="+
					   "===========");
			System.out.println("\t  RESULTADOS");
			System.out.println("====================="+
					   "===========");
			m.mostrarResultado();
			System.out.println("====================="+
					   "===========");

			System.out.println("* Seguir jugando (1)\n* Salir (2)");
			System.out.print("Opcion: ");
			rta = sc.nextInt();
        
			if(rta == 1) {
				System.out.println("\n====================="+
						   "===========\n\n");
			}
			
		}while(rta != 2);
		sc.close();
	}
}
