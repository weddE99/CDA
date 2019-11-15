package ejemploHerencia;

public class Alumnos extends Persona{
	private int idAlumno;
	
	public int getIdAlumno() {
		return idAlumno;
	}
	public void setIdAlumno(int idAlumno) {
		this.idAlumno = idAlumno;
	}

	public Alumnos(String nombre, String apellido, int edad, int idAlumno) {
		super(nombre, apellido, edad);
		this.idAlumno = idAlumno;
	}
	
	public Alumnos() {

	}

	public void printAlumno() {
		System.out.println("Nombre: "+getNombre()+"\nApellido: "+getApellido()+"\nEdad: "
							+getEdad()+"\nidAlumno: "+getIdAlumno());
	}
	
}
