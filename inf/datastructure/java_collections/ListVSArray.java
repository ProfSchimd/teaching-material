import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class ListVSArray {

    private static final int COUNT = 2 << 16;
    private static final int TESTS = 2 << 16;

    private static double result = 0.0;

    private static void testRandomAccess(List<Double> c, int nTests) {
        Random r = new Random();
        double sum = 0;
        int n = c.size();
        while(nTests-- > 0) {
            int index = r.nextInt(n);
            sum += c.get(index);
        }
        result = sum;
    }

    public static void main(String[] args) {
        int size = COUNT;
        int tests = TESTS;
        if (args.length >= 2) {
            size = Integer.parseInt(args[0]);
            tests = Integer.parseInt(args[1]);
        }
        Random r = new Random();
        ArrayList<Double> arrayList = new ArrayList<Double>(COUNT);
        for (int i = 0; i < size; i++) {
            arrayList.add(r.nextDouble());
        }
        LinkedList<Double> linkedList = new LinkedList<Double>(arrayList);

        long begin = System.currentTimeMillis();
        testRandomAccess(arrayList, tests);
        long end = System.currentTimeMillis();
        System.out.println("ArrayList: " + (end - begin));

        begin = System.currentTimeMillis();
        testRandomAccess(linkedList, tests);
        end = System.currentTimeMillis();
        System.out.println("ArrayList: " + (end - begin));
    }
}