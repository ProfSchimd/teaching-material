import java.util.Date;

public class Person {
    private String firstName;
    private String lastName;
    private Date birthDate;

    public Person(String first, String last, Date birth) {
        this.firstName = first;
        this.lastName = last;
        this.birthDate = birth;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public Date getBirthDate() {
        return birthDate;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    public int age() {
        return 0;
    }
}
