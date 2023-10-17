public class ArregloMascota {
	
	public static void main(String[] args) {
		Mascota mascotas[] = new Mascota[3];
        mascotas[0] = new Perro("Canelo",3);
        mascotas[1] = new Gato("Max",2);
        mascotas[2] = new Perro("Backy",5);

        for (Mascota mascota : mascotas) {
            mascota.saludar();

            if (mascota instanceof Perro) {
                ((Perro) mascota).mostrarDatosPerro();
            } else if (mascota instanceof Gato) {
                ((Gato) mascota).mostrarDatosGato();
            }

            System.out.println();
        }
    }

}
