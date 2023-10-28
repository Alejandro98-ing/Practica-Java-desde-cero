package ejercicio3;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.HashMap;
import java.util.Map;

public class Servidor {
    public static void main(String[] args) {

        try (ServerSocket serverSocket = new ServerSocket(8090)) {
            System.out.println("Esperando conexiones en el puerto...");
            Socket clientSocket = serverSocket.accept();
            System.out.println("Conexión establecida con " + clientSocket.getInetAddress());

            ObjectInputStream objectInputStream = new ObjectInputStream(clientSocket.getInputStream());

            HTTPRequest request = (HTTPRequest) objectInputStream.readObject();
            System.out.println("Recibido HTTPRequest:");

            System.out.println("Body: " + request.getBody());
            System.out.println("Headers:");
            for (Map.Entry<String, String> entry : request.getHeaders().entrySet()) {
                System.out.println(entry.getKey() + ": " + entry.getValue());
            }

            // Procesa la solicitud y realiza la suma
            String body = request.getBody();
            String[] numbers = body.split(",");
            int result = 0;

            for (String number : numbers) {
                try {
                    result += Integer.parseInt(number);
                } catch (NumberFormatException e) {
                    e.printStackTrace();
                }
            }

            // Genera una respuesta con el resultado de la suma
            Map<String, String> responseHeaders = new HashMap<>();
            responseHeaders.put("Content-Type", "text/plain");
            HTTPResponse response = new HTTPResponse(Integer.toString(result), responseHeaders, 200);

            ObjectOutputStream objectOutputStream = new ObjectOutputStream(clientSocket.getOutputStream());
            objectOutputStream.writeObject(response);

            objectInputStream.close();
            objectOutputStream.close();
            clientSocket.close();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}


