import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class TextToBin {
    // Reads a plain text file of digits and transforms into a sequence of byes
    // Example: '1' '2' '3' -> 1 2 3
    public static void main(String[] args) throws IOException {
        if (args.length < 2) {
            System.err.println("Errore: indicare input e output");
            System.exit(1);
        }
        InputStream is = new FileInputStream(args[0]);
        OutputStream os = new FileOutputStream(args[1]);
        int zero = (int)'0';
        int nine = (int)'9';
        int c;
        while ((c = is.read()) != -1) {
            if (c >= zero && c <= nine) {
                os.write(c-zero);
            }
        }
        os.close();
        is.close();

        
    }
}
