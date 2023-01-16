import java.net.Socket;

import javax.sound.midi.Soundbank;

public class Main {
    public static void main(String[] args) {
        AMGraph graph = new AMGraph();
        System.out.println(graph.matrixToString());        
    }
}