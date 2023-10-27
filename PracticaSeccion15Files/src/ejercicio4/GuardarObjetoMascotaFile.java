package ejercicio4;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class GuardarObjetoMascotaFile {

	public static void main(String[] args) throws FileNotFoundException,IOException {
		Mascota mascotas[] = new Mascota[3];
        mascotas[0] = new Mascota("Canelo");
        mascotas[1] = new Mascota("Max");
        mascotas[2] = new Mascota("Backy");
        
        File file = new File("C:\\Users\\oscar\\Documents\\PracticaJava Udemy\\ejemplos\\mascotas1.txt");
		if(!file.exists()) {
			file.createNewFile();
		}
		try(FileOutputStream fos = new FileOutputStream(file);ObjectOutputStream oos=new ObjectOutputStream(fos)){
			for(Mascota mascota : mascotas) {
				oos.writeObject(mascota);
			}
		}
	}

}
