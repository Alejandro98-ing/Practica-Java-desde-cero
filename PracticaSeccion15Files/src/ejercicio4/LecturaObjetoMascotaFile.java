package ejercicio4;

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class LecturaObjetoMascotaFile {
	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
		File file = new File("C:\\Users\\oscar\\Documents\\PracticaJava Udemy\\ejemplos\\mascotas1.txt");
		try (FileInputStream fis = new FileInputStream(file); ObjectInputStream ois = new ObjectInputStream(fis)) {
			while (true) {
				try {
					Mascota mascota = (Mascota) ois.readObject();
					if (mascota != null) {
						System.out.println(mascota.getNombre());
					} else {
						System.out.println("Null");
					}
				} catch (EOFException e) {
					break;
				}
			}
		}
	}
}
