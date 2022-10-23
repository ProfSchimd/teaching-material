public class AdderThread extends Thread {
    public void run() {
        try {
            sleep(500);
        } catch(InterruptedException e) {
        }
        SimpleInterfere.shared += 1;
    }
}