import java.util.ArrayList;
import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<String>();
        names.add("Alice");
        names.add("Bob");
        names.add("Carol");
        names.add("David");

        Iterator<String> it = names.iterator();
        while(it.hasNext()) {
            System.out.println(it.next());
        }
        System.out.println();
        for(String s : names) {
            System.out.println(s);
        }
    }
}