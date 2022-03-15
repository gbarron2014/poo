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
		System.out.println(p1);
	}
}