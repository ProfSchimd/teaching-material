public class JaggedArrays {
    public static void main(String[] args) {
        double[][] jagged = new double[4][];
        jagged[0] = new double[1];
        jagged[1] = new double[2];
        jagged[2] = new double[1];
        jagged[3] = new double[2];
        for (int i = 0; i < jagged.length; i++) {
            System.out.println("Length di jagged[" + i + "] = " + jagged[i].length);
        }
    }
}
