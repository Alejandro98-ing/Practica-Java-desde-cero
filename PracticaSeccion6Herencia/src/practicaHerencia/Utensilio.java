package practicaHerencia;

public class Utensilio {
	String nombre;
	String fechaCreacion;
	String tipoMaterial;
	
	Utensilio(){
	}
	
	Utensilio(String nombre,String fechaCreacion){
		this.nombre=nombre;
		this.fechaCreacion=fechaCreacion;
	}
	
	Utensilio(String nombre, String fechaCreacion, String tipoMaterial){
		this.nombre=nombre;
		this.fechaCreacion=fechaCreacion;
		this.tipoMaterial=tipoMaterial;
	}
	
	void hechoDeMaterial() {
		System.out.println("El "+nombre+" fue hecho de: "+tipoMaterial);
	}
	
	void creacion() {
		System.out.println("El "+nombre+" fue creado el: "+fechaCreacion);
	}
}
