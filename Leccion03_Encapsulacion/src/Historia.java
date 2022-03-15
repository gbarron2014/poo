/*
* Clase Historia
*/
import java.time.LocalDate;

public class Historia {
    private long id;
    private String nombre;
    private LocalDate registro;
    private Paciente paciente;

    public Historia() {
        this.id = 0;
        this.nombre = "";
        this.registro = LocalDate.now();
        this.paciente = null;
    }

    public Historia(long id) {
        this();
        this.id = id;
    }

    public long getId() {
        return this.id;
    }

    public String getNombre() {
        return this.nombre;
    }

    public LocalDate getRegistro() {
        return this.registro;
    }

    public Paciente getPaciente() {
        return this.paciente;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setRegistro(LocalDate registro) {
        this.registro = registro;
    }

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    } 

    public String toString() {
        return "Id: " + this.id + 
            "\nNombre: " + this.nombre + 
            "\nRegistro: " + this.registro +
            "\nPaciente: " + this.paciente;
    }
}
