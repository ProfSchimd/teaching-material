import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

public class HTTPClient {
    public static final int SERVER_LISTEN_PORT = 1313;

    public static String readCommand(Scanner in, PrintWriter out) {
        String str = "";
        while (true) {
            String line = in.nextLine();

            if (line.equals("!EXIT")) {
                return null;
            }
            str += line;
            out.println(line);
            System.out.println("-> " + str);
            if(line.equals("")) {
                break;
            }
            // out.println("GET / HTTP/1.1");
            // out.println("Host: localhost:1313");
            // out.println("Connection: Close");
            // out.println();
        }
        return str;
    }

    public static String readResponse(BufferedReader in) throws IOException {
        boolean loop = true;
        StringBuilder sb = new StringBuilder(8096);
        while (loop) {
            if (in.ready()) {
                int i = 0;
                while (i != -1) {
                    i = in.read();
                    sb.append((char) i);
                }
                loop = false;
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {

        String hostName = "127.0.0.1";
        try {
            Socket client = new Socket(hostName, SERVER_LISTEN_PORT);
            InputStreamReader isr = new InputStreamReader(client.getInputStream());
            BufferedReader in = new BufferedReader(isr);
            PrintWriter out = new PrintWriter(client.getOutputStream(), true);
            Scanner scanner = new Scanner(System.in);

            String request = "";
            String lastLine = null;
            while (true) {
                // Read command
                request = readCommand(scanner, out);

                if (request == null) {
                    break;
                }

                // Read response
                System.out.println(readResponse(in));

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