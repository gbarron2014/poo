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

    //Constructores
    public Persona() {
        this.nombre = "";
        this.apellidos = "";
        this.direccion = "";
        this.telefono = "";
        this.fechaNacimiento = LocalDate.now(); //HOy
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

    public Persona (String nombre, String apellidos, LocalDate fechaNacimiento){
        this(nombre, apellidos); //Invocación de constructor con parámetro nombre
        this.fechaNacimiento = fechaNacimiento;
    }



    //Declaración de GETTERS
    public String getNombre() {
        return this.nombre;
    }

    public String getApellidos() {
        return this.apellidos;
    }

    public LocalDate getFechaNacimiento() {
        return this.fechaNacimiento;
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

    public String toString(){
        return "Nombre: " + this.nombre + 
                "\nApellidos: " + this.apellidos + 
                "\nFecha Nacimiento: " + this.fechaNacimiento + 
                "\nDirección: " + this.direccion + 
                "\nTelefono: " + this.telefono + 
                "\nGénero: " + this.genero;
    }
}