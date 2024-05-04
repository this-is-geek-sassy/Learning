package chat;

import java.io.*;
import java.net.Socket;

public class ChatClient {

    public static void main(String[] args) {

        try(
                Socket socket = new Socket("localhost", 9090);
                DataInputStream in = new DataInputStream(socket.getInputStream());
                DataOutputStream out = new DataOutputStream(socket.getOutputStream());

                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        ) {


            String messageReceived = "", messageToSend = "";
            while (true) {
                messageToSend = bufferedReader.readLine();
                out.writeUTF(messageToSend);
                out.flush();

                if (messageToSend.equalsIgnoreCase("exit"))
                    break;

                messageReceived = in.readUTF();
                System.out.println("server says: " + messageReceived);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
