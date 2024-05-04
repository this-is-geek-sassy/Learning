package chat;

import javax.xml.crypto.Data;
import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class ChatServer {

    public static void main(String[] args) {

        try {
            ServerSocket serverSocket = new ServerSocket(9090);
            System.out.println("Server is ready to chat");
            Socket socket = serverSocket.accept();
            DataInputStream in = new DataInputStream(socket.getInputStream());
            DataOutputStream out = new DataOutputStream(socket.getOutputStream());

            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

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

            bufferedReader.close();
            out.close();
            in.close();
            socket.close();
            serverSocket.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
