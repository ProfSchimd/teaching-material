import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class EchoUDPServer {
    public static void main(String[] args) {
        try {
            DatagramSocket socket = new DatagramSocket(12345);
            byte[] buffer = new byte[1024];
            System.out.println("UDP Echo server in ascolto sulla porta 12345...");

            while (true) {
                DatagramPacket request = new DatagramPacket(buffer, buffer.length);
                socket.receive(request);

                String received = new String(request.getData(), 0, request.getLength());
                System.out.println("Ricevuto: " + received);

                InetAddress clientAddress = request.getAddress();
                int clientPort = request.getPort();
                DatagramPacket response = new DatagramPacket(request.getData(), request.getLength(), clientAddress, clientPort);
                socket.send(response);
            }
        } catch (Exception e) {
            System.out.println("Errore: " + e.getMessage());
        }
    }
}