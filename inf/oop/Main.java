import java.time.LocalDate;

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

    private static void testClassPersona() {
        Persona p1 = new Persona(1, "Antonio", "Esposito", LocalDate.of(2000, 01, 10));
    }

    private static void testGerarchiaPersona() {
        Persona ata = new Persona(100, "Paolo", "Verdi", null);
        Persona prof = new Professore(200, "Giorgia", "Fumagalli", null);
        Studente st = new Studente(1000, "Andrea", "Hu Chen Li", null);

        st.setClasse("1A");
        // prof.setClassi(); // Errore!
    }

    private static void testCastingGerarchia() {
        // cast implicito: Studente -> Persona
        Persona p = new Studente(10, "Antony", "Jervis", null);
        // cast esplicito: Persona -> Studente
        Studente s = (Studente)p;
        // cast esplicito: Persona -> Professore
        // Runtime error!
        Professore prof = (Professore)p;

        Persona[] anagrafica = new Persona[100];
        anagrafica[0] = new Professore(20, "John", "Waine", null);
        anagrafica[1] = new Studente(30, "Will", "Foreman", null);
        // Errore!
        Studente[] registro = (Studente[])anagrafica;
        Object[] anArray = anagrafica;
    }

    public static void testOverride() {
        Professore prof = new Professore(100, "Elvis", "Costello", null);
        Dirigente ds = new Dirigente(1, "Giovanna", "Moro", null);
        Persona p = ds;

        System.out.println(prof);
        System.out.println(ds);
        System.out.println(p);
    }

    public static void main(String[] args) {
        // testCampiMetodi();
        // testClassPersona();
        // testGerarchiaPersona();
        // testCastingGerarchia();
        testOverride();
    }
}
