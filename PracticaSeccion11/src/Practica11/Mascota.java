package Practica11;

public class Mascota {
	String nombre;
    
    public Mascota() {
	}

	public Mascota(String nombre) {
        this.nombre = nombre;
    }
    
    public String getNombre() {
        return nombre;
    }
    
    public void saludar() {
        System.out.println("Soy " + nombre);
    }
}
