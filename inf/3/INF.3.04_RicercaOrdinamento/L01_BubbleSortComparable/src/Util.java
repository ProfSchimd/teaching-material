public class Util {
    public static void printDoubleArray(double[] v) {
        // For each
        for (double num : v) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    public static void printObjectArray(Object[] v) {
        for (Object obj : v) {
            System.out.println(obj);
        }
    }
}
