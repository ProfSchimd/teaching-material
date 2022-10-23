import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * Questo programma accetta connessioni sulla porta indicata in SERVER_LISTEN_PORT
 * e risponde con l'eco di quello che riceve fine alla chiusura della connessione
 * utilizzando il comando 'exit'.
 * 
 * Essendo single thread, questo programma non riesce a comunicare con più di un
 * client per volta. Per fare questo è necessario utilizzare un server
 * multithreading.
 * 
 * @author Michele Schimd 
 */
public class SingleThreadSocket {

    public static final int SERVER_LISTEN_PORT = 23432;
    public static void main(String[] args) {
        try {
            ServerSocket server = new ServerSocket(SERVER_LISTEN_PORT);
            Socket socket = server.accept();
            InputStreamReader isr = new InputStreamReader(socket.getInputStream());
            BufferedReader in = new BufferedReader(isr);
            PrintWriter out = new PrintWriter(socket.getOutputStream(), true);
            String line;
            while((line = in.readLine()) != null) {
                System.out.println("Ricevuto: " + line);
                out.println(line);
                if (line.equals("exit")) {
                    break;
                }
            }
            out.close();
            in.close();
            isr.close();
            socket.close();
            server.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
