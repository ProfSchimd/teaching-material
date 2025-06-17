# Funzioni in JavaScript (`JS.01.L04`)

Ciao di nuovo! 👋 Sono sempre **John Smith** e stavolta ti racconto un’altra parte importante della mia avventura nel mondo JavaScript: **le funzioni**. Preparati, perché oggi mettiamo insieme i pezzi e iniziamo davvero a scrivere codice *serio*!

## Sintassi funzioni

In JavaScript possiamo **definire** una funzione usando la parola chiave `function`, seguita dal nome della funzione, da una lista di parametri tra parentesi tonde e poi un blocco di codice tra parentesi graffe `{}`. Guarda qui:

```js
function greet(name) {
    console.log(`Hello, ${name}!`);
}

greet("Alice");
```

Questo codice stampa:

```
Hello, Alice!
```

Vediamo un altro esempio:

```js
function sum(a, b) {
    return a + b;
}

const result = sum(5, 7);
console.log(`La somma è ${result}`);
```

Come vedi, possiamo usare `return` per far "ritornare" un valore dalla funzione.

🧠 **Ricorda**: una funzione può anche **non restituire nulla**, in quel caso si dice che ha *side effects*, ad esempio stampa qualcosa o modifica un valore globale (ma attento a non esagerare con questi effetti collaterali!).

## Funzioni anonime

In JavaScript le funzioni possono essere **anonime**, cioè **senza nome**. Servono quando vogliamo usarle una volta sola, oppure passarle a un'altra funzione.

Ecco un esempio:

```js
const sayHi = function(name) {
    console.log(`Hi ${name}!`);
};

sayHi("Bob");
```

Oppure possiamo scrivere una **arrow function** (`=>`), una forma compatta introdotta con ES6:

```js
const multiply = (a, b) => a * b;
console.log(multiply(3, 4)); // 12
```

⚠️ Se usi `{}` con una arrow function, devi usare `return`:

```js
const divide = (a, b) => {
    return a / b;
};
```

## First-Class functions e programmazione funzionale

Le funzioni in JavaScript sono **first-class citizens** — cioè possono essere:

* **Assegnate** a variabili,
* **Passate** come parametri,
* **Restituite** da altre funzioni.

### Assegnare funzioni a variabili

Lo hai già visto! Ma guarda questo:

```js
const square = function(x) {
    return x * x;
};

console.log(square(5)); // 25
```

Puoi anche creare un alias:

```js
const f = square;
console.log(f(10)); // 100
```

### Passare funzioni come parametri di funzioni

Ecco dove le cose si fanno interessanti:

```js
function applyTwice(f, x) {
    return f(f(x));
}

const double = x => x * 2;

console.log(applyTwice(double, 5)); // 20
```

Qui stiamo **passando la funzione `double`** come argomento ad un’altra funzione. Sì, è una cosa un po’ da maghi 🧙‍♂️ ma potentissima!

Un altro esempio pratico:

```js
const list = [1, 2, 3, 4, 5];
const squares = list.map(x => x * x);
console.log(squares); // [1, 4, 9, 16, 25]
```

La funzione `map` prende una funzione come parametro e la applica a tutti gli elementi di un array. Cool, vero?

## Cenni di funzioni asincrone

A volte il tuo programma deve **aspettare** qualcosa: per esempio una richiesta al server o un timer. JavaScript usa funzioni asincrone per fare queste cose senza bloccare tutto.

Guarda questo esempio con `setTimeout`:

```js
console.log("Inizio");

setTimeout(() => {
    console.log("3 secondi dopo...");
}, 3000);

console.log("Fine");
```

Output:

```
Inizio
Fine
3 secondi dopo...
```

Noti qualcosa di strano? `setTimeout` non blocca il codice! La funzione passata (una funzione anonima in questo caso) verrà eseguita **dopo** 3 secondi, mentre il resto del codice continua a girare.

Vedremo meglio le **funzioni asincrone**, `Promise` e `async/await` più avanti.

---

## 🧪 Esercizi pratici

### Esercizio 1

Scrivi una funzione `areaCerchio` che prende un raggio e restituisce l'area del cerchio (usa `Math.PI`).

```js
// output atteso: L'area di un cerchio di raggio 5 è 78.54
```

### Esercizio 2

Scrivi una funzione `salutaTutti` che prende un array di nomi e stampa un saluto per ciascuno.

```js
salutaTutti(["Luca", "Anna", "Paolo"]);
```

Output:

```
Ciao Luca!
Ciao Anna!
Ciao Paolo!
```

### Esercizio 3

Scrivi una funzione `ritardaMessaggio` che prende una stringa e la stampa dopo 2 secondi.

```js
ritardaMessaggio("Sto arrivando!");
```

---

## Riassunto

Oggi abbiamo conosciuto uno degli strumenti più potenti in JavaScript: **le funzioni**!

* Abbiamo visto la sintassi base con `function`.
* Imparato a creare **funzioni anonime** e **arrow functions**.
* Scoperto che le funzioni sono *first-class citizens*.
* Esplorato un primo assaggio di **programmazione funzionale**.
* Accennato al mondo **asincrono** con `setTimeout`.

---

## 🚀 Preparati alla prossima lezione!


Continua a esercitarti, prova a scrivere piccole funzioni per ogni problema che incontri. Prima o poi ti accorgerai che scrivere codice diventa naturale come respirare. 🌬️🧠
