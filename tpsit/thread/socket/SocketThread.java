import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class SocketThread extends Thread {
    private Socket socket;
    private BufferedReader in;
    private PrintWriter out;

    public SocketThread(Socket socket) throws IOException {
        this.socket = socket;
        InputStreamReader isr = new InputStreamReader(socket.getInputStream());
        in = new BufferedReader(isr);
        out = new PrintWriter(socket.getOutputStream(), true);
    }

    @Override
    public void run() {
        try {

            String line;
            while ((line = in.readLine()) != null) {
                System.out.println("[R]: " + line);
                out.println(line);
                if (line.equals("exit")) {
                    break;
                }
            }
            out.close();
            in.close();
            socket.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
