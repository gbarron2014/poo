public class Hospital {

	// Datos o atributos privados
	private String nombre;
	private String director;
	private String direccion;
	private String telefono;

	//  GETTERS
	public String getNombre() {
		return this.nombre;
	}

	public String getDirector() {
		return this.director;
	}

	public String getDireccion() {
		return this.direccion;
	}

	public String getTelefono() {
		return this.telefono;
	}

	// SETTERS
	public void setNombre(String name) {
		this.nombre = name;
	}

	public void setDirector(String director) {
		this.director = director;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public String toString() {
		return "Nombre: " + this.nombre +
			"\nDirector: " + this.director + 
			"\nDirección: " + this.direccion + 
			"\nTeléfono: " + this.telefono;
	}
}