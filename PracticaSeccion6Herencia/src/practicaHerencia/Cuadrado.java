package practicaHerencia;

public class Cuadrado extends Figura {
	double lado;
	double area;

    Cuadrado(double lado) {
        this.lado = lado;
    }

    @Override
    void calcularArea() {
        area = lado * lado;
        System.out.println("El área del cuadrado es: "
        		+area);
    }
}
