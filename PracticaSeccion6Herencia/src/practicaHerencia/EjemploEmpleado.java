package practicaHerencia;

public class EjemploEmpleado {

	public static void main(String[] args) {
		AsesorFinanciero af= new AsesorFinanciero(450,
				"Juan",
				"19-08-1990",
				"123406-9",
				"01-01-2015");
		af.trabajar();
		af.cobrar();
		af.dedicarse("Asesor Financiero");
	}

}
