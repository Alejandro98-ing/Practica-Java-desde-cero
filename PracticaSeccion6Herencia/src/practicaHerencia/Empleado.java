package practicaHerencia;

public class Empleado {
	String nombre;
	String fechaNacimiento;
	String dui;
	String fechaInicioTrabajo;
	
	Empleado(){
	}
	
	Empleado(String nombre,String fechaInicioTrabajo){
		this.nombre=nombre;
		this.fechaInicioTrabajo=fechaInicioTrabajo;
	}
	
	Empleado(String nombre, String fechaNacimiento, String dui, String fechaInicioTrabajo){
		this.nombre=nombre;
		this.fechaNacimiento=fechaNacimiento;
		this.dui=dui;
		this.fechaInicioTrabajo=fechaInicioTrabajo;
	}
	
	void trabajar() {
		System.out.println("Soy "+nombre
				+ " y estoy trabajando desde "+fechaInicioTrabajo);
	}
	
	void comer() {
		System.out.println("Soy "+nombre
				+ " y estoy comiendo");
	}
	
	void dedicarse(String cargo) {
		System.out.println("Soy "+nombre
				+ " y soy: "+cargo);
	}
	
}
