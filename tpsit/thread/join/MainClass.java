public class MainClass {
    public static void main(String[] args) throws Exception {
        Thread thread1 = new ThreadClass();
        Thread thread2 = new ThreadClass();
        thread1.start();
        thread2.start();
        thread1.join();
        thread1.join();
    }
}