public class SimpleInterfere {
    public static int shared = 0;
    public static void main(String[] args) throws Exception {
        AdderThread t1 = new AdderThread();
        MultiplierThread t2 = new MultiplierThread();
        t1.start();
        t2.start();
        t1.join();
        t2.join();
        System.out.println(shared);
    }
}