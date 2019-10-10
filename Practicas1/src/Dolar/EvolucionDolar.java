package Dolar;

public class EvolucionDolar {
	private float valorEuro;
	private float valorDolar;
	private float porcentajeEuro;
	
	public float getPorcentajeEuro() {
		return porcentajeEuro;
	}

	public void setPorcentajeEuro(float porcentajeEuro) {
		this.porcentajeEuro = porcentajeEuro;
	}

	public float getValorEuro() {
		return valorEuro;
	}

	public void setValorEuro(float valorEuro) {
		this.valorEuro = valorEuro;
	}

	public float getValorDolar() {
		return valorDolar;
	}

	public void setValorDolar(float valorDolar) {
		this.valorDolar = valorDolar;
	}

	public EvolucionDolar(float valorDolar, float valorEuro) {
		super();
		this.valorEuro = valorEuro;
		this.valorDolar = valorDolar;
	}

	public void incrementoDolar() {
		setPorcentajeEuro(this.valorEuro/4);
	}
	
	
	
	public void valorMoneda() {
		int contador = 0;
		int dia = 1;
		float [][]dias = new float[4][5];
		
		for(int i=0; i<dias.length; i++) {
			for(int j=0; j<dias[0].length; j++) {
				if(contador < 3) {
					dias[i][j] = this.valorDolar;
					contador++;
				}
				else {
					this.valorDolar += getPorcentajeEuro();
					dias[i][j] = valorDolar;
					contador = 0;
				}
			}
		}	
		for(int i=0; i<dias.length; i++) {
			System.out.println("* Semana: "+(i+1));
			for(int j=0; j<dias[0].length; j++) {
				System.out.print("Dia "+dia+": $"+String.format("%.2f",dias[i][j])+" | ");
				dia++;
			}
			System.out.println();
			System.out.println();
		}
	}
}
