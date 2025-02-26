public class MergeSort {
    public static void print(Comparable[] v) {
        for (Comparable item : v) {
            System.out.print(item + " ");
        }
        System.out.println();
    }
    public static Object[] merge(Comparable[] v1, Comparable[] v2, Comparable[] v) {
        int i1 = 0, i2 = 0, i = 0;
        while (i1 < v1.length && i2 < v2.length) {
            if (v1[i1].compareTo(v2[i2]) < 0) { // v1[i1] < v2[i2]
                v[i] = v1[i1];
                i1++;
            } else { // v2[i2] <= v1[i1]
                v[i] = v2[i2];
                i2++;
            }
            i++;
        }
        while(i1 < v1.length) { // something remained in v1
            v[i] = v1[i1];
            i1++;
            i++;
        }
        while(i2 < v2.length) { // something remained in v2
            v[i] = v2[i2];
            i2++;
            i++;
        }
        return v;
    }

    public static void mergeSort(Comparable[] v) {
        if (v.length == 1) { // Base Case
            return;
        }
        int n1 = v.length / 2;
        int n2 = v.length - n1;
        Comparable[] v1 = new Comparable[n1]; 
        for (int i = 0; i < v1.length; i++) {
            v1[i] = v[i];
        }
        Comparable[] v2 = new Comparable[n2]; 
        for (int i = 0; i < v2.length; i++) {
            v2[i] = v[i+n1];
        }
        mergeSort(v1);
        mergeSort(v2);
        merge(v1,v2,v);
    }

    public static void main(String[] args) {
        Comparable[] v = {
            Integer.valueOf(9),
            Integer.valueOf(3),
            Integer.valueOf(2),
            Integer.valueOf(0),
            Integer.valueOf(1),
            Integer.valueOf(6)
        };
        mergeSort(v);
        print(v);
    }
}
