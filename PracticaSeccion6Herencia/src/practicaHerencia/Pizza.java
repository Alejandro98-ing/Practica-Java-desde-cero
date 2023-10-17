package practicaHerencia;

public class Pizza extends Comida {
	String tipo;

    Pizza(String nombre, double precio, String tipo) {
        super(nombre, precio);
        this.tipo = tipo;
    }

    @Override
    void describir() {
        super.describir();
        System.out.println("Tipo de pizza: " + tipo);
    }
}
