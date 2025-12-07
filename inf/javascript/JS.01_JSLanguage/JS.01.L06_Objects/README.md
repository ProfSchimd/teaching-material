# Oggetti in JavaScript (`JS.01.L06`)

Bentornato! 👋 Sono sempre **John Smith**, oggi esploriamo un pilastro fondamentale di JavaScript: **gli oggetti**.

Se stringhe e array ti permettevano di lavorare con sequenze di dati, gli oggetti ti permettono di modellare **cose reali**, con **proprietà** e **valori**. Preparati: da qui in poi gli oggetti saranno ovunque! 🚀

---

## Che cos’è un oggetto?

Un **oggetto** è una collezione di **coppie chiave–valore**.

In pratica: ogni chiave rappresenta un *nome* (una proprietà), e ad essa è associato un valore.

Ecco un esempio semplicissimo:

```js
const person = {
    name: "Alice",
    age: 30,
    isStudent: false
};
```

Qui abbiamo un oggetto con tre proprietà: `name`, `age`, `isStudent`.

Questo è il modo più comune per creare oggetti: usando le **graffe** `{ }`. ✨

---

## Accedere alle proprietà

Puoi leggere (o modificare) una proprietà di un oggetto in due modi.

### 1. Dot notation (`.`)

```js
console.log(person.name);  // Alice
console.log(person.age);   // 30
```

### 2. Bracket notation (`["chiave"]`)

```js
console.log(person["name"]); // Alice
```

A cosa serve questa seconda forma? Beh, ad esempio quando la chiave è memorizzata in una variabile:

```js
const prop = "age";
console.log(person[prop]); // 30
```

Oppure quando la chiave contiene caratteri strani:

```js
const ogg = { "birth-date": "2000-10-10" };
console.log(ogg["birth-date"]);
```

---

## Modificare un oggetto

Gli oggetti sono **mutabili**, anche se li dichiari con `const`.

### Cambiare un valore

```js
person.age = 31;
console.log(person.age); // 31
```

### Aggiungere una nuova proprietà

```js
person.city = "Roma";
console.log(person);
```

### Eliminare una proprietà

```js
delete person.isStudent;
console.log(person);
```

---

## Oggetti annidati

Dentro un oggetto puoi mettere altri oggetti! o array... o funzioni... Insomma, qualsiasi valore JavaScript.

```js
const car = {
    brand: "Toyota",
    model: "Yaris",
    engine: {
        cc: 1200,
        fuel: "benzina"
    },
    optional: ["ABS", "Radio", "Bluetooth"]
};

console.log(car.engine.cc);  // 1200
console.log(car.optional[1]);        // Radio
```

---

## Metodi: funzioni dentro gli oggetti

Quando una proprietà contiene una **funzione**, prende il nome di **metodo**.

```js
const robot = {
    name: "T-800",
    greet() {
        console.log("Hasta la vista, baby!");
    }
};

robot.greet(); // Hasta la vista, baby!
```

I metodi permettono all’oggetto di **agire**, non solo di contenere dati.

---

## Loop sugli oggetti con `for ... in`

Se con `for ... of` scorrevi array e stringhe, per gli oggetti usiamo invece **`for ... in`**, che itera sulle *chiavi*.

```js
const persona = {
    name: "Sara",
    age: 27,
    city: "Milano"
};

for (const key in person) {
    console.log(key, person[key]);
}
```

Output:

```
nome Sara
eta 27
citta Milano
```

---

## Oggetti vs Array: quando usare ciascuno?

* Usa un **array** quando l’ordine è importante o quando rappresenti una lista.
* Usa un **oggetto** quando descrivi qualcosa con proprietà nominate.

Esempio:

```js
const studente = {
    name: "Carlo",
    subjects: ["Math", "CS"]
};
```

Ha senso: lo studente è un oggetto, mentre le sue materie sono un elenco ⇒ array.

Ecco la **stessa lezione**, con una **nuova sezione dedicata a JSON**, mantenendo stile, tono e struttura identici.
(La aggiungo alla fine, subito prima degli esercizi.)

---

## JSON: JavaScript Object Notation

Ora che conosci gli oggetti, è il momento perfetto per introdurti a **JSON** (si legge “**Gison**” o “**Jason**”).
JSON è un formato **universale**, usato ovunque per **scambiare dati** tra programmi, siti web e API. Ed è basato… sugli oggetti di JavaScript! 🎉

### Cos’è JSON?

È un modo per rappresentare dati usando **oggetti** e **array**, ma con alcune regole molto rigide.

Esempio di JSON valido:

```json
{
    "name": "Alice",
    "age": 30,
    "hobby": ["read", "swim"],
    "active": true
}
```

### Differenze tra JSON e oggetti JavaScript

Anche se sembrano identici, ci sono alcune differenze importanti:

| Caratteristica | Oggetto JS               | JSON                                  |
| -------------- | ------------------------ | ------------------------------------- |
| Chiavi         | senza virgolette OK      | devono avere **sempre** le virgolette |
| Stringhe       | con `"` o `'` o backtick | **solo** `"`                          |
| Funzioni       | permesse                 | ❌ vietate                             |
| Commenti       | permessi                 | ❌ vietati                             |

Esempio NON valido come JSON:

```js
{
    name: "Mario",     // ❌ manca "
    greet() {},        // ❌ funzioni vietate
    active: true,
}
```

### Convertire oggetti in JSON

In JavaScript puoi convertire un oggetto in una stringa JSON usando `JSON.stringify()`.

```js
const person = { name: "Luca", age: 25 };

const json = JSON.stringify(person);
console.log(json);
// {"nome":"Luca","eta":25}
```

Questo è fondamentale quando devi **inviare dati a un server**, salvare impostazioni, ecc.

### Convertire JSON in oggetti

Se ricevi una stringa JSON, per convertirla in un vero oggetto JavaScript usi `JSON.parse()`:

```js
const text = `{"name":"Sara","age":22}`;

const obj = JSON.parse(text);
console.log(obj.name); // Sara
```

### Quando userai JSON?

→ Quando farai chiamate API
→ Quando salverai dati nel browser
→ Quando comunicherai tra due servizi

In altre parole: **sempre** 😉

---

## 🧪 Esercizi pratici

### Esercizio 1

Crea un oggetto `libro` con le proprietà `titolo`, `autore` e `anno`. Aggiungi la proprietà `pagine` dopo la creazione e stampa tutto usando `for ... in`.

### Esercizio 2

Crea un oggetto `counter` con una proprietà `value` inizializzata a `0` e un metodo `increment()` che aggiunge 1 al valore.
Esempio di utilizzo:

```js
counter.increment();
console.log(counter.value); // 1
```

### Esercizio 3

Crea un oggetto `person` con proprietà annidate (ad esempio un oggetto `address` dentro l’oggetto principale). Stampa l'indirizzo completo con un template literal.

---

## Riassunto

Oggi abbiamo visto:

* cosa sono gli **oggetti** e come crearli,
* come **accedere, modificare e cancellare** proprietà,
* come usare **metodi** e oggetti annidati,
* come scorrere un oggetto con **for ... in**.

Gli oggetti sono il cuore di JavaScript. Imparare a usarli bene è come ottenere una superpower nel linguaggio. 💥

---

## 🚀 Ci vediamo nella prossima lezione!

Continua a sperimentare, crea modelli di oggetti reali, gioca con proprietà e metodi. È così che JavaScript inizia davvero a prendere vita! 💡🧠
