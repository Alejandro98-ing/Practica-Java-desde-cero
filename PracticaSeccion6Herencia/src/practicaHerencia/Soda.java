package practicaHerencia;

public class Soda extends Bebida {
	String marca;
	Soda(String marca, String nombre, String fechaCreacion, String sabor){
		super(nombre, fechaCreacion, sabor);
		this.marca=marca;
	}
	
	@Override
	void suSabor() {
		System.out.println("La soda de "+nombre
				+ " tiene un delicioso sabor "+sabor
				+" y no es muy saludable");
	}
	
	void suMarca() {
		System.out.println("La marca del refresco es: "
				+marca);
	}
}
