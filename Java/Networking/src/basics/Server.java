package basics;

import java.io.DataInputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {

    public static void main(String[] args) {

        try {
            ServerSocket serverSocket = new ServerSocket(8080);
            System.out.println("waiting for the client to connect on port 8080");
            Socket socket = serverSocket.accept();
            DataInputStream dataInputStream = new DataInputStream(socket.getInputStream());
            String data = dataInputStream.readUTF();
            System.out.println("message received: " + data);
            dataInputStream.close();
            serverSocket.close();      // or socket.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
