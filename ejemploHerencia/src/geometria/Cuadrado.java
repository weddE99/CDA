package geometria;

public class Cuadrado extends FiguraGeometrica{
	public Cuadrado(double valor1) {
		super(valor1);
	}
	
	@Override
	public double getArea() {
		return Math.pow(this.getValor1(),2);
	}
	
	@Override
	public double getPerimetro() {
		return this.getValor1()*4;
	}
}
