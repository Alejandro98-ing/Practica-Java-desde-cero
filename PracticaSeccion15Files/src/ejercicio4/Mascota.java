package ejercicio4;

import java.io.Serializable;

public class Mascota implements Serializable{
	String nombre;
	
	private static final long serialVersionUID = 6235493255268429912L;
    
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
