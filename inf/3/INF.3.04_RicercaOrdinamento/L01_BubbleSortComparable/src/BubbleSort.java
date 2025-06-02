public class BubbleSort {
    public static void bubbleSort(double[] a) {
        int n = a.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (a[j] > a[j + 1]) {
                    double temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                }
            }
        }
    }

    public static void bubbleSort(Comparable[] a) {
        int n = a.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (a[j].compareTo(a[j + 1]) > 0)  {
                    Comparable temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                }
            }
        }
    } 

    public static void improvedBubbleSort(double[] a) {
        int n = a.length;
        for (int i = 0; i < n - 1; i++) {
            boolean inversions = false;
            for (int j = 0; j < n - i - 1; j++) {
                if (a[j] > a[j + 1]) {
                    inversions = true;
                    double temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                }
            }
            if (!inversions) {
                break;
            }
        }
    }

    public static void main(String[] args) {
        double[] a = {5.4, 2.1, 9.7, 1.5, 4.3, 8.2};
        
        System.out.println("Original array:");
        Util.printDoubleArray(a);
        
        improvedBubbleSort(a);

        System.out.println("Sorted array:");
        Util.printDoubleArray(a);

        Player[] p = new Player[4];
        p[0] = new Player("Alice");
        p[0].addScore(10);
        p[1] = new Player("Bob");
        p[1].addScore(8);
        p[2] = new Player("Carol");
        p[2].addScore(12);
        p[3] = new Player("David");
        p[3].addScore(2);

        System.out.println("Unsorted Players");
        Util.printObjectArray(p);

        bubbleSort(p);

        System.out.println("Sorted Players");
        Util.printObjectArray(p);

    }
}
