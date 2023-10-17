
public class Perro extends Mascota {
	int edad;
	
    public Perro() {
	}

	public Perro(String nombre, int edad) {
        super(nombre);
        this.edad=edad;
    }

    public void mostrarDatosPerro() {
        System.out.println("Mi edad es: "+edad+" años y soy un Perro");
    }
}
