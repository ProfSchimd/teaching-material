public class CharacterBuilder {
    private String name;
    private int lifePoints;
    private String skill;
    private Weapon weapon;
    private Armor armor;

    public CharacterBuilder setName(String name) {
        this.name = name;
        return this;
    }

    public CharacterBuilder setLifePoints(int lifePoints) {
        this.lifePoints = lifePoints;
        return this;
    }

    public CharacterBuilder setSkill(String skill) {
        this.skill = skill;
        return this;
    }

    // ...

    public Character build() {
        return new Character(name, lifePoints, skill, weapon, armor);
    }
}
