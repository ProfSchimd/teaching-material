# Hello JS (`JS.01.L01`)

Benvenuto, sono **John Smith** ed oggi ti voglio raccontare la mia storia. Sono nato nel 1993 in una cittadina che si chiama *Mosaic* in California, presto però mi sono trasferito in una cittadina chiamata Nevig, meglio nota oggi come *Volpe di Fuoco*.

Proviamo a fare amicizia con il seguente [codice](./src/hello_js.js). Puoi scrivere ogni riga nella **Console sviluppatore** del tuo browser (quella cosa strana che compare quando, per sbaglio, previ `F12` nel browser). Puoi usare [NodeJS](https://nodejs.org/) (che però devi installare...). Per iniziare subito puoi provare uno dei tanti tool JavaScript che sono disponibili online ([Programiz](https://www.programiz.com/javascript/online-compiler/), [Stackblitz](https://stackblitz.com/))

```js
console.log('Hello stranger!');
console.log("Glad to see You, stranger");
const name = "John";
let surname = "Smith";
console.log(`My name is '${name} ${surname}'`);
var birthYear = 1993; // Please don't use var !!!
const age = 2025 - 1993; 
console.log("I am " + age + " years old");
```

## Tipi di dati in JavaScript
Come tutti i linguaggi, anche JavaScript ha i tipi (anche se un po' strani), ecco come si chiamano (alcuni dettagli li vedremo nelle prossime lezioni).

```js
console.log(typeof(123)); // number
console.log(typeof(123.456)); // number
console.log(typeof(false)); // boolean
console.log(typeof("Hello")); // string
console.log(typeof(undefined)); // undefined
console.log(typeof(null)); // object
console.log(typeof(Symbol())); // symbol
console.log(typeof(1234n)); // bigint
```

- Interi e float sono tutti di tipo `number`
- I booleani sono di tipo `boolean` con i soliti valori `true` e `false`
- Le stringhe di caratteri sono di tipo `string`
- Esiste un tipo misterioso che si chiama `undefined` che ha il solo valore `undefined`
- Esiste anche `object` di cui ci occuperemo nelle prossime lezioni
- Infine ci sono altri due tipi che non utilizzeremo e che sono `bigint` e `symbol`

## String template
Avrai notato una cosa strana nel codice sopra, questa riga
```js
console.log(`My name is '${name} ${surname}'`);
```
stampa una stringa, ma fa molto di più. Se hai provato il codice ti sarai accorto che usando `${...}` possiamo usare una variabile all'interno della stringa. Quando viene stampata, al posto della variabile viene sostituito il suo contenuto. Quindi sopra anziché `${name}` viene scritto `John` (cosa viene scritto al posto di `${surname}`?). Ovviamente questa cosa funziona anche se le variabili sono numeri o booleani o altro.



## Esercizi pratici

### Esercizio 1
Utilizza le stringhe template per stampare a video i seguenti messaggi
```
Il mio laptop è 14 pollici.
Un pollice è 2,54 cm.
Il mio laptop è 35,56 cm.
```
Non imbrogliare usa le template strings è la costante
```js
const CM_IN_INCH = 2.54;
```

Sempre utilizzando le *template string*, stampa il seguente messaggio
```
La mia auto ha i cerchioni da 18 pollici.
Quindi il loro diametro è ... cm.
L'area del mio cerchione è ... cm2.
```
Senza imbrogliare calcola e stampa il diametro e l'area dei cerchioni. Puoi usare la costante PI presente nella libreria `Math` di JavaScript.
```js
console.log(Math.PI); // 3.141592653589793
```

Vuoi creare un convertitore `Pollici -> cm` in HTML? [Clicca qui](./src/inch_to_cm.html) e completa il codice. Se sei veramente bravo, puoi anche provare a fare un *doppio convertitore*: uno `Pollici -> cm` ed un altro `cm -> Pollici`. Se ti interessa i cerchioni di auto, puoi anche creare un *calcolatore di area* a partire dal diametro ø in pollici. 


### Esercizio 2 
Devi sicuramente migliorare le tue *skill* con gli apici, scrivi il seguente programma usando tutte e tre i tipi di delimitatore per stringhe:
- doppi apici `" "` (Java style)
- singoli apici `' '`
- backtick `` ` ` `` (tastiera italiana? Prova la sequenza di tasti Alt+96, su Windows funziona!)

Scrivi tre barzellette brevi (non sconce!), scrivi una prima riga con la prima parte della barzelletta ed una seconda riga con la seconda parte. Comincio io

```js
console.log("Un cavallo 🐎 entra in un bar.");
console.log("BARISTA: Cos'è quel muso lungo? 😂");
```

Ricorda che la barzelletta non fa ridere senza l'emoji finale, guarda [qui](https://www.compart.com/en/unicode/block/U+1F600). Però c'è poca *suspense* nel tuo modo di raccontare le barzellette, [guarda cosa faccio io](./src/timeout.js). Forse il codice non ti sarà molto chiaro, ma quanto meglio è!? Sto anche preparando un sito web, guarda [qui](./src/barzellette.html) se vuoi darmi una mano (lo so che sono un po' indietro, ma potresti aiutarmi tu!).

## Condizioni e cicli

Un linguaggio senza condizioni e cicli non sarebbe molto utile, allora vediamo di cosa prevede il linguaggio javascript. 

### Condizioni `if...else`

```js
const d = new Date();
let hour = d.getHours();
if (hour > 12) {
    console.log("Un cavallo 🐎 entra in un bar.");
    console.log("BARISTA: Cos'è quel muso lungo? 😂");
} else {
    console.log("👩‍⚕️ Dottore, dottore! Ho solo 59 secondi di vita, mi aiuti!");
    console.log("Certo! Un minuto e sono da lei! 😂");
}
```

Come si vede dall'esempio, la sintassi di un `if...else` è uguale a quella di molti linguaggio (ad esempio Java), ovviamente è anche possibile usare `if` senza `else`

```js
let d = -1.23;
if (d < 0) {
    d = -d;
}
console.log(`d = ${d}`);
```

### Il matching con `switch`

In JavaScript esiste anche l'istruzione `switch` che esegue i rami i cui *casi* corrispondono, per esempio, il codice seguente stampa a console la stringa `two` (prova a cambiare il valore di `value` per vedere cosa stampa il codice).

```js
const value = 2;
switch (value) {
    case 0:
        console.log("zero");
        break;
    case 1:
        console.log("one");
        break;
    case 2:
        console.log("two");
        break;
    default:
        console.log(value);
        break;
}
```

### L'operatore ternario (if aritmetico)
Molti linguaggi (tra cui Java e C++) possiedono un *operatore ternario* (a volte chiamato *if aritmetico*) che rappresenta un'*espressione* il cui valore dipende da una condizione. Consideriamo il codice che segue

```js
const d = new Date();
let hour = d.getHours();
let color = "black"; 
if (hour < 12) {
    color = "white";
}
```

Un problema con questo codice è che non posso utilizzare `const` per la variabile `color` anche se so che non cambierà mai durante l'esecuzione del programma. Il problema è che vorremmo il valore di `color` dipendesse da una condizione, tipo *se è prima di mezzogiorno usa il colore nero altrimenti usa il colore bianco*. L'operatore ternario serve proprio a questo scopo.

```js
const d = new Date();
let hour = d.getHours();
const color = hour < 12 ? "white" : "black";
```

L'operatore ternario è costituito di tre parti:
1. una **condizione** che precede il simbolo `?`;
2. un'espressione che sarà il risultato se la condizione in 1. è vera e
3. una seconda espressione che sarà il risultato se la condizione in 1. è falsa.

### Esercizi sulle condizioni

1. Scrivere il codice per 


### Cicli `for`, `while` e `do ... while`
Se hai già studiato altri linguaggi, sicuramente sai cosa sono i **cicli** (*loop*). In JavaScript esistono diversi tipi di cicli, tra cui i conosciutissimi `for`, `while` e `do..while`


```js
const n = 10;
for (let i = 0; i < n; i++) {
    console.log(`${i} squared is ${i*i} while cubed is ${i*i*i}`);
}
```

```js
let j = 0;
while(j < n) {
    console.log(`The square root of ${j} is ${Math.sqrt(j)}`);
    j++;
}
```

```js
let x = -10;
do {
    console.log(`10^${x} is ${Math.pow(10,x)}`);
    x++;
} while(x <= 0);
```

Esistono altri due tipi di `for` che chiamiamo *for each*, ma prima di vederli dovrai imparare meglio come si usano gli array in JS e ormai è tardi e ora di finire questa lezione.

## Numeri casuali
Ti va di fare un gioco? Facciamo la *morra cinese* (forse la conosci come *sasso-carta-forbice*). Le regole sono semplici
- ci sono due giocatori,
- contemporaneamente ciascun giocatore sceglie uno tra: carta 📄 , forbice ✂️ e sasso 🪨
- se i due fanno la stessa scelta c'è un pareggio altrimenti
- carta vince su sasso - sasso vince su forbice -- forbice vince su carta


## Riassunto
Ecco quello che abbiamo visto oggi con John Smith
- Stampare con `console.log`.
- Definire variabili `let` e costanti `const` (abbiamo visto anche `var`, ma è da *boomer*).
- String template come `Hello ${nome}`.
- Condizioni: `if..else`, `switch` e `... ? ... : ...`.

## 🚀 Preparati al prossimo livello!
Hai fatto un ottimo lavoro fin qui: hai mosso i primi passi nel mondo di JavaScript e hai già incontrato concetti fondamentali come variabili, stringhe, condizioni e cicli. Ma questo è solo l'inizio! Nelle prossime lezioni inizieremo a usare JavaScript in ambienti reali: scriveremo codice che gira sia nel browser, per creare pagine web interattive, sia in Node.js, per costruire strumenti e applicazioni lato server.

Per arrivare preparato, esercitati il più possibile: ripeti gli esempi, prova a modificarli, crea i tuoi mini programmi. Anche gli errori fanno parte del viaggio — ogni errore ti insegna qualcosa che un successo non potrebbe. 💪

La vera forza di un programmatore è nella costanza e nella curiosità: continua a sperimentare, e molto presto vedrai il tuo codice prendere vita! 🧠⚙️✨

Ci vediamo alla prossima lezione!

