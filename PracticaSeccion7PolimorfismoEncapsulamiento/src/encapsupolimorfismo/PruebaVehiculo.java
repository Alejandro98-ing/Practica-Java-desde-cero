package encapsupolimorfismo;

public class PruebaVehiculo {

	void imprimirInfoVehiculo(Vehiculo vehiculo) {
		System.out.println("Datos\n"
	+"Marca: "+vehiculo.getMarca()
	+"\nModelo: "+vehiculo.getModelo()
	+"\nFecha de Fabricación: "+vehiculo.getFechaFabricacion()
	+"\nTiene un kilometraje de: "+vehiculo.getKilometraje()+"\n");
		vehiculo.Acelerar();
		vehiculo.Frenar();
	}
	
	public static void main(String[] args) {
		PruebaVehiculo p = new PruebaVehiculo();
		p.imprimirInfoVehiculo(new Automovil("Mazda 350z","M530z","03-04-2015",10000,4, "Diesel"));
		p.imprimirInfoVehiculo(new Camion("Volbo","VB20","13-10-2020",15000,25, "Cemento"));
	}

}
