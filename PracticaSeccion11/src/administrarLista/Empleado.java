package administrarLista;

public class Empleado {

    private int Id;
    private String nombre;
    private double salario;

    public Empleado() {
	}

	public Empleado(int Id, String nombre, double salario) {
        this.Id = Id;
        this.nombre = nombre;
        this.salario = salario;
    }

    public Empleado(String nombre, double salario) {
		this.nombre = nombre;
		this.salario = salario;
	}

	public int getId() {
        return Id;
    }

    public void setId(int Id) {
        this.Id = Id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}

