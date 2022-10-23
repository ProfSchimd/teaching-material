import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class Main {
  public static void main(String[] args) throws Exception {
    Socket socket = new Socket("127.0.0.1", 1313);
    boolean autoflush = true;
    PrintWriter out = new PrintWriter(socket.getOutputStream(), autoflush);
    BufferedReader in = new BufferedReader(

    new InputStreamReader(socket.getInputStream()));
    // send an HTTP request to the web server
    out.println("GET / HTTP/1.1");
    out.println("Host: 127.0.0.1:80");
    out.println("Connection: Close");
    out.println();

    // read the response
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
    System.out.println(sb.toString());
    socket.close();
  }
}