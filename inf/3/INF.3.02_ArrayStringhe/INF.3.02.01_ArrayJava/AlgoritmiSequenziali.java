import java.util.Random;

public class AlgoritmiSequenziali {
    public static void printArray(int[] a) {
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();
    }

    public static int linearSerch(int[] a, int k) {
        for (int i = 0; i < a.length; i++) {
            if (a[i] == k) {
                return i;
            }
        }
        return -1;
    }

    public static int count(int[] a, int k) {
        int count = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] == k) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Random rand = new Random();
        int[] a = new int[10];
        for (int i = 0; i < a.length; i++) {
            a[i] = rand.nextInt(10);
        }
        printArray(a);
        int positionOfZero = linearSerch(a, 0);
        int countZeros = count(a, 0);
        if (positionOfZero >=0) {
            System.out.println("Trovato lo zero in posizione "  + positionOfZero);
            System.out.println("Lo zero compare " + countZeros + " volte in tutto l'array.");
        } else {
            System.out.println("Zero non trovato");
        }
    }
}
