package Alumnos;

public class Alumno {
	private int dni;
	private String nombre;
	private String apellido;
	private int edad;
	
	public int getDni(){
		return dni;
	}
	public void setDni(int dni) {
		this.dni = dni;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	
	public void mostrarDatos() {
		System.out.println("===================\nNombre: "+getNombre()+"\nApellido: "+getApellido()+
				"\nDNI: "+getDni()+"\nEdad: "+getEdad()+"\n===================\n");
	}

	public Alumno(int dni, String nombre, String apellido, int edad) {
		super();
		this.dni = dni;
		this.edad = edad;
		this.nombre = nombre;
		this.apellido = apellido;
	}
	public Alumno() {

	}
}
