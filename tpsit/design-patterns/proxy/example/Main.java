public class Main {
    public static void main(String[] args) {
        ProxyResource r = new ProxyResource("https://");
        System.out.println(r.get());
    }
}