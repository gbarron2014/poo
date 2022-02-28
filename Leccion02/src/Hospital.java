/**
* La clase Hospital representa a todos los hospitales
* de la región Norte de Guanajuato.
*/
public class Hospital {

	public String nombre;
	public String direccion;
	public String telefono;

	//Sección de constructores
	Hospital() {

	}

	Hospital(String pNombre) {
		this.nombre = pNombre;
		this.direccion = "";
		this.telefono = "";
	}

	public String toString() {
		String texto = "Nombre " + this.nombre +
			"\nDireccion: " + this.direccion +
			"\nTelefono: " + this.telefono;

		return texto;

	}
}