import java.io.*;
import java.net.*;

public class TcpChatServer {
    public static void main(String[] args) {
        try (ServerSocket serverSocket = new ServerSocket(12345)) {
            System.out.println("Listening on port 12345...");
            Socket clientSocket = serverSocket.accept();
            System.out.println("New Client!");

            BufferedReader in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
            PrintWriter out = new PrintWriter(clientSocket.getOutputStream(), true);

            BufferedReader stdIn = new BufferedReader(new InputStreamReader(System.in));
            String inputLine, outputLine;

            while ((inputLine = in.readLine()) != null) {
                System.out.println("Client: " + inputLine);
                outputLine = stdIn.readLine();
                out.println(outputLine);
            }
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}