package Practicas;
import java.util.Scanner;

public class Saludo {
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Ingrese su nombre: ");
		String nombre = scan.nextLine();
		System.out.println("Bienvenido "+nombre+"!");
		scan.close();
	}
}
