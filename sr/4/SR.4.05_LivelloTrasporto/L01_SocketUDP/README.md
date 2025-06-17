# Echo server UDP in Java (`SR.4.05.L01`)

Nella cartella [src](./src) sono presenti i file Java per la creazione di un semplice *echo server* UDP e di un client.

## Esercitazione 1 (1 ora)

### Parte 1: Echo server/client
Creare un echo server in Java utilizzando i socket UDP. Il server si mette in ascolto sulla porta 12345, ogni messaggio ricevuto viene stampato sulla console e re-inviato (fatto l'eco) al client.
Creare il client che manda richieste al server utilizzando l'indirizzo locale (192.168.8.n dove n è il numero della vostra postazione)

### Parte 2: Client con lettura da tastiera
Modificare il programma precedente in modo che il messaggio spedito al server venga inserito dalla tastiera. Modificare anche il server in modo che, oltre al messaggio ricevuto, stampi anche IP e porta del client.

### Parte 3: Bacheca personale
Modificare il client in modo che oltre al messaggio anche l'indirizzo IP di destinazione venga letto da tastiera così che si possa mandare un messaggio a chiunque abbia il server attivo.

## Esercitazione 2: Chat subscription
Ogni server mantiene una lista di iscritti, ogni volta che un nuovo messaggio viene mandato al server, questo lo inoltra a tutti gli iscritti. Inoltre, a tutti i messaggi ricevuti viene associato un identificativo e vengono memorizzati in un file locale. Attraverso un apposito comando, è possibile recuperare la lista di tutti i messaggi giunti al server.