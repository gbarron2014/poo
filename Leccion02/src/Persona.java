import java.util.*;

public class Persona {
	public String nombre;
	public String apellidos;
	public Date fechaNacimiento;
	public Genero genero;
	public String telefono;
	public String direccion;
	
	Persona() {
	}

	Persona(String pNombre) {
		this.nombre = pNombre;
	}

	Persona(String pNombre, String pApellidos) {
		this.nombre = pNombre;
		this.apellidos = pApellidos;
	}

	public String toString() {
		return "Nombre " + this.nombre +
			"\nApellidos " + this.apellidos +
			"\nFecha Nacimiento " + this.fechaNacimiento + 
			"\nGenero " + this.genero + 
			"\nTelefono " + this.telefono +
			"\nDireccion " + this.direccion;
	}


}// Fin clase