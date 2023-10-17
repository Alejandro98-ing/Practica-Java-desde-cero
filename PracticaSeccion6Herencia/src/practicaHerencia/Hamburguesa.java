package practicaHerencia;

public class Hamburguesa extends Comida {
	String tamaño;

    Hamburguesa(String nombre, double precio, String tamaño) {
        super(nombre, precio);
        this.tamaño = tamaño;
    }

    @Override
    void describir() {
        super.describir();
        System.out.println("Tamaño de la hamburguesa: " + tamaño);
    }
}
