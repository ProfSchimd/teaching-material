public class Character {
    private String name;
    private int lifePoints;
    private String skill;
    private Weapon weapon;
    private Armor armor;

    public Character(String name, int lifePoints, String skill, Weapon weapon, Armor armor) {
        this.name = name;
        this.lifePoints = lifePoints;
        this.skill = skill;
        this.weapon = weapon;
        this.armor = armor;
    }

    @Override
    public String toString() {
        return name  + " (" + lifePoints + "/100) " + skill;
    }
}