package ejercicio3;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.util.HashMap;
import java.util.Map;

public class Cliente {
    public static void main(String[] args) {

        try (Socket socket = new Socket("localhost", 8090)) {
            String numbersToSum = "15,6"; // Cambia estos números por los que desees sumar
            HTTPRequest request = new HTTPRequest(numbersToSum, new HashMap<>());

            ObjectOutputStream objectOutputStream = new ObjectOutputStream(socket.getOutputStream());
            objectOutputStream.writeObject(request);

            ObjectInputStream objectInputStream = new ObjectInputStream(socket.getInputStream());

            HTTPResponse response = (HTTPResponse) objectInputStream.readObject();
            System.out.println("Recibido HTTPResponse:");

            System.out.println("Body (resultado de la suma): " + response.getBody());
            System.out.println("Headers:");
            for (Map.Entry<String, String> entry : response.getHeaders().entrySet()) {
                System.out.println(entry.getKey() + ": " + entry.getValue());
            }

            System.out.println("HTTP Status: " + response.getHttpStatus());
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}


