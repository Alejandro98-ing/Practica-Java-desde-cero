package ejercicio1;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;

public class Dir {
	private static void print(File[] files) {
		if (files != null) {
			for (File file : files) {
				if (file.isFile()) {
					System.out.printf("%s (%s)\n", file.getName(),file.isDirectory()?"Carpeta":"Archivo");
				} else {
					System.out.printf("%s (%s)\n", file.getName(),file.isDirectory()?"Carpeta":"Archivo");
					print(file.listFiles());
				}
			}
		}
	}

	public static String readMessage(String prompt) throws IOException {
		System.out.println(prompt);
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		return br.readLine();
	}

	public static void main(String[] args) throws FileNotFoundException, IOException {
		String nombre = readMessage("Ingrese la dirección para acceder: ");
		File f = new File(nombre);
		if (f.exists()) {
			System.out.println("\nName Files:");
			System.out.println("______________________________\n");
			System.out.println(String.format("%s (%s)", f.getName(), (f.isDirectory() ? "Carpeta" : "Archivo")));
			print(f.listFiles());
		} else {
			System.out.println("El archivo no existe");
		}
	}

}
