# Informatica Quinto Anno
## Materiale di supporto

### Database Scuola `./INF.5.99.01_DBScuola/`
A supporto del materiale di studio è possibile usare il *Database Scuola* il quale rappresenta la realtà di una scuola in termini delle entità *Studente*, *Insegnante*, *Classe*, *Materia*, ...

Sono disponibili versioni via via più complesse ed esaustive del database, partendo dalla singola tabella fino al database completo contenente circa 10 tabelle.

Ogni cartella (versione del DB) contiene un file SQL per la creazione (`db_school_nnn_create.sql`) e un file SQL per il riempimento (`db_school_nnn_insert.sql`). È inoltre disponibile un file per la cancellazione (*drop*) di tutte le tabelle (`db_school_nnn_drop.sql`). Vengono inoltre inserite alcune query do prova (`db_school_nnn_query.sql`). Per comodità, ogni cartella contiene anche un file `.db` con il database creato utilizzando i file forniti in *DB Browser for SQLite*.

Ogni versione del database è adeguatamente popolata affinché si possa utilizzare il DB a scopo didattico. Esistono quindi un numero adeguato di righe per ogni tabella in modo da poter utilizzare varie feature del linguaggio SQL illustrando i concetti dei database relazionali.

**Attenzione** Alcune avvertenze riguardo i DB in esame
* I nomi di tabelle e attributi sono in lingua inglese.
* Buona parte dei record sono generati utilizzando LLM (es. ChatGPT), possono quindi contenere informazioni non coerenti tra loro e/o per nulla realistiche. I file sono comunque stati revisionati per meglio adattarli alle esigenze didattiche.

#### Lista completa delle *versioni* del DB Scuola

* `DBScuola_001`: Singola tabella `student` con attributi **4 attributi** *id*, *first_name*, *last_name* e *birth_date* e **12 righe**. 
* `DBScuola_002`: Tabelle `student` (**5 attributi 12 righe**) e `class` (**4 attributi 6 righe**) collegate dall'attributo `class` nella tabella `student` (relazione 1 a molti).
* `DBScuola_003`: Tabelle `student` (**5 attributi 12 righe**), `class` (**4 attributi 6 righe**), `teacher` (**7 attributi 5 righe**), `teacher_class` (collegamento tra `teacher` e `class` con attributo `subject`).
* `DBScuola_004`: Tabelle `student`, `class`, `teacher`, (come sopra); tabella `subject` con **3 attributi** e **6 righe** la `teacher_class` di collegamento tra le tre tabelle `teacher`, `class` e `subject` tabella `mark` con **7 attributi** (*mark_id*, *student_id*, *subject_id*, *teacher_id*, *mark*, *date* e *comment*) e **15 righe**; la tabella `mark` si presta (con la colonna `mark` che esprime il voto in decimi) a supportare query aggregate (media, conteggio, massimo, minimo, ...).