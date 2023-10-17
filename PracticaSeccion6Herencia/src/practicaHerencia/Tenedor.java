package practicaHerencia;

public class Tenedor extends Utensilio {
	String color;
	Tenedor(String color, String nombre, String fechaCreacion, String tipoMaterial){
		super(nombre, fechaCreacion, tipoMaterial);
		this.color=color;
	}
	
	@Override
	void hechoDeMaterial() {
		System.out.println("El "+nombre
				+ " fue hecho de "+tipoMaterial+" para gusto del cliente");
	}
	
	void colorTenedor() {
		System.out.println("El "+nombre
				+ " es de color "+color);
	}
}
