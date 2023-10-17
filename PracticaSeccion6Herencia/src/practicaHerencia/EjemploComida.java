package practicaHerencia;

public class EjemploComida {

	public static void main(String[] args) {
		Pizza pizza = new Pizza("Pizza Pepperoni", 12.99, "Pepperoni");
        pizza.describir();

        System.out.println();

        Hamburguesa hamburguesa = new Hamburguesa("Hamburguesa con queso", 8.99, "Grande");
        hamburguesa.describir();
	}

}
