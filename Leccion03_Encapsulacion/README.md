# Concepto de Encapsulacion

Programación orientada a objetos, se denomina encapsulamiento al ocultamiento del estado, es decir, de los datos miembro, de un objeto de manera que sólo se
puede cambiar mediante las operaciones definidas para ese objeto.

El encapsulamiento significa datos privados y métodos públic.
![imagen](https://user-images.githubusercontent.com/8560750/158085234-92ef32f9-5277-4ede-8100-e44ca460d142.png)


### Definir la clase con el atributo privado

```
/**
 * Descripcion: Clase que representa el Genero de una persona
 * Autor: Gabriel Barron
 * Fecha: 24 Febrero 2022 
*/
public class Genero {
	//Atributos de la clase
	private String nombre ;
}

```

### Getters
- Anteponer el prefijo **get** y enseguida el nombre del atributo.
- Seguir las reglas nomenclatura de un método en java.

```
/**
 * Descripcion: Clase que representa el Genero de una persona
 * Autor: Gabriel Barron
 * Fecha: 24 Febrero 2022 
*/
public class Genero {
	//Atributos de la clase
	private String nombre ;

	/*
	* Método público que regresa el estado del atributo Nombre.
	* return Regresa el estado de propiedad nombre.
	*/
	public String getNombre() {
		return this.nombre;
	}
	
}
```

### Setters
- Anteponer el prefijo **set** al nombre del atributo.
- Seguir las reglas nomenclatura

```
/**
 * Descripcion: Clase que representa el Genero de una persona
 * Autor: Gabriel Barron
 * Fecha: 24 Febrero 2022 
*/
public class Genero {
	//Atributos de la clase
	private String nombre ;

	/*
	* Método público que regresa el estado del atributo Nombre.
	* return Regresa el estado de propiedad nombre.
	*/
	public String getNombre() {
		return this.nombre;
	}
	
	/*
	* Establece el nombre de la propiedad nombre
	*/
	public void setNombre(String pNombre) {
		this.nombre = pNombre; //Asigna el valor tomado por el parámetro
	}
}
```

### Implementar el método toString

```
	/*
	* Regresa el contenido del objeto
	*/
	public String toString() {
		return "Género: " + this.nombre;
	}
```
