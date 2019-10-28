package practicasRepasoTriangulo;

public class Programa {
	public static void main(String []args) {
		Triangulo t = new Triangulo(6,5,5);
		t.isTrianguloIsosceles();
		System.out.println("El perimetro es: "+t.getPerimetro());
		System.out.println("El area es: "+t.getArea());
		
		System.out.println();
		t.compararTriangulos();
	}
}
