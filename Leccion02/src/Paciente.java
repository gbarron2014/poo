import java.util.Date;

public class Paciente extends Persona{
	public String id;
	public Date aceptado;
	public String prescripciones;
	public String alergias;
	
	public Paciente() {
		
	}

	public String toString() {
		return super.toString() + 
			"\nId " + this.id + 
			"\nAceptado " + this.aceptado +
			"\nPrescripciones " + this.prescripciones + 
			"\nAlergias " + this.alergias;
	}
}