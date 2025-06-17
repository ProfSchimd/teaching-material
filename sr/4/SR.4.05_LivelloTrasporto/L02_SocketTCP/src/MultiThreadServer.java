import java.io.*;
import java.net.*;

public class MultiThreadServer {
    public static void main(String[] args) {
        try (ServerSocket serverSocket = new ServerSocket(12345)) {
            System.out.println("Server di chat multi-thread in ascolto sulla porta 12345...");
            while (true) {
                Socket clientSocket = serverSocket.accept();
                System.out.println("Nuovo client connesso!");
                new ClientHandler(clientSocket).start();
            }
        } catch (IOException e) {
            System.out.println("Errore: " + e.getMessage());
        }
    }
}

class ClientHandler extends Thread {
    private Socket clientSocket;

    public ClientHandler(Socket socket) {
        this.clientSocket = socket;
    }

    public void run() {
        try (BufferedReader in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
             PrintWriter out = new PrintWriter(clientSocket.getOutputStream(), true)) {

            String inputLine;
            while ((inputLine = in.readLine()) != null) {
                System.out.println("Client: " + inputLine);
                out.println("Echo: " + inputLine);
            }
        } catch (IOException e) {
            System.out.println("Errore di connessione con il client: " + e.getMessage());
        }
    }
}