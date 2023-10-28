package ejercicio2;

import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;
import java.util.Scanner;

public class FileClient {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese la ruta completa del archivo que desea enviar: ");
        String filePath = scanner.nextLine();

        try (Socket socket = new Socket("localhost", 8090)) {
            OutputStream outputStream = socket.getOutputStream();
            BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(outputStream);

            FileInputStream fileInputStream = new FileInputStream(filePath);
            byte[] buffer = new byte[1024];
            int bytesRead;

            while ((bytesRead = fileInputStream.read(buffer)) != -1) {
                bufferedOutputStream.write(buffer, 0, bytesRead);
            }

            bufferedOutputStream.flush();
            socket.close();
            fileInputStream.close();
            System.out.println("Archivo enviado con éxito.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}


