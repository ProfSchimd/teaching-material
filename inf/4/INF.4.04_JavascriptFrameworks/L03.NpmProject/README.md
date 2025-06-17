# Progetti con `npm` (`INF.4.04.L03`)
In questo laboratorio si spiega come creare semplici progetti utilizzando il
*gestore di pacchetti* `npm`. Lo scopo è quello di fornire uno strumento pratico
e semplice per lo sviluppo di applicazioni frontend.

- [Progetti con `npm` (`INF.4.04.L03`)](#progetti-con-npm-inf404l03)
  - [Installazione `npm`](#installazione-npm)
  - [Inizializzazione](#inizializzazione)
  - [Esecuzione comandi con `npx`](#esecuzione-comandi-con-npx)

## Installazione `npm`
Il modo più semplice per ottenere `npm` è installare [NodeJS](https://nodejs.org/),
questo installa automaticamente `npm`.

## Inizializzazione
Per prima cosa si deve *inizializzare* un progetto `npm`, questa operazione è
necessaria al gestore di pacchetti che deve creare i file di configurazione.

1. Posizionarsi sulla cartella principale (*root directory*) del progetto ed eseguire il comando `npm init`
    ```shell
    cd my-project
    npm init
    ```
    Questa operazione richiede alcune informazioni
    ```
    package name: (my-project) inf-npm-setup
    version: (1.0.0) 
    description: An example project to setup npm
    entry point: (index.js) 
    test command: 
    git repository: 
    keywords: 
    author: 
    license: (ISC) 
    ```
    Al termine dell'operazione viene creato un file `package.json` contenente le
    informazioni necessarie al gestore dei pacchetti.
2. A questo punto è possibile installare pacchetti e dipendenze nel nostro progetto. `npm` prevede due tipi di installazione: *locale* e *globale*, se non viene indicato nulla, `npm` utilizza un'installazione locale. Se invece si desidera un'installazione globale dei pacchetti (scelta consigliata per risparmiare spazio di memoria), allora si deve esplicitamente indicare `--global` o `-g` nel comandi di installazione. Vediamo ora come installare il pacchetto `live-server` che mette a disposizione un semplice server HTTP con *hot-reload* che possiamo usare per semplici progetti (frontend, backend o full stack). In questo esempio l'installazione avverrà in locale, aggiunger `--global` per l'installazione globale.
    ```shell
    npm install live-server
    ```
    **Attenzione** `npm` scarica e installa i pacchetti localmente nella cartella `node_modules`, questa cartella può facilmente contenere centinaia di migliaia di file e la sua dimensione può essere di diversi gigabyte. È importante **evitare di tracciare con sistemi di versioning quali Git tale cartella**. Per evitare che Git tracci la cartella `node_modules` inserire una riga `node_modules/` nel file `.gitignore`, se tale file non esiste crearlo.

## Esecuzione comandi con `npx`
Il gestore `npm` permette di eseguire comandi attraverso il comando `npx`.
Proseguendo con l'esempio, dopo l'installazione del pacchetto `live-server` è
possibile eseguire un *server di sviluppo*, per fare questo usamo `npx`
```shell
npx live-server [folder]
```
dove `[folder]` è un parametro opzionale che sarà utilizzato da `live-server`
per servire il sito web.

**Attenzione** `live-server-` è una scelta valida solo nel caso di siti web statici
(senza contenuto dinamico, tipo PHP) e per il solo ambiente di sviluppo.

È prassi comune mettere l'intero sito web all'interno della sotto-cartella `public/`
del progetto. In questo caso il comando (impartito dalla cartella di progetto) sarà
```shell
npx live-server public
```

Maggiori informazioni su `live-server` si possono trovare nella pagina del
pacchetto presente [qui](https://www.npmjs.com/package/live-server).