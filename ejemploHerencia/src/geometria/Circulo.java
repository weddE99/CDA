package geometria;

public class Circulo extends FiguraGeometrica{
	public Circulo(double valor1) {
		super(valor1);
	}
	
	@Override
	public double getArea() {
		return Math.PI*Math.pow(this.getValor1(),2);
	}
	
	@Override
	public double getPerimetro() {
		return Math.PI*this.getValor1()*4;
	}
	
	public double getRadio() {
		return getPerimetro()/2;
	}
}
