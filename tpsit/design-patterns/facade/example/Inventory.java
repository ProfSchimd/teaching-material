

public class Inventory {
    private Object[] slots;
    public Inventory() {
        slots = new Object[8];
    }
    public Object itemAt(int i) {
        return slots[i];
    }
}
