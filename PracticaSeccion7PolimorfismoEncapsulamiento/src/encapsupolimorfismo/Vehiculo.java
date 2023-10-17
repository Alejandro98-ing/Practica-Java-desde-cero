package encapsupolimorfismo;

public abstract class Vehiculo {
	private String marca;
	private String modelo;
	private String fechaFabricacion;
	private double kilometraje;
	
	public Vehiculo() {
	}

	public Vehiculo(String marca, String modelo, String fechaFabricacion, double kilometraje) {
		super();
		this.marca = marca;
		this.modelo = modelo;
		this.fechaFabricacion = fechaFabricacion;
		this.kilometraje = kilometraje;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getFechaFabricacion() {
		return fechaFabricacion;
	}

	public void setFechaFabricacion(String fechaFabricacion) {
		this.fechaFabricacion = fechaFabricacion;
	}

	public double getKilometraje() {
		return kilometraje;
	}

	public void setKilometraje(double kilometraje) {
		this.kilometraje = kilometraje;
	}
	
	public void obtenerInformacion() {
		
	}
	
	public void Acelerar() {
		
	}
	
	public void Frenar() {
		
	}
	
	public void velocidadActual(){
		
	}
}
