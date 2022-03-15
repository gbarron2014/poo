# Concepto de Encapsulacion

Programación orientada a objetos, se denomina encapsulamiento al ocultamiento del estado, es decir, de los datos miembro, de un objeto de manera que sólo se
puede cambiar mediante las operaciones definidas para ese objeto.

El encapsulamiento significa datos privados y métodos públic.

![imagen](https://user-images.githubusercontent.com/8560750/158092562-b7c5653c-2d56-4d94-bacd-35ed3c8481da.png)



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

# Definir la clase **Persona** implementando el encapsulamiento.
A la clase Persona se le conoce como Super Clase o clase Base
```
/*
* Clase que representa a todas las personas, es abstracta porque no puede instanciar
* objetos
*/
public abstract class Persona {

}
```
## Definir los atributos protegidos para sus Hijos
```
/*
* Clase que representa a todas las personas, es abstracta porque no puede instanciar
* objetos
*/
import java.time.LocalDate; //paquete donde se encuentra

public abstract class Persona {
    //Declaración de atributos protegidos
    protected String nombre;
    protected String apellidos;
    protected LocalDate fechaNacimiento;
    protected String direccion;
    protected String telefono;
    protected Genero genero; // referencia de objeto Genero
}
```

### Los GETTERS se implementan de la misma manera
```
    //Declaración de GETTERS
    public String getNombre() {
        return this.nombre;
    }

    public String getApellidos() {
        return this.apellidos;
    }

    public LocalDate getFechaNacimiento() {
        this.fechaNacimiento;
    }

    public String getDireccion() {
        return this.direccion;
    }

    public String getTelefono() {
        return this.telefono;
    }

    public Genero getGenero() {
        return this.genero;
    }
```
### Los SETTERS se implementan de la misma manera
```
    //Declaración de setters
    public void setNombre (String nombre) {
        this.nombre = nombre;
    }

    public void setApellidos (String apellidos) {
        this.apellidos = apellidos;
    }
    public void setDireccion (String direccion) {
        this.direccion = direccion;
    }
    public void setTelefono (String telefono) {
        this.telefono = telefono;
    }
    public void setFechaNacimiento (LocalDate fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }
    public void setGenero (Genero genero) {
        this.genero = genero;
    }
```
### Definición de constructores
Verificar que el constructor Genero("Mujer") exista sino implementarlos.
```
    //Constructores
    public Persona() {
        this.nombre = "";
        this.apellidos = "";
        this.direccion = "";
        this.telefono = "";
        this.genero = new Genero("Mujer");
    }

    public Persona (String nombre){
        this(); //Invocación de constructor sin parámetros
        this.nombre = nombre;
    }

    public Persona (String nombre, String apellidos){
        this(nombre); //Invocación de constructor con parámetro nombre
        this.apellidos = apellidos;
    }
```
### Desafío
- Implementar los constructores de acuerdo al diagrama.
- Implementar el método toString

# Clase **Docente**.
A la clase Docente se le conoce como Super HIja o clase Derivada
```
/*
* Clase paciente que hereda de clase Persona
*/
import java.time.LocalDate;

public class Paciente extends Persona {
    //Declaración de atributos privados
    private long id;
    private LocalDate aceptado;
    private String prescripciones;
    private String alergias;
}
```

## Implementando Getters
```
    // Implementando Getters
    public long getId() {
        return this.id;
    }

    public LocalDate getAceptado() {
        return this.aceptado;
    }

    public String getPrescripciones() {
        return this.prescripciones;
    }

    public String getAlergias() {
        return this.alergias;
    }
```
## Implementando Setters
```
    //Implementando Setters
    public void setId(long id) {
        this.id = id;
    }

    public void setAceptado(LocalDate aceptado) {
        this.aceptado = aceptado;
    }

    public void setPrescripciones(String prescripciones) {
        this.prescripciones = prescripciones;
    }

    public void setAlergias(String alergias) {
        this.alergias = alergias;
    }
```
### Constructores
```

    //Definición de constructores
    public Paciente() {
        super(); //Invoca a constructor Padre
        this.id = 0;
        this.aceptado = LocalDate.now(); //Fecha Hoy
        this.prescripciones = "";
        this.alergias = "";
    }

    public Paciente(long id) {
        this(); //Invoca a constructor 
        this.id = id;

    }

    public Paciente(long id, LocalDate aceptado) {
        this(id); //Invoca a constructor 
        this.aceptado = aceptado; 
    }
```

### Método toString
```
    public String toString() {
        return super.toString() + 
            "\nId: " + this.id +
            "\nPrescripciones: " + this.prescripciones + 
            "\nAlergias: " + this.alergias + 
            "\nFecha Aceptación: " + this.aceptado;
    }
```

# Test paciente
```
import java.time.LocalDate;

public class Test {
	public static void main(String[] args) {

		//Datos de persona
		Paciente p1 = new Paciente("Juan ", "Valdez Lima");
		p1.setFechaNacimiento(LocalDate.of(2002, 1 , 25));
		p1.setDireccion("Av Educación Tecnologíca 34");
		p1.setTelefono("4181825500");
		p1.setGenero(new Genero("Hombre"));

		//Valores de paciente
		p1.setId(1);
		p1.setAceptado(LocalDate.now()); //Hoy
		p1.setPrescripciones("Acido Acetil");
		p1.setAlergias("Polvo en Exceso");

		//Empleando método toString
		System.out.println(p1);
	}
}
```
