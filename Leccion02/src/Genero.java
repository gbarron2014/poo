/**
 * Descripcion: Clase que representa el Genero de una persona
 * Autor: Gabriel Barron
 * Fecha: 24 Febrero 2022 
*/
public class Genero {
	public String nombre ;

	Genero() {
		System.out.println("Construyendo un objeto Genero");
	}

	Genero (String pNombre) {
		this.nombre = pNombre;
		System.out.println("Construyendo un objeto Genero " + this.nombre);
	}

	public String toString() {
		return "Nombre: " + this.nombre;
	}
}