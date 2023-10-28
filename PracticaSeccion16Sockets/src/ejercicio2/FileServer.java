package ejercicio2;

import java.io.BufferedInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class FileServer {
    public static void main(String[] args) {

        try (ServerSocket serverSocket = new ServerSocket(8090)) {
            System.out.println("Esperando conexiones en el puerto ...");
            Socket clientSocket = serverSocket.accept();
            System.out.println("Conexión establecida con " + clientSocket.getInetAddress());

            InputStream inputStream = clientSocket.getInputStream();
            BufferedInputStream bufferedInputStream = new BufferedInputStream(inputStream);

            byte[] buffer = new byte[1024];
            int bytesRead;

            Scanner scanner = new Scanner(System.in);
            System.out.print("Ingrese la ruta donde desea guardar el archivo recibido: ");
            String savePath = scanner.nextLine();
            System.out.print("Ingrese el nombre del archivo recibido: ");
            String fileName = scanner.nextLine();

            FileOutputStream fileOutputStream = new FileOutputStream(savePath + fileName);

            while ((bytesRead = bufferedInputStream.read(buffer)) != -1) {
                fileOutputStream.write(buffer, 0, bytesRead);
            }

            fileOutputStream.close();
            clientSocket.close();
            System.out.println("Archivo recibido y guardado como: " + fileName);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

