package practicaHerencia;

public class Comida {
	String nombre;
    double precio;

    Comida(String nombre, double precio) {
        this.nombre = nombre;
        this.precio = precio;
    }

    void describir() {
        System.out.println("Comida: " + nombre);
        System.out.println("Precio: $" + precio);
    }
}
