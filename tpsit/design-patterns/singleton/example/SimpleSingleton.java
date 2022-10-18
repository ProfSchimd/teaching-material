public class SimpleSingleton {
    private static SimpleSingleton instance = null;
    public static SimpleSingleton factoryMethod() {
        if (instance == null) {
            instance = new SimpleSingleton();
        }
        return instance;
    }
    private SimpleSingleton() { }
}