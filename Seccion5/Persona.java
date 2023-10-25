class Persona{
	String nombre;
	int edad;
	char genero;

	Persona(){
		System.out.println("Esto es un constructor");
	}

	Persona(String n, int ed, char g){
		nombre=n;
		edad=ed;
		genero=g;
	}

	void jugarVideojuegos(Persona p){
		System.out.println(nombre
			+" Esta jugando con "+p.nombre);
	}

	void imprimirInformacion () {
		System.out.println("Nombre: "+nombre);
		System.out.println("Edad: "+edad);
		System.out.println("Genero: "+genero);
	}

	public static void main(String[] args) {
		Persona p=new Persona("Alex",32,'M');
		p.imprimirInformacion();

		Persona p1=new Persona();
		p1.nombre = "Juan";
		p1.edad=51;
		p1.genero='M';
		p1.imprimirInformacion();

		Persona p2=new Persona();
		p2.nombre = "Ana";
		p2.edad=35;
		p2.genero='F';
		p2.imprimirInformacion();

		p.jugarVideojuegos(p1);
	}
}