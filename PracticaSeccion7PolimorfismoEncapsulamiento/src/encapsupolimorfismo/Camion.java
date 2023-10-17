package encapsupolimorfismo;

public class Camion extends Vehiculo {
	private double capacidadCarga;
	private String tipoCarga;
	
	public Camion() {
	}

	public Camion(String marca, String modelo, String fechaFabricacion, int kilometraje, double capacidadCarga, String tipoCarga) {
		super(marca, modelo, fechaFabricacion, kilometraje);
		this.capacidadCarga = capacidadCarga;
		this.tipoCarga = tipoCarga;
	}
	
	@Override
	public void Frenar() {
		System.out.println("El camion "+super.getMarca()
		+" hace su recorrido a"
		+super.getKilometraje()+" para no causar accidentes");
	}
	
	public void cargarCamion() {
		System.out.println("Se cargará"+tipoCarga
				+" en el camión"
				+" hasta que llegue a "+capacidadCarga
				+"toneladas");
	}
	
	public void descargarCamion() {
		System.out.println("El camión esta siendo descargado");
	}
}
