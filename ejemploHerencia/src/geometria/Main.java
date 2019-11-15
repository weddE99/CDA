package geometria;

public class Main {
	public static void main(String []args) {
		System.out.println("    ** FIGURAS GEOMETRICAS **");
		System.out.println();
		FiguraGeometrica figura;
		figura = new Cuadrado(5);
		System.out.println("* "+figura.getClass());
		System.out.println("\tArea: " +figura.getArea());
		System.out.println("\tPerimetro: " +figura.getPerimetro());
		figura = new Rectangulo(5,2);
		System.out.println("\n* "+figura.getClass());
		System.out.println("\tArea: " +figura.getArea());
		System.out.println("\tPerimetro: " +figura.getPerimetro());
		figura = new Triangulo(5,2);
		System.out.println("\n* "+figura.getClass());
		System.out.println("\tArea: " +figura.getArea());
		System.out.println("\tPerimetro: " +figura.getPerimetro());
		
		Circulo c = new Circulo(5);
		System.out.println("\n* "+c.getClass());
		System.out.println("\tArea: " +c.getArea());
		System.out.println("\tPerimetro: " +c.getPerimetro());
		System.out.println("\tRadio: " +c.getRadio());
	}
}
