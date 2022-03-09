# Definiendo la Herencia en Java

Observemos el siguiente diagrama.
![image](https://user-images.githubusercontent.com/8560750/157503492-f383e76b-53b7-4380-90d3-a2036f947f8a.png)

## Implementar la clase Persona
```
/**
* Descripción: Define a la clase Persona dentro del contexto UTNG.
* Autor: Gabriel Barrón
* Fecha: 09 Marzo 2022
*/
public class Persona extends Object{
	//Atributos de la clase
	public String nombre;
	public String apellidos;
	public String genero;
	public String curp;

	//Constructor Default
	Persona() {
		this.nombre = "";
		this.apellidos = "";
		this.genero = "Mujer";
		this.curp = "";
	}

	//Contructor con todos los valores
	Persona(String n, String a, String g, String c) {
		this.nombre = n;
		this.apellidos = a;
		this.genero = g;
		this.curp = c;
	}

	/*
	* Método que indica lo que se quiere saber de un objeto.
	*/
	public String toString() {
		return "Nombre: " + this.nombre +
			"\nApellidos: " + this.apellidos + 
			"\nGenero: " + this.genero +
			"\nCURP: " + this.curp;
	}		
}
```

Probar la clase a través del uso de constructores
```
/**
*Descripcion: Clase Generica para probar las clases de diagrama.
* Autor: Gabriel Barrón
* Fecha: 09 Marzo 2022
*/
public class Test{

	public static void main(String[] args) {
		Persona p1 = new Persona("Gabriel",
			 "Barron", 
			"Hombre",
			 "BARG740602HGTRDB07");

		System.out.println(p1);
		System.out.println();

		Persona p2 = new Persona();
		System.out.println(p2);
	}
}
```

Basta solamente con compilar la clase Test.java
```
  javac Test.java
```

Ejecución de la clase Test
```
  java Test
```
***
