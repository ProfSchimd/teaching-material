import java.time.LocalDate;

public class Persona {
    private int id;
    private String firstName;
    private String secondName;
    private LocalDate birthDate;

    public Persona(int id, String firstName, String secondName, LocalDate birthDate) {
        this.id = id;
        this.firstName = firstName;
        this.secondName = secondName;
        this.birthDate = birthDate;
    }

    public int getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getSecondName() {
        return secondName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }

    @Override
    public String toString() {
        return "[" + this.id + "]: " + this.firstName + " " + this.secondName;
    }
    
}
