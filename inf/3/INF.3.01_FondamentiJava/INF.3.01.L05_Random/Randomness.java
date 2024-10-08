import java.util.Random;

public class Randomness {
    public static void main(String[] args) {
        // 'rand' è una *istanza* della *classe* `Random`
        Random rand = new Random();

        // a 'rand' possiamo chiedere di fare delle 'operazioni'
        int randomInt = rand.nextInt(); // tra MIN_INT e MAX_INT
        int randomNatural = rand.nextInt(1000); // tra 0 e 999
        double randomDouble = rand.nextDouble(); // tra 0.0 (incluse) e 1.0 (escluso)

        System.out.println("nextInt()     " + randomInt);
        System.out.println("nextInt(a)    " + randomNatural);
        System.out.println("nextDouble()  " + randomDouble);

        // Il meccanismo del 'seeding' (piantare un seme) permette di generare
        // sempre gli stessi numeri casuali (casuali???)

        for (int i = 0; i < 10; i++) {
            rand.setSeed(42);
            System.out.println(rand.nextInt());
            System.out.println(rand.nextInt(1000));
            System.out.println(rand.nextDouble());
            System.out.println();
        }


    }
}
