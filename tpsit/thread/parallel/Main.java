public class Main {
    public static void main(String[] args) throws Exception {
        int threadCount = Integer.parseInt(args[0]);
        System.out.println(threadCount);
        int n = 65536*8192;
        int[] a = new int[n];
        long beginMillis = System.currentTimeMillis();
        int portion = n / threadCount;
        ParallelAverage[] threads = new ParallelAverage[threadCount];
        int sum = 0;
        for (int i =0; i < threadCount; i++) {
            threads[i] = new ParallelAverage(a, i*portion, (i+1) * portion - 1);
            threads[i].run();
        }
        for (int i = 0; i<threadCount; i++ ){
            threads[i].join();
            sum += threads[i].getSum();
        }
        sum /= n;
        long endMillis = System.currentTimeMillis();
        long elapsedMillis = endMillis - beginMillis;
        System.out.println("Time: " + elapsedMillis + " [ms]");
        System.out.println(sum);
    }
}