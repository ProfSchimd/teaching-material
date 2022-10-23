import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @author Michele Schimd
 */
public class MultiThreadSocket {
    public static final int SERVER_LISTEN_PORT = 23432;
    public static void main(String[] args) {
        try {
            ServerSocket server = new ServerSocket(SERVER_LISTEN_PORT);
            while(true) {
                Socket socket = server.accept();
                Thread t = new SocketThread(socket);
                t.start();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}