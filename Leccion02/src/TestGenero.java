import java.util.Date;

public class TestGenero {
	public static void main(String[] args) {
		
		Paciente p1 = new Paciente();
		p1.nombre = "Vladimir";
		p1.apellidos = "Putin";
		p1.fechaNacimiento = new Date();					
		p1.telefono = "4181322114";
		p1.direccion = "Fracc. Gto";
		p1.historia = new Historia("1","Sobrepeso","Estas 10 kg más", new Date());

		System.out.println(p1);
	}
}