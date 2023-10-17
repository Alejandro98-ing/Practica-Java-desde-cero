package practicaHerencia;

public class Circulo extends Figura {
	double radio;
	double area;
	
    Circulo(double radio) {
        this.radio = radio;
    }

    @Override
    void calcularArea() {
        area = Math.PI * Math.pow(radio, 2);
        System.out.println("El área del circulo es: "
        		+String.format("%.2f", area));
    }
}
