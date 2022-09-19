package bank;

public class Static {
    private static int counter = 0;

    public static void incrementCount() {
        counter++;
    }

    public static int count() {
        return counter;
    }

    public Static() {
        Static.counter++;
    }

    public static void main(String[] args) {
        Static instance = new Static();
        System.out.println("Count: " + Static.count());
        System.out.println("Count: " + instance.count());
    }
}
