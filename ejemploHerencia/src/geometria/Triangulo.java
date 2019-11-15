package geometria;

public class Triangulo extends FiguraGeometrica{
	private double valor2;
	
	public double getValor2() {
		return valor2;
	}

	public void setValor2(double valor2) {
		this.valor2 = valor2;
	}

	public Triangulo(double valor1, double valor2) {
		super(valor1);
		this.valor2 = valor2;
	}
	
	@Override
	public double getArea() {
		return (this.getValor1()*this.getValor2()/2);
	}
	
	@Override
	public double getPerimetro() {
		return this.getValor1() + (2 * Math.sqrt((Math.pow(this.getValor1(), 2)+Math.pow(this.valor2, 2))));
	}
}
