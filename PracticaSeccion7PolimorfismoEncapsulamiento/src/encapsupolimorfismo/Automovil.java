package encapsupolimorfismo;

public class Automovil extends Vehiculo {
	private int numeroPuertas;
	private String tipoGasolina;
	
	public Automovil(String marca, String modelo, String fechaFabricacion, int kilometraje, int numeroPuertas, String tipoGasolina) {
		super(marca, modelo, fechaFabricacion, kilometraje);
		this.numeroPuertas = numeroPuertas;
		this.tipoGasolina = tipoGasolina;
	}
	
	public Automovil(int numeroPuertas, String tipoGasolina) {
		this.numeroPuertas = numeroPuertas;
		this.tipoGasolina = tipoGasolina;
	}

	@Override
	public void Acelerar() {
		System.out.println("El vehículo "+super.getMarca()
		+" de "+numeroPuertas
		+" puertas acelera a una velocidad considerable"
		+" ya que usa "+tipoGasolina+"\n");
	}
	
	public void encenderMotor() {
		System.out.println("El vehículo "+super.getMarca()
		+" a encendido el motor\n");
	}
	
	public void apagarMotor() {
		System.out.println("El vehículo "+super.getMarca()
		+" a apagado el motor");
	}
	
}
