# Lab: Realizzare in una semplice web app (`WEB.00.L02`)
In questa esperienza useremo il *packet manager* `npm` di NodeJS per installare un semplice *web server di sviluppo* che ci permetterà di *servire* delle pagine HTML statiche.

## Il Web server

Apriamo una Prompt dei comandi o una Power shell. Innanzi tutto verifichiamo che nella nostra macchine sia installato NodeJS
```shell
node --version
```
se Node è installato anche `npm` dovrebbe esserlo
```shell
npm --version
```

> [!IMPORTANT]
> Se NodeJS o `npm` non sono installati, contattare il docente o il tecnico. Nella propria macchina è possibile installare NodeJS scaricandolo sal [sito ufficiale](https://nodejs.org/en).

Utilizzando `npm` (*node packet manager*) è possibile installare diversi pacchetti, nel nostro caso utilizziamo [`live-server`](https://www.npmjs.com/package/live-server) che ci permette di eseguire in modo semplice e veloce un piccolo *web server*.

> [!WARNING]
> Per progetti reali che vengono esposti sulla rete Internet, è bene usare dei software più indicati quali Apache o ngnix che garantiscono migliori performance e, soprattutto, maggiore sicurezza. Questi strumenti sono molto più difficili da installare e configurare e non ce ne occuperemo.

A questo punto possiamo installare `live-server` utilizzando `npm`, trattandosi di un tool di sviluppo, vogliamo installarlo *globalmente* (non solo per il progetto attuale) usando l'opzione `-g`.

```shell
npm install -g live-server
```

Se l'installazione va a buon fine possiamo eseguire `live-server` con il seguente comando
```shell
npx live-server
```

## La prima pagina HTML
L'esecuzione precedente di `live-server` ha aperto una pagina che ci permette di navigare il nostro *filesystem*, questo non è certo quello che ci aspettiamo da una web application.

Come tutti i web server, anche `live-server` restituisce, se lo trova, un file chiamato `index.html`. Per creare questo file spostiamoci su una directory vuota oppure su una directory con un progetto Git vuoto (con solo README.md) e creiamo all'interno di questa directory un file chiamato `index.html`.

Aggiungiamo il seguente contenuto al file

```html
<!DOCTYPE html>
<html>
<head>
    <title>First HTML</title>
</head>
<body>
    <h1>Hello HTML!</h1>
</body>
</html>
```

Ora eseguiamo `live-server` dalla stessa directory (se `live-server` è ancora in esecuzione lo possiamo interrompere con `CTRl+C`). Se tutto funziona come dovrebbe, la pagina che si apre ora corrisponde al file HTML che abbiamo appena create.

Possiamo verificare che il codice HTML ricevuto è quello che abbiamo inserito utilizzando gli strumenti di sviluppatore del browser (nella maggior parte dei browser premendo `F12` si accede ai tool di sviluppo).

Possiamo anche verificare una delle caratteristiche più importanti di `live-server` il fatto che è **live**. Senza chiudere la pagina del browser, modifichiamo il file `index.html` aggiungendo sotto `<h1>` il seguente paragrafo

```html
<p>Oggi ho usato <code>live-server</code>.</p>
```

Non appena salviamo le modifiche, la pagina si aggiorna automaticamente. Per capire la differenza di avere questa feature chiamata *hot reload*, prova ad aprire il file `index.html` direttamente dal browser ed effettuare una modifica al file stesso. Cosa succede?

## Interrogare il web server con il browser
Hai notato che l'avvio di `live-server` fa partire anche il browser sulla pagina corretta? 🚗 Cosa vedi scritto nella barra degli indirizzi del browser? 🤔 Probabilmente, ci sarà indicato ils seguente indirizzo
```
http://127.0.0.1:8080
```
In breve questo indica
- che si sta utilizzando il protocollo `http`
- che l'indirizzo IP da contattare è `127.0.0.1` (che significa "questo PC") e
- che la porta da utilizzare à la numero `8080`

🧪 **Prova** Mentre una una istanza di `live-server` è già in esecuzione apri un secondo prompt dei comandi ed avvia di nuovo `live-server`. Cosa succede? Dovresti leggere un messaggio simile al seguente
```
http://0.0.0.0:8080 is already in use. Trying another port.
Ready for changes
```
ed il browser che sia avvia dovrebbe adesso puntare ad un indirizzo diverso tipo
```
http://127.0.0.1:65327
```
anche sel l'indirizzo IP è lo stesso `127.0.0.1` cambia la porta che ora è `65327`. In questo modo possiamo avere due (o anche più) istanze di `live-server` contemporaneamente in esecuzione sulla stessa macchina.

### Identificare il sorgente HTML
Il browser è in grado di interpretare e visualizzare una pagina HTML in modo molto sofisticato, ma noi possiamo anche **vedere il codice sorgente** della pagina che viene scaricato dal web server.

> [!TIP]
> Questo è utile per capire se il nostro file HTML è servito correttamente e come appare prima che il browser lo "interpreti".

Per visualizzare il sorgente:

1. Apri la pagina nel browser.
2. Clicca con il tasto destro del mouse in un punto qualsiasi della pagina (non su un'immagine o link).
3. Seleziona “Visualizza sorgente pagina” o simile (dipende dal browser).

Dovresti vedere qualcosa come:

```html
<!DOCTYPE html>
<html>
<head>
    <title>First HTML</title>
</head>
<body>
    <h1>Hello HTML!</h1>
    <p>Oggi ho usato <code>live-server</code>.</p>
</body>
</html>
```

Questo conferma che il browser sta ricevendo il file esattamente come l’abbiamo scritto.

### Semplice utilizzo degli strumenti di sviluppatore

Gli strumenti per sviluppatori (accessibili solitamente con `F12`) permettono di:

* **Esplorare l’albero degli elementi HTML** (`Elements`)
* **Verificare errori nella console** (`Console`)
* **Controllare le richieste di rete** (`Network`)
* **Testare modifiche in tempo reale** (modificando direttamente l’HTML o il CSS)

🧪 **Prova pratica**:

1. Apri gli strumenti sviluppatore (`F12`).
2. Cerca la scheda che visualizza gli elementi HTML.
3. Clicca su `<h1>Hello HTML!</h1>` e prova a modificare il testo direttamente lì.
4. Premi `Enter`: il cambiamento sarà visibile nel browser, anche se **non permanente** (non modifica il file `index.html`).

## Altri client 

### `curl`

Un *client* è qualsiasi programma che effettua richieste ad un server. Il browser è un esempio di client, ma non è l’unico.

### `curl`

`curl` è uno strumento da riga di comando che permette di effettuare richieste HTTP. È molto utile per testare rapidamente il comportamento di un web server.

Prova a usare il seguente comando da una nuova finestra del prompt dei comandi:

```shell
curl http://127.0.0.1:8080
```

Se tutto è configurato correttamente, `curl` ti restituirà il contenuto del file `index.html` che il server sta servendo. In altre parole, è come se il browser stesse chiedendo la pagina, ma senza la parte grafica.

## Pagine web dinamiche

Finora abbiamo creato una pagina **statica**, ovvero un semplice file HTML che non cambia a seconda di chi lo visita o quando viene visitato.

Una **pagina dinamica**, invece, può **cambiare in base ai dati** o a **interazioni** dell’utente.

Esempi di pagine dinamiche:

* Un modulo di login che mostra un messaggio di errore se la password è sbagliata.
* Un sito di notizie che aggiorna i contenuti in base all’orario o alle preferenze dell’utente.
* Una web app che mostra dati da un database o un'API.

> [!NOTE]
> Per creare pagine dinamiche servono strumenti aggiuntivi come **JavaScript**, **framework** front-end (es. React), oppure server con **backend** in linguaggi come Node.js, PHP, Python, ecc.

In questo laboratorio ci siamo concentrati su una **base solida e semplice**: capire come funziona un server web, come serve pagine HTML e come testarlo localmente.

## Dizionario

**Console** Strumento interattivo presente tra gli strumenti di sviluppo del browser.

**`curl`** Programma di utilità per generare richieste HTTP da riga di comando.

**Hot reload** Caratteristica di alcuni web server (ad esempio `live-server`) che permette di vedere in tempo reale le modifiche al file.

**`live-server`** Semplice web server scritto in Javascript, utile in fase di sviluppo, installabile da `npm` e con *hot reload*.

**Node JS** Macchina virtuale Javascript da utilizzare per sviluppare applicazioni non web con Javascript.

**Porta** Identificativo di un processo all'interno di un *host* di rete.
