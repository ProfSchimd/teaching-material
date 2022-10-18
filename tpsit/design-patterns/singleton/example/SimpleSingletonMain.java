public class SimpleSingletonMain {
    public static void main(String[] args) {
        // SimpleSingleton ss = new SimpleSingleton(); // Errore
        SimpleSingleton simple1 = SimpleSingleton.factoryMethod();
        SimpleSingleton simple2 = SimpleSingleton.factoryMethod();
        System.out.println(simple1 == simple2); // True if singleton
    }
}
