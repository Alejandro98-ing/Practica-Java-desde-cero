package practicaHerencia;

public class Refresco extends Bebida {
	String marca;
	Refresco(String marca, String nombre, String fechaCreacion, String sabor){
		super(nombre, fechaCreacion, sabor);
		this.marca=marca;
	}
	
	@Override
	void suSabor() {
		System.out.println("El refresco de "+nombre
				+ " tiene un delicioso sabor a"+sabor
				+" y además es muy saludable");
	}
	
	void suMarca() {
		System.out.println("La marca del refresco es: "
				+marca);
	}
}
