package Practica11;

import java.util.LinkedList;

public class ListaDeMascota {
	public static void main(String[] args) {
		LinkedList<Mascota> listaMascotas = new LinkedList<>();
		Mascota mascotas1 = new Mascota();
        mascotas1 = new Perro("Canelo",3);
        listaMascotas.add(mascotas1);
        mascotas1 = new Gato("Max",2);
        listaMascotas.add(mascotas1);
        mascotas1 = new Perro("Backy",5);
        listaMascotas.add(mascotas1);
        
        for (Mascota mascota : listaMascotas) {
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
