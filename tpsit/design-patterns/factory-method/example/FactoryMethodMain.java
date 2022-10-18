public class FactoryMethodMain {
    public static void main(String[] args) {
        String[] types = {"student", "professor", "ATA", "student"};
        Person[] persons = new Person[types.length];
        for (int i = 0; i < persons.length; i++) {
            persons[i] = Person.createPersonFromString(types[i]);
        }
    }
}
