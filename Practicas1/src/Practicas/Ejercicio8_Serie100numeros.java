package Practicas;

public class Ejercicio8_Serie100numeros {
	public void listadoNumeros() {
		int cantNumeros = 100;
		int[] pares = new int[cantNumeros];
		int[] impares = new int[cantNumeros];
		int numero;
		int auxP = 0; 
		int auxI = 0;
		
		for(int i=0; i<cantNumeros; i++) {
			numero = (int)Math.floor(Math.random()*100+1);
			if((numero % 2) == 0) {
				pares[auxP] = numero;
				auxP++;
			}
			if((numero % 2) == 1) {
				impares[auxI] = numero;
				auxI++;
			}
			
		}
		
		System.out.print("* Numeros Pares: |");
		for(int i=0; i<auxP; i++) {
			System.out.print(pares[i]+"|");
		}
		System.out.print("\n* Numeros Impares: |");
		for(int i=0; i<auxI; i++) {
			System.out.print(impares[i]+"|");
		}
		
		generarNumero();
		
	}
	
	public void generarNumero() {
		int a = 0;
		int contador = 0;
		int [][] listaNum = new int[4][4];
		for(int i=0; i<listaNum.length; i++) {
			for(int j=0; j<listaNum[0].length; j++) {
				contador = 0;
				int auxNum =  (int)Math.floor(Math.random()*100+1);
				a = i+j;
				
				if(((auxNum)%2)==0) {
					if((a%2)==1) {
						listaNum[i][j] = auxNum;
						contador++;
					}
				}
				if(((auxNum)%2)==1) {
					if((a%2)==0) {
						listaNum[i][j] = auxNum;
						contador++;
					}
				}
				if(contador == 0) j--;
			}
		}
		
		System.out.println("\n");
		for(int i=0;i<listaNum.length;i++) {
			for(int j=0;j<listaNum[0].length;j++) {
				System.out.print(listaNum[i][j]+" ");
			}
			System.out.println();
		}
		
		
	}
	
}
