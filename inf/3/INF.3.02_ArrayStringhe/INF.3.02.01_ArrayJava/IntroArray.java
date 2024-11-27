public class IntroArray {
    public static void printArray(int[] a) {
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int[] a = new int[10];
        System.out.println(a.length); // Stampa a video 10

        printArray(a); // 0 0 ... 0
        a[1] = 100;
        a[2] = 200;
        System.out.println("a[0] -> " + a[0]); // a[0] -> 0
        System.out.println("a[1] -> " + a[1]); // a[1] -> 100
        System.out.println("a[2] -> " + a[2]); // a[2] -> 200
        
        for (int i = 0; i < a.length; i++) {
            a[i] = i+1;
        }
        printArray(a); // 1 2 3 ... 10
        
    }
}
