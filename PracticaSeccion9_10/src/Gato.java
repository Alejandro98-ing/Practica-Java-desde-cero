
public class Gato extends Mascota {
	int edad;
	
    public Gato() {
	}

	public Gato(String nombre, int edad) {
        super(nombre);
        this.edad=edad;
    }

    public void mostrarDatosGato() {
        System.out.println("Mi edad es: "+edad+" años y soy un Gato");
    }
}
