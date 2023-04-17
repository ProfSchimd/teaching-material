public class Person {
    private String firstName;
    private String lastName;
    private String id;
    private int age;

    public Person(String id, String first, String last, int age) {
        this.id = id;
        this.firstName = first;
        this.lastName = last;
        this.age = age;
    }
    
    public String getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "[" + id + "]: " + firstName + " " + lastName + " " + age + " years";
    }
}
