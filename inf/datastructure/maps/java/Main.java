public class Main {

    public static void mapWithArray() {
        Person[] people = new Person[10];
        people[0] = new Person("001", "Alice", "Smith", 30);
        people[1] = new Person("002", "Bob", "Green", 48);
        people[2] = new Person("003", "Carol", "McDough", 19);
        
        for (int i = 0; i < people.length; i++) {
            System.out.println(people[i]);
        }
        System.out.println();
        String idToSearch = "002";
        for (int i = 0; i < people.length; i++) {
            if (people[i].getId().compareTo(idToSearch) == 0) {
                System.out.println(people[i]);
                break;
            }
        }
    }

    public static void main(String[] args) {
        int n = 100;
        String[] names = new String[n];
        names[0] = "Alice";
        names[1] = "Bob";
        // ...
        names[42] = "Alice";
        // ...
        for (int i = 0; i < names.length; i++) {
            // first condition prevents NullPointerException
            if (names[i] != null && names[i].compareTo("Alice") == 0) {
                System.out.println(i);
            } 
        }
        System.out.println();
        mapWithArray();
    }
}
