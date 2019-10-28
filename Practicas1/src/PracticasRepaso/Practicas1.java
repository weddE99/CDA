package PracticasRepaso;

public class Practicas1 {
	public static void main(String []args) {
		int vector1[] = new int[10];
		int vector2[] = new int[10];
		int vector3[] = new int[20];
		int aux1 = 0, aux2 = 0;
		
		for(int i=0; i<10; i++) {
			vector1[i] = (int)Math.floor(Math.random()*10);
			vector2[i] = (int)Math.floor(Math.random()*10);
		}
		
		System.out.println("Vector 1:");
		for(int i=0; i<10; i++) {
			System.out.print(vector1[i]+"  ");
		}
		
		System.out.println("\n\nVector 2:");
		for(int i=0; i<10; i++) {
			System.out.print(vector2[i]+"  ");
		}
		
		for(int i=0; i<20; i++) {
			if((i%2)==0) {
				vector3[i] = vector1[aux1];
				aux1++;
			}
			else {
				vector3[i] = vector2[aux2];
				aux2++;
			}
		}

		System.out.println("\n\nVector Final: ");
		
		for(int i=0; i<vector3.length; i++) {
			System.out.print(vector3[i]+"  ");
		}
	}
}
