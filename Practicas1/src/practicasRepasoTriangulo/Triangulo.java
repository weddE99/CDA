package practicasRepasoTriangulo;

import java.util.Scanner;

public class Triangulo {
	private Integer lado1;
	private Integer lado2;
	private Integer lado3;
	private Integer perimetro;
	private double area;
	private double altura;
	
	public double getAltura() {
		return altura;
	}
	public void setAltura(double altura) {
		this.altura = altura;
	}
	public Integer getPerimetro() {
		return perimetro;
	}
	public void setPerimetro(Integer perimetro) {
		this.perimetro = perimetro;
	}
	public double getArea() {
		return area;
	}
	public void setArea(double area) {
		this.area = area;
	}
	public Integer getLado1() {
		return lado1;
	}
	public void setLado1(Integer lado1) {
		this.lado1 = lado1;
	}
	public Integer getLado2() {
		return lado2;
	}
	public void setLado2(Integer lado2) {
		this.lado2 = lado2;
	}
	public Integer getLado3() {
		return lado3;
	}
	public void setLado3(Integer lado3) {
		this.lado3 = lado3;
	}
	
	public Integer perimetro(Integer lado1, Integer lado2, Integer lado3) {
		return (lado1+lado2+lado3);
	}
	
	public double area(Integer lado1, Integer lado2, Integer lado3) {
		double aux, rta;
		aux = (lado1+lado2+lado3)/2;
		rta = Math.sqrt(aux*((aux-lado1)*(aux-lado2)*(aux-lado3)));
		return rta;
	}
	
	public void compararTriangulos() {
		int rta = 0;
		int max = 0;
		double max2 = 0;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Ingrese cantidad de triangulos a comparar: ");
		rta = sc.nextInt();
		int valor[][] = new int[rta][3];
		
		for(int i=0; i<rta; i++) {
			System.out.println("\nIngrese valores del triangulo "+(i+1));
			for(int j=0; j<3; j++) {
				System.out.print("* Ingrese lado: ");
				valor[i][j] = sc.nextInt();
			}
		}
		
		for(int i=0; i<rta; i++) {
			int perimetro = perimetro(valor[i][0],valor[i][1],valor[i][2]);
			double area = area(valor[i][0],valor[i][1],valor[i][2]);
			
			if(perimetro > max || i==0) {
				max = perimetro;
			}
			if(area > max2 || i==0) {
				max2 = area;
			}
			
		}
		System.out.println("\nEl mayor perimetro es: "+max);
		System.out.println("La mayor area es: "+max2);
		sc.close();
	}
	
	public void isTrianguloIsosceles() {
		
		if(this.lado1 == this.lado2 || this.lado1 == this.lado3) {
			perimetro = perimetro(this.lado1,this.lado2,this.lado3);
			area = area(this.lado1,this.lado2,this.lado3);
		}
		else {
			if(this.lado2 == this.lado1 || this.lado2 == this.lado3) {
				perimetro = perimetro(this.lado1,this.lado2,this.lado3);
				area = area(this.lado1,this.lado2,this.lado3);
			}
			else {
				System.out.println("C");
				if(this.lado3 == this.lado1 || this.lado3 == this.lado2) {
					perimetro = perimetro(this.lado1,this.lado2,this.lado3);
					area = area(this.lado1,this.lado2,this.lado3);
				}
				else System.out.println("El triangulo no es isosceles!");
			}
		}
	}
	
	public Triangulo(Integer lado1, Integer lado2, Integer lado3) {
		super();
		this.lado1 = lado1;
		this.lado2 = lado2;
		this.lado3 = lado3;
	}
	public Triangulo() {
		
	}
}
