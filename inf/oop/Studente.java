import java.util.Date;

public class Studente extends Persona {

    private String classe;

    public Studente(int id, String firstName, String secondName, Date birthDate) {
        super(id, firstName, secondName, birthDate);
    }

    public String getClasse() {
        return classe;
    }

    public void setClasse(String classe) {
        this.classe = classe;
    }
}
