import java.time.LocalDate;

public class Professore extends Persona {

    String[] classi;
    String[] materie;

    public Professore(int id, String firstName, String secondName, LocalDate birthDate) {
        super(id, firstName, secondName, birthDate);
    }

    public void setClassiMaterie(String[] classi, String[] materie) {
        this.classi = classi;
        this.materie = materie;
    }

    public String[] getClassi() {
        return classi;
    }

    public String[] getMaterie() {
        return materie;
    }

    @Override
    public String toString() {
        return super.toString() + " (Professore)";
    }
}
