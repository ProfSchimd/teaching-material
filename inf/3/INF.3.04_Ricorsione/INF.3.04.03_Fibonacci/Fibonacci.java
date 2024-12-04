public class Fibonacci {
    public static int Fibonacci(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        return Fibonacci(n-1) + Fibonacci(n-2);
    }

    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            System.out.println("Fib(" + i + ") = " + Fibonacci(i));
        }
    }
}
