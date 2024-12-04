public class Factorial {
    public static int factorial(int n) {
        int result = 1;
        for (int i = n; i >= 1; i--) {
            result *= i;
        }
        return result;
    }

    public static int recursiveFactorial(int n) {
        if (n == 0) {
            return 1;
        }
        return n*recursiveFactorial(n-1);
    }

    public static int recursiveFactorialVerbose(int n) {
        if (n == 0) {
            return 1;
        }
        int nn = n-1;
        int f_nn = recursiveFactorial(n-1);
        int f_n = n*f_nn;
        return f_n;
    }

    public static void main(String[] args) {
        int n = 10;
        System.out.println("Iterative");
        for (int i = 0; i < n; i++) {
            System.out.println("Fact(" + i + ") = " + factorial(i));
        }

        System.out.println("Recursive");
        for (int i = 0; i < n; i++) {
            System.out.println("RFact(" + i + ") = " + recursiveFactorial(i));
        }

        System.out.println("Recursive (Verbose)");
        for (int i = 0; i < n; i++) {
            System.out.println("RFactV(" + i + ") = " + recursiveFactorialVerbose(i));
        }
    }
}
