//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Person js = new Person("John", "smith");
        System.out.println(js.getLastName());
        Person ab = new Person("Alice", "Brown");
        System.out.println(js.getLastName() + " and " + ab.getLastName() + " are engaged.");

        System.out.println("Wedding...");

        ab.setLastName(js.getLastName());
        ab.setBirthDate("25/12/00");
        System.out.println("Alice was born in " + ab.getBirthDate());
        //ab.species = "Home cibernetics";
        System.out.println(js.getLastName() + " and " + ab.getLastName() + " are married.");
        System.out.println(ab.getFirstName() + " is a " + Person.SPECIES + " and " + js.getFirstName() + " is a " + Person.SPECIES);

    }
}