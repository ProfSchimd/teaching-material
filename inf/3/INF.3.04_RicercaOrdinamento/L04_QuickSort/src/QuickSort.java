import java.util.Random;

public class QuickSort {

    public static void printArray(int[] a) {
        for(int number : a) {
            System.out.print(number + " ");
        }
        System.out.println();
    }

    public static void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            int pi = partition(arr, low, high);
            
            quickSort(arr, low, pi - 1);
            quickSort(arr, pi + 1, high);
        }
    }
    
    public static int partition(int[] arr, int low, int high) {
        int pivot = arr[high];
        int i = (low - 1);
        
        for (int j = low; j < high; j++) {
            if (arr[j] < pivot) {
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        
        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;
        
        return i + 1;
    }

    public static void main(String[] args) {
        int[] arr = {10, 3, 1, 1, 1, 1};
        int n = arr.length;
        
        System.out.println("Original array:");
        printArray(arr);
        
        quickSort(arr, 0, n - 1);
        
        System.out.println("Sorted array:");
        printArray(arr);

        arr = new int[1 << 20];
        Random r = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = r.nextInt(10000);
        }
        quickSort(arr, n, arr.length-1);
        for (int i = 0; i < 30; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
