import java.util.Scanner;

public class AdminCine {
	int[][][] butacas = new int[3][4][5];
	int[][] salasButacas = new int[3][1];
	int[] recaudacion = new int[3];
	int salir = 0;
	
	public void compraEntradas(){
		int pelicula, edad, cantidad, pers, posF, posC, error=0, entradasT = 0;
		int user;
		for(int i=0; i<3; i++) {
			salasButacas[i][0] = 20;
			recaudacion[i] = 0;
		}
		Scanner sc = new Scanner(System.in);
		
		System.out.println("** CINE DAB **\n");
		
		do {
			do {
				System.out.print("** Ingrese tipo de usuario (user = 1) (root = 2) (salir = 3): ");
				user = sc.nextInt();
			}while(user != 1 && user != 2  && user != 3);
		
		if(user == 1) {
		do {	
			System.out.println("\n\n* PELICULAS DISPONIBLES:\t\t\t* PRECIOS:\n"
				+ "\tPelicula 1. (15:30hs en Sala 1)\t\t\t NIÑO: $15.\n"
				+ "\tPelicula 2. (18:45hs en Sala 2)\t\t\t ADULTO: $20.\n"
				+ "\tPelicula 3. (22:00hs en Sala 3)\t\t\t +65 AÑOS $18.\n");
		
			for(int i=0; i<3; i++) {
				if(salasButacas[i][0] > 0){
					System.out.println("\tPelicula "+(i+1)+" --> ENTRADAS DISPONIBLES: "+salasButacas[i][0]);
				}
				else if(salasButacas[i][0] == 0) {
					System.out.println("\tPelicula "+(i+1)+" --> ENTRADAS AGOTADAS!!");
				}
			}
		
			do{
				do {
					System.out.print("\n* Ingrese pelicula a ver: (1,2,3): ");
					pelicula = sc.nextInt();
				}while(pelicula <1 || pelicula >3);
				
				System.out.println("* Esquema de la sala *");	
				System.out.print("\n\t");
				for(int j=0; j<4; j++) {
					for(int k=0; k<5; k++) {
						System.out.print(butacas[(pelicula)-1][j][k]+" ");
					}
					System.out.println();
					System.out.print("\t");
				}
				
				if(pelicula == 1) {
					System.out.print("\n* Ingrese la cantidad de entradas a comprar: ");
					cantidad = sc.nextInt();
					entradasT += cantidad;
					
					if(salasButacas[0][0] > 0 && cantidad <= salasButacas[0][0]) {
						salasButacas[0][0] -= cantidad;
					}
					else{
						if(salasButacas[0][0] == 0) {
							System.out.println("* SALA LLENA!");
							pelicula = 0;
						}
						else {
							System.out.println("\n* ERROR! SU INTENTO DE COMPRA SUPERA LAS ENTRADAS DISPONIBLES!.\n");
							pelicula = 0;
						}
					}
				}
				else {
					if(pelicula == 2) {
						System.out.print("\n* Ingrese la cantidad de entradas a comprar: ");
						cantidad = sc.nextInt();
						entradasT += cantidad;
						
						if(salasButacas[1][0] > 0 && cantidad <= salasButacas[1][0]) {
							salasButacas[1][0] -= cantidad;
						}
						else {
							if(salasButacas[1][0] == 0){
								System.out.println("* SALA LLENA!");
								pelicula = 0;
							}
							else {
								System.out.println("\n* ERROR! SU INTENTO DE COMPRA SUPERA LAS ENTRADAS DISPONIBLES!.\n");
								pelicula = 0;
							}
						}
					}
					else {
						System.out.print("\n* Ingrese la cantidad de entradas a comprar: ");
						cantidad = sc.nextInt();
						entradasT += cantidad;
						
						if(salasButacas[2][0] > 0 && cantidad <= salasButacas[2][0]) {
							salasButacas[2][0] -= cantidad;
						}
						else {
							if(salasButacas[2][0] == 0){
								System.out.println("* SALA LLENA!");
								pelicula = 0;
							}
							else{
								System.out.println("\n* ERROR! SU INTENTO DE COMPRA SUPERA LAS ENTRADAS DISPONIBLES!.\n");
								pelicula = 0;
							}
						}
					}
				}
			}while(pelicula <1 || pelicula >3);
			
			System.out.println();
			pers = 1;
			do{
				System.out.print("* Ingrese edad de la persona "+pers+": ");
				edad = sc.nextInt();
				cantidad--;
				pers++;				
				
				do {	
					if(error == 1)System.out.println("* La butaca ya esta ocupada! *\n");
					System.out.println("* Ingrese posicion en la sala: ");
					do{
						System.out.print("* \tColumna: ");
						posC = sc.nextInt();
					}while(posC >5 || posC <0);
					do {
						System.out.print("* \tFila: ");
						posF = sc.nextInt();
					}while(posF >4 || posF <0);
					
					if(butacas[(pelicula)-1][(posF)-1][(posC)-1] == 0) {
						butacas[(pelicula)-1][(posF)-1][(posC)-1] = 1;
						error = 0;
					}
					else error = 1;
				}while(error == 1);
				
				if(edad < 18) {
					if(pelicula == 1)recaudacion[0] += 15;
					if(pelicula == 2)recaudacion[1] += 15;
					if(pelicula == 3)recaudacion[2] += 15;
				}
				else {
					if(edad < 65) {
						if(pelicula == 1)recaudacion[0] += 20;
						if(pelicula == 2)recaudacion[1] += 20;
						if(pelicula == 3)recaudacion[2] += 20;
					}
					else {
						if(pelicula == 1)recaudacion[0] += 18;
						if(pelicula == 2)recaudacion[1] += 18;
						if(pelicula == 3)recaudacion[2] += 18;
					}
				}
			}while(edad<0 || cantidad >0);
				
			do {
				if(salir != 0 && salir != 1) System.out.println("\n* OPCION INCORRECTA!\n");
				System.out.print("\n* Desea seguir comprando? (SI: 1 NO: 0): ");
				salir = sc.nextInt();
			}while(salir != 0 && salir != 1);
			
		}while(salir == 1  && entradasT <= 60);
		
		if(entradasT == 60) System.out.println("\n* ERROR! TODAS LAS ENTRADAS AGOTADAS!.\n");
		
		}
		if(user == 2) {
			System.out.println();
			
			System.out.println("* Esquema de las salas *");	
			System.out.print("\n");
			for(int i=0; i<3; i++) {
				System.out.print("Sala"+(i+1)+"\n\t");
				for(int j=0; j<4; j++) {
					for(int k=0; k<5; k++) {
						System.out.print(butacas[i][j][k]+" ");
					}
					System.out.println();
					System.out.print("\t");
				}
				System.out.println();
			}
			
			for(int i=0; i<3; i++) {
				System.out.println("** La Recaudacion total de la pelicula "+(i+1)+" fue de: $"+recaudacion[i]+" **");
			}
		}
		
		if(user != 3) {	
			do {
				if(salir != 0 && salir != 1 && user != 3) System.out.println("\n* OPCION INCORRECTA!\n");
				System.out.print("\n* Desea cambiar de usuario: (si = 1) (no = 2): ");
				salir = sc.nextInt();
			}while(salir != 1 && salir != 2);
		}
		if(salir != 2 && user != 3)System.out.print("\n\n\n\n\n\n\n\n\n\n\n\n");
		}while(user != 3 && salir != 2);
		
		System.out.println("\nSaliendo.\n");
		sc.close();
	}
}
