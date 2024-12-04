public class Power {
    public static double pow(double x, int n) {
        if (n == 0) {
            return 1;
        }
        return x * pow(x, n-1);
    }
    public static void main(String[] args) {
        System.out.println("Potenze di 10");
        for (int i = 0; i < 4; i++) {
            System.out.println("10^" + i + "=" + pow(10,i));
        }
        System.out.println("Potenze di 0.2=1/5");
        for (int i = 0; i < 10; i++) {
            System.out.println("0.2^" + i + "=" + pow(0.2,i));
        }
    }
}
