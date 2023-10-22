package practicaclasesinternas;

abstract interface Jugable{
	abstract void jugar();
}

public class EjemploInterfacesAnonimas {

	public static void main(String[] args) {
		Jugable j = new Jugable() {
			@Override
			public void jugar() {
				System.out.println("Jugando");
			}
		};
		j.jugar();
	}

}
