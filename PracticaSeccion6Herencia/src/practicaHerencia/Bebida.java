package practicaHerencia;

public class Bebida {
	String nombre;
	String fechaCreacion;
	String sabor;
	
	Bebida(){
	}
	
	Bebida(String nombre,String fechaCreacion){
		this.nombre=nombre;
		this.fechaCreacion=fechaCreacion;
	}
	
	Bebida(String nombre, String fechaCreacion, String sabor){
		this.nombre=nombre;
		this.fechaCreacion=fechaCreacion;
		this.sabor=sabor;
	}
	
	void suSabor() {
		System.out.println("El "+nombre+" es de sabor: "+sabor);
	}
	
	void creacion() {
		System.out.println(nombre+" fue creado el: "+fechaCreacion);
	}
}
