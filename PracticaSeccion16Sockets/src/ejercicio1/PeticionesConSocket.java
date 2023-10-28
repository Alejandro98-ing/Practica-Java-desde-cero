package ejercicio1;

import java.io.DataInputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class PeticionesConSocket {
	public static void main(String[] args) throws IOException {
		try (ServerSocket socket = new ServerSocket(8090)) {
			System.out.println("Escuchando peticiones ..");
			Socket client = socket.accept();
			System.out.printf("Cliente %s conectado \n", client.getInetAddress().getHostName());
			DataInputStream dis = new DataInputStream(client.getInputStream());
			String mensaje = null;
			do {
				mensaje = dis.readUTF();
				System.out.printf("%s dice: ",client.getInetAddress().getHostName());
				if (mensaje.equals("iniciar")) {
					System.out.printf("%s dice: %s\n",client.getInetAddress().getHostName(),"Iniciando...");
                } else if (mensaje.equals("reiniciar")) {
                	System.out.printf("%s dice: %s\n",client.getInetAddress().getHostName(),"Reiniciando...");
                } else if (mensaje.equals("apagar")) {
                	System.out.printf("%s dice: %s\n",client.getInetAddress().getHostName(),"Apagando...");
                }
			} while (!"salir".equals(mensaje));
			System.out.println("Conexion cerrada");
			client.close();
			dis.close();
		}
	}
}
