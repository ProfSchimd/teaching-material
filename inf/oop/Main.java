public class Main {

    private static void TestCampiMetodi() {
        CampiMetodi cm = new CampiMetodi();
        System.out.println(cm.name);
        cm.setName("Alice Brown");
        System.out.println(cm.getName());

        CampiMetodi other = new CampiMetodi(123);
        other.setName("Marty McFly");
        System.out.println(other.getId() + " " + other.name);
    }

    public static void main(String[] args) {
        TestCampiMetodi();
    }
}
