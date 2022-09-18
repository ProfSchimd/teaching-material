import java.util.Date;

public class Main {

    private static void testCampiMetodi() {
        CampiMetodi cm = new CampiMetodi();
        System.out.println(cm.name);
        cm.setName("Alice Brown");
        System.out.println(cm.getName());

        CampiMetodi other = new CampiMetodi(123);
        other.setName("Marty McFly");
        System.out.println(other.getId() + " " + other.name);
    }

    private static void testGerarchiaPersona() {
        Persona ata = new Persona(100, "Paolo", "Verdi", null);
        Persona prof = new Professore(200, "Giorgia", "Fumagalli", null);
        Studente st = new Studente(1000, "Andrea", "Hu Chen Li", null);

        st.setClasse("1A");
        // prof.setClassi(); // Errore!

    }

    public static void main(String[] args) {
        testCampiMetodi();
    }
}
