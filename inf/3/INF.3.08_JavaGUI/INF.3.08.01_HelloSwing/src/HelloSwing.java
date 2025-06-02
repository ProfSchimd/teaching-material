import java.awt.BorderLayout;
import javax.swing.*;

public class HelloSwing {
    public static void main(String[] args) {
        JFrame frame = new JFrame("First Java GUI with Swing");
        // Closes program when 'X' (or equivalent) is clicked (try remove it)
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setSize(400,400);

        // Add a label and a button
        JLabel label = new JLabel("Hello Swing!");
        JButton button = new JButton("Ok!");
        frame.add(label, BorderLayout.NORTH);
        frame.add(button, BorderLayout.CENTER);

        frame.setVisible(true);
    }    
}