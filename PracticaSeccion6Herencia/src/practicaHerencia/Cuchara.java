package practicaHerencia;

public class Cuchara extends Utensilio {
	String color;
	Cuchara(String color, String nombre, String fechaCreacion, String tipoMaterial){
		super(nombre, fechaCreacion, tipoMaterial);
		this.color=color;
	}
	
	@Override
	void hechoDeMaterial() {
		System.out.println("La "+nombre
				+ " fue hecho de "+tipoMaterial+" para gusto del cliente");
	}
	
	void colorTenedor() {
		System.out.println("La "+nombre
				+ " es de color "+color);
	}
}
