package ejemploHerencia;

public class Main {
	public static void main(String []args) {
		Alumnos a = new Alumnos();
		a.setApellido("Dabrowski");
		a.setEdad(20);
		a.setNombre("Wilson");
		a.setIdAlumno(001);
		Alumnos b = new Alumnos("Emanuel","Dabrowski",20,002);
		a.printAlumno();
		System.out.println();
		b.printAlumno();
	}
}
