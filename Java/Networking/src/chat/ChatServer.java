package chat;

import javax.xml.crypto.Data;
import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class ChatServer {

    public static void main(String[] args) {

        try(
                ServerSocket serverSocket = new ServerSocket(9090);
                Socket socket = serverSocket.accept();
                DataInputStream in = new DataInputStream(socket.getInputStream());
                DataOutputStream out = new DataOutputStream(socket.getOutputStream());

                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        ) {
            System.out.println("Server is ready to chat");

            String messageReceived = "", messageToSend = "";
            while (true) {
                messageReceived = in.readUTF();
                System.out.println("client says: " + messageReceived);

                if (messageReceived.equalsIgnoreCase("exit")) {
                    break;
                }

                messageToSend = bufferedReader.readLine();
                out.writeUTF(messageToSend);

                out.flush();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
