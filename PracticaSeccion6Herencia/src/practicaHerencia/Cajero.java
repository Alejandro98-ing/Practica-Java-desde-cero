package practicaHerencia;

public class Cajero extends Empleado {
	float sueldo;
	
	Cajero(float sueldo, String nombre, String fechaNacimiento, String dui, String FechaInicioTrabajo){
		super(nombre, fechaNacimiento, dui, FechaInicioTrabajo);
		this.sueldo=sueldo;
	}
	
	@Override
	void dedicarse(String cargo) {
		System.out.println("Soy "+nombre
				+ " y soy: "+cargo);
	}
	
	void cobrar() {
		System.out.println("Soy "
				+nombre+" y estoy cobrando");
	}
}
