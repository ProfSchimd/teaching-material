public class World {
    private Player[] players;
    private Map map;

    // Singleton!!
    private static World theWorld;
    public static World world() {
        if (theWorld == null) {
            theWorld = new World();
        }
        return theWorld; 
    }

    private World() {
        players = new Player[10];
        for (int i = 0; i < players.length; i++) {
            players[i] = new Player("Player " + i);
        }
        map = new Map();
    }

    public void fight(Player attack, Player defense) {
        // Perform a fight between two players
        Object weapon = attack.getSelectedItem();
        defense.hit(attack, weapon);
        defense.defendFrom(attack, weapon);
        Object counterWeapon = defense.counterAttack(attack);
        attack.hit(defense, counterWeapon);
    }

    public void discoverMap(int x, int y) {
        // Discover some new parts of the world
    }
}
