import java.time.LocalDate;

public class Dirigente extends Professore {
    public Dirigente(int id, String firstName, String secondName, LocalDate birthDate) {
        super(id, firstName, secondName, birthDate);
    }

    public String toString() {
        return "Dirigente: " + getFirstName() + " " + getSecondName();
    }
}
