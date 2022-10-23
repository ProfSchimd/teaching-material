public class ParallelAverage extends Thread {
    private int[] array;
    private int start;
    private int end;
    private int sum;

    public ParallelAverage(int[] a, int s, int e) {
        array = a;
        start = s;
        end = e;
        sum = 0;
    }

    @Override
    public void run() {
        sum = 0;
        for (int i = start; i < end; i++) {
            sum += array[i];
        }
    }

    public int getSum() {
        return sum;
    }
}