package Matrices;

public class Matriz {
	private int filas;
	private int columnas;
	private int[][] matriz = new int[this.filas][this.columnas];
	
	public int getFilas() {
		return filas;
	}

	public void setFilas(int filas) {
		this.filas = filas;
	}

	public int getColumnas() {
		return columnas;
	}

	public void setColumnas(int columnas) {
		this.columnas = columnas;
	}

	public Matriz(int filas, int columnas) {
		super();
		this.filas = filas;
		this.columnas = columnas;
	}

	public int[][] GeneradorMatrizOriginal() {
		matriz = new int[this.filas][this.columnas];
		
		for(int i=0; i<matriz.length; i++) {
			for(int j=0; j<matriz[0].length; j++) {
				int auxNum =  (int)Math.floor(Math.random()*9+1);
				matriz[i][j] = auxNum;
			}
		}
		return matriz;
	}
	
	public int[][] GeneradorMatrizTranspuesta(int [][]matriz) {
		int[][] transpuesta = new int[this.filas][this.columnas];
		for(int i=0; i<matriz.length; i++) {
			for(int j=0; j<matriz[0].length; j++) {
				transpuesta[i][j] = matriz[j][i];
			}
		}
		return transpuesta;
	}
	
	public void ImprimirMatrices() {
		matriz = GeneradorMatrizOriginal();
		int[][]transpuesta = GeneradorMatrizTranspuesta(this.matriz);
		
		System.out.println("\nOriginal <==> Transpuesta");
		System.out.println();
		for(int i=0; i<this.matriz.length; i++) {
			System.out.print(" ");
			for(int j=0; j<this.matriz[0].length; j++) {
				System.out.print(this.matriz[i][j]+" ");
			}
			System.out.print("        ");
			for(int j=0; j<this.matriz[0].length; j++) {
				System.out.print(transpuesta[i][j]+" ");
			}
			System.out.println();
		}	
	}
}
