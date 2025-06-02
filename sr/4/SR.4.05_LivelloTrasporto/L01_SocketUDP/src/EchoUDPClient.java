import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class EchoUDPClient {
    public static void main(String[] args) {
        try {
            DatagramSocket socket = new DatagramSocket();
            InetAddress address = InetAddress.getByName("localhost"); // server address
            
            byte[] buffer = "Ciao, server!".getBytes();
            DatagramPacket request = new DatagramPacket(buffer, buffer.length, address, 12345);
            socket.send(request);

            byte[] responseBuffer = new byte[1024];
            DatagramPacket response = new DatagramPacket(responseBuffer, responseBuffer.length);
            socket.receive(response);

            String received = new String(response.getData(), 0, response.getLength());
            System.out.println("Risposta dal server: " + received);
        } catch (Exception e) {
            System.out.println("Errore: " + e.getMessage());
        }
    }
}