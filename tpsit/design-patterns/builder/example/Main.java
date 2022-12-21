public class Main {
    public static void main(String[] args) {
        Character wizard = new Character(
            "Wizard Gandalf",
            100,
            "Magic",
            new Weapon(),
            new Armor()
        );
        System.out.println(wizard);
        CharacterBuilder builder = new CharacterBuilder();
        builder
            .setName("Warrior Aragorn")
            .setLifePoints(100)
            .setSkill("Sword");
        Character warrior = builder.build();
        System.out.println(warrior);
    }
}