import java.io.*;
import java.net.*;

public class TcpChatClient {
    public static void main(String[] args) {
        try (Socket socket = new Socket("localhost", 12345)) {
            System.out.println("Connesso al server di chat!");

            BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            PrintWriter out = new PrintWriter(socket.getOutputStream(), true);

            BufferedReader stdIn = new BufferedReader(new InputStreamReader(System.in));
            String userInput, serverResponse;

            while ((userInput = stdIn.readLine()) != null) {
                out.println(userInput);
                serverResponse = in.readLine();
                System.out.println("Server: " + serverResponse);
            }
        } catch (IOException e) {
            System.out.println("Errore: " + e.getMessage());
        }
    }
}