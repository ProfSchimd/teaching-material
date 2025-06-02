public class BSearch {
    public static int binarySearch(int[] a, int key, int low, int high) {
        if (low > high) {
            return -1;
        }
        int mid = (high + low) / 2;
        if (a[mid] == key) {
            return mid;
        }
        if (a[mid] > key) {
            return binarySearch(a, key, low, mid-1);
        } else {
            return binarySearch(a, key, mid+1, high);
        }
    }

    public static void main(String[] args) {
        int[] a = {-2,-1,0,0,1,3,5,5,6,7,8,10,11,15};
        int n = a.length;

        System.out.println("Find(0):   " + binarySearch(a, 0 , 0, n-1));
        System.out.println("Find(4):   " + binarySearch(a, 4 , 0, n-1));
        System.out.println("Find(-10): " + binarySearch(a, -10 , 0, n-1));
        System.out.println("Find(15):  " + binarySearch(a, 15 , 0, n-1));
    }
}
