package PracticasRepaso;

public class Practicas2 {
	public static void main(String []args) {
		char vector1[] = {'A','C','E','G','I'};
		char vector2[] = {'B','D','F','H','J'};
		char vector3[] = new char[10];
		int aux1 = 0, aux2 = 0;
		
		System.out.println("Vector1:");
		for(int i=0; i<5; i++) {
			System.out.print(vector1[i]+"");
		}
		System.out.println("\n\nVector2:");
		for(int i=0; i<5; i++) {
			System.out.print(vector2[i]+"");
		}
		
		for(int i=0; i<10;i++) {
			if((i%2)==0) {
				vector3[i] = vector1[aux1];
				aux1++;
			}
			else {
				vector3[i] = vector2[aux2];
				aux2++;
			}
		}
		
		System.out.println("\n\nVector3:");
		for(int i=0; i<10; i++) {
			System.out.print(vector3[i]+"");
		}
	}
}
