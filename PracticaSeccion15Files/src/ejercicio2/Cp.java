package ejercicio2;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Cp {

	static final Logger LOGGER = Logger.getAnonymousLogger();

	public static String readMessage(String prompt) throws IOException {
		System.out.println(prompt);
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		return br.readLine();
	}

	public static void CopiarArchivo(String origenArchivo, String destinoArchivo) {
		try {
			Path origenPath = Paths.get(origenArchivo);
			Path destinoPath = Paths.get(destinoArchivo);
			// sobreescribir el fichero de destino si existe y lo copia
			Files.copy(origenPath, destinoPath, StandardCopyOption.REPLACE_EXISTING);
		} catch (FileNotFoundException ex) {
			LOGGER.log(Level.SEVERE, ex.getMessage());
		} catch (IOException ex) {
			LOGGER.log(Level.SEVERE, ex.getMessage());
		}
	}

	public static void main(String[] args) throws FileNotFoundException, IOException {
		String rutaActual = readMessage("Ingrese la dirección del archivo a copiar: ");
		String rutaNueva = readMessage("Ingrese la dirección donde copiara el archivo : ");

		CopiarArchivo(rutaActual, rutaNueva);
		System.out.println("Archivo copiado exitosamente.");
	}

}
