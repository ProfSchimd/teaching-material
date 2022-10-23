import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

public class EchoClient {
    public static final int SERVER_LISTEN_PORT = 23432;
    public static void main(String[] args) {
        String hostName = "127.0.0.1"; // stesso host del client
        try {
            Socket client = new Socket(hostName, SERVER_LISTEN_PORT);
            InputStreamReader isr = new InputStreamReader(client.getInputStream());
            BufferedReader in = new BufferedReader(isr);
            PrintWriter out = new PrintWriter(client.getOutputStream(), true);
            Scanner scanner = new Scanner(System.in);
            while(true) {
                String line = scanner.nextLine();
                System.out.println("Spedisco: " + line);
                out.println(line);
                line = in.readLine();
                System.out.println("Ricevuto: " + line);
                if (line.equals("exit")) {
                    break;
                }
            }
            scanner.close();
            out.close();
            in.close();
            isr.close();
            client.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}