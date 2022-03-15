
import java.time.LocalDate;
/*
* Clase paciente que hereda de clase Persona
*/
public class Paciente extends Persona {
    //Declaración de atributos privados
    private long id;
    private LocalDate aceptado;
    private String prescripciones;
    private String alergias;

    //Definición de constructores
    public Paciente(String nombre) {
        super(nombre);
    }

    public Paciente(String nombre, String apellidos) {
        super(nombre, apellidos);
    }

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

    public Paciente(long id, LocalDate aceptado, String prescripciones) {
        this(id, aceptado); //Invoca a constructor 
        this.prescripciones = prescripciones; 
    }

    public Paciente(long id, LocalDate aceptado, String prescripciones, String alergias) {
        this(id, aceptado, prescripciones); //Invoca a constructor 
        this.alergias = alergias; 
    }

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

    public String toString() {
        return super.toString() + 
            "\nId: " + this.id +
            "\nPrescripciones: " + this.prescripciones + 
            "\nAlergias: " + this.alergias + 
            "\nFecha Aceptación: " + this.aceptado;
    }
}