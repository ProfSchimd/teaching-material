public class RecursiveMax {
    public static double recursiveMax(double[] v, int start) {
        if (start == v.length - 1) {
            return v[start];
        }
        double b = recursiveMax(v, start+1);
        return Math.max(v[start], b);
    }

    public static void main(String[] args) {
        double[] v = {-1.0, 0.2, 3.2, 0.11, -1.123};

        System.out.println(recursiveMax(v, 0));
    }
}
