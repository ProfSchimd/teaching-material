

public class Player {

    private String name;
    private boolean shielded = true;

    public Player(String name) {
        this.name = name;
    }

    public Object getSelectedItem() {
        return new String("Book");
    }

    public void fight(Player other) {
        World.world().fight(this, other);
    }

    public void hit(Player attacker, Object weapon) {
        System.out.println(name + ": Ouch!");
    }

    public void defendFrom(Player attacker, Object weapon) {
        if (shielded) {
            System.out.println(name + ": Use shield");
        }
    }

    public Object counterAttack(Player attacker) {
        return new String("Knife");
    }

}
