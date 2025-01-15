import java.util.Date;

public class Person {
    private String firstName;
    private String lastName;
    // Consider alternative representation: YYYYMMGG
    private String birthDate; // DD/MM/YYYY

    public static final String SPECIES = "Homo sapiens";


    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public int age(String today) {
        return 0;
    }

    public String getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(String birthDate) {
        if (birthDate == null) {
            return;
        }
        // If GG/MM/AAAA ...
        // If MM/GG/AAAA ...
        this.birthDate = birthDate;
    }

    public void setLastName(String newLastName) {
        if (newLastName == null) {
            return;
        }
        lastName = newLastName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getFirstName() {
        return firstName;
    }
}