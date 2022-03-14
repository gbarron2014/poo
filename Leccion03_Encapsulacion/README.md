# Concepto de Encapsulacion

Programación orientada a objetos, se denomina encapsulamiento al ocultamiento del estado, es decir, de los datos miembro, de un objeto de manera que sólo se
puede cambiar mediante las operaciones definidas para ese objeto.

El encapsulamiento significa datos privados y métodos públic.



# Definir la clase **Genero** implementando el encapsulamiento.
![imagen](https://user-images.githubusercontent.com/8560750/158085234-92ef32f9-5277-4ede-8100-e44ca460d142.png)
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

Los métodos **setters** me permiten validar que la información sea correcta; en otro caso, no modifica el valor.
```
	/*
	* Establece el nombre de la propiedad nombre
	*/
	public void setNombre(String pNombre) {
		//Verifica que el nombre NO sea vacío o nulo
		if (!(pNombre.isBlank() || pNombre == null)) {
			this.nombre = pNombre; //Asigna el valor tomado por el parámetro
		}

		return; //Por el simple hecho de usarlo
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

### Implementar la clase TestGenero para verificar el funcionamiento
- Crear un objeto e tipo Genero.
- Utilzar el método get y set para conocer el estado de un objeto y modificarlo.

```
/**
 * Clase que prueba el Genero.
 * Autor: Gabriel Barrón
 * fecha: 1 Marzo 2022
 */
public class TestGenero {
	public static void main(String args[]) {
		Genero objGenero = new Genero(); // Se crea un objeto de tipo Genero
		objGenero.setNombre("Mujer"); //Modificar el estado del Genero
		
		System.out.println("Género " + objGenero.getNombre()); //Conocer el estado
	}
}
```


#### Desafío
- Modifica la validación del método setter donde valida que la longitud del nombre debe ser 3 o más.
- Agregar el contructor default donde establezcas el valor de nombre a vacio.
- Agregar el contructor donde se agregue el parámetro nombre y valide que el nombre no debe ser vacío o null y la longitud menor a 3, solamente admita letras y espacios.
- Utiliza la referencia de los métodos: isBlank, isEmpty, length [Referencia Java 11](https://howtodoinjava.com/java11/check-blank-string/)

***
# Definir la clase **Hospital** implementando el encapsulamiento.
![imagen](https://user-images.githubusercontent.com/8560750/158090885-5f06aabb-e5a0-43fd-ad02-dc53ffac649e.png)

### Definiendo los atributos privados
```
/**
 * Representa la clase Hospital encapsulada.
 * Autor: Gabriel Barrón
 * Fecha: 1 Marzo 2021
 */
public class Hospital {

    //Atributos privados
    private String nombre;
    private String director;
    private String direccion;
    private String telefono;
}
```

### Definiendo métodos GETTERS
```
/**
 * Representa la clase Hospital encapsulada.
 * Autor: Gabriel Barrón
 * Fecha: 1 Marzo 2021
 */
public class Hospital {

    //Atributos privados
    private String nombre;
    private String director;
    private String direccion;
    private String telefono;

    //---GETTERS
    public String getDirector() {
        return this.director;
    }

    public String getDireccion() {
        return this.direccion;
    }

    public String getTelefono() {
        return this.telefono;
    }

    public String getNombre() {
        return this.nombre;
    }
}

```
### Definiendo métodos SETTERS
```
    //--------------SETTERS
    public void setNombre (String pNombre) {
        //Valida que no sea nulo o vacío y longitud mayor a 10
        if (!(pNombre.isBlank() || pNombre.length() < 10)) {
            this.nombre = pNombre;
        }
    }

    public void setDirector(String pDirector) {
        this.director = pDirector;
    }

    public void setDireccion(String pDireccion) {
        this.direccion = pDireccion;
    }

    public void setTelefono(String pTelefono) {
        this.telefono = pTelefono;
    }
```

### Desafío
- Definir los constructores en todos sus sabores de acuerdo al diagrama de clase.
- Validar que el nombre: No sea vacío o nulo, acepte solo letras y espacios en blanco y longitud no menor a 10
- Validar que el director: No sea vacío o nulo, acepte solo letras y espacios en blanco y longitud no sea menor a 25
- Implemenentar el método toString
