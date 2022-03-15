public class Genero {
	private String nombre;

	public Genero() {
		this.nombre = "Mujer";
	}

	public Genero(String nombre) {
		this.nombre = nombre;
	}

	//     GETTER
	public String getNombre() {
		return this.nombre;
	}

	//    SETTER
	public void setNombre(String pnombre) {

		if (!pnombre.isEmpty() && !(pnombre.length() < 5)) {
			this.nombre = pnombre;
		} else {
			System.out.println("Dato incorrecto");
		}
	}

	public String toString() {
		return "Nombre: " + this.nombre;
	}

}