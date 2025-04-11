# Hello JS (`JS.01.L01`)

Benvenuto, sono **John Smith** ed oggi ti voglio raccontare la mia storia. Sono nato nel 1993 in una cittadina che si chiama *Mosaic* in California, presto però mi sono trasferito in una cittadina chiamata Nevig meglio nota oggi come *Volpe di Fuoco*.

Proviamo a fare amicizia con il seguente [codice](./src/hello_js.js). Puoi scrivere ogni riga nella **Console sviluppatore** del tuo browser (quella cosa strana che compare quando, per sbaglio, previ `F12` nel browser). Puoi usare [NodeJS](https://nodejs.org/) (che però devi installare...). Per iniziare subito puoi provare uno dei tanti tool Javascript che sono disponibili online ([Programiz](https://www.programiz.com/javascript/online-compiler/), [Stackblitz](https://stackblitz.com/))

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

## Tipi di dati in Javascript
Come tutti i linguaggi, anche Javascript ha i tipi (sono dei *tipi strani* però), ecco come si chiamano (alcuni dettagli li vedremo nelle prossime lezioni).

```js
console.log(typeof(123)); // number
console.log(typeof(123.456)); // number
console.log(typeof(false)); // boolean
console.log(typeof("Hello")); // boolean
console.log(typeof(undefined)); // undefined
console.log(typeof(null)); // object
console.log(typeof(Symbol())); // symbol
console.log(typeof(1234n)); // bigint
```

- Interi e float sono tutti di tipo `number`
- I booleani sono di tipo `boolean` con i soliti valori `true` e `false`
- Le stringhe di caratteri sono di tipo `string`
- Esiste un tipo misterioso che si chiama `undefined` cha il solo valore `undefined`
- Esiste anche `object` di cui ci occuperemo nelle prossime lezioni
- Infine ci sono altri due tipi che non utilizzeremo e che sono `bigint` e `symbol`

## String template
Avrai notato una cosa strana nel codice sopra, questa riga
```js
console.log(`My name is '${name} ${surname}'`);
```
stampa una stringa, ma fa molto di più. Se hai provato il codice ti sarai accorto che usando `${...}` possiamo usare una variabile all'interno della stringa. Quando viene stampata, al posto della variabile viene sostituito il suo contenuto. Quindi sopra anziché `${name}` viene scritto `John` (cosa viene scritto al posto di `${surname}`?). Ovviamente questa cosa funziona anche se le variabili sono numeri o booleani o altro.



## Facciamo un po' di workout

### Esercizio 1
Utilizza le stringhe template per stampare a video i seguenti messaggi
```
Il mio laptop è 14 pollici.
Un pollice sono 2,54 cm.
Il mio laptop è 35,56 cm.
```
Non imbrogliare usa le template strings è la costante
```js
const CM_IN_INCH = 2.54;
```

Sempre utilizzando le string template, stampa il seguente messaggio
```
La mia auto ha i cerchioni da 18 pollici.
Quindi il loro diametro è ... cm.
L'area del mio cerchione è ... cm2.
```
Senza imbrogliare calcola e stampa il diametro e l'area dei cerchioni. Puoi usare la costante PI presente nella libreria `Math` di Javascript.
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


## Riassunto
Ecco quello che abbiamo visto oggi con John Smith
- Stampare con `console.log`.
- Definire variabili `let` e costanti `const` (abbiamo visto anche `var`, ma è da *boomer*).
- String template come `Hello ${nome}`.

