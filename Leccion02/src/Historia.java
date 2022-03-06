import java.util.Date;

import java.util.Date;

public class Historia {
	public String idEnfermedad;
	public String nombre;
	public String descripcion;
	public Date registro;

	public Historia(String pIdEnfermedad, 
		String pNombre, 
		String pDescripcion,
		Date registro) {
		this.idEnfermedad = pIdEnfermedad;
	}

	public String toString() {
		return "Id " + this.idEnfermedad +
			"\nNombre " + this.nombre + 
			"\nDescripcion " + this.descripcion +
			"\Fecha Registro " + this.registro;
	}

}