/**
 * CampiMetodi
 */
public class CampiMetodi {
    // Campo (field) privato di tipo int (non inizializzato)
    private int id;
    
    // Campo pubblico di tipo String inizializzato con il valore "John Smith"
    public String name = "John Smith";

    // Costruttore (stesso nome classe e no tipo ritorno) senza parametri
    public CampiMetodi() {
        // assegna il valore 1 al campo id (this non serve in questo caso)
        this.id = 1;
    }

    public CampiMetodi(int id) {
        if (!checkId()) {
            // TODO Error!
        } else {
        // assegna il del parametri id al campo id (this fondamentale in questo caso)
            this.id = id;
        }
    }

    // Metodo privato restituisce un boolean e non ha parametri
    private boolean checkId() {
        return (this.id > 0);
    }

    // Metodo privato restituisce un boolean e non ha parametri
    public int getId() {
        // (volendo this.id)
        return id;
    }

    // Metodo pubblico, non restituisce nulla e ha un parametro di tipo String
    public void setName(String name) {
        this.name = name;
    }

    // Metodo pubblico, restituisce un String, non ha parametri
    public String getName() {
        return name;
    }
}