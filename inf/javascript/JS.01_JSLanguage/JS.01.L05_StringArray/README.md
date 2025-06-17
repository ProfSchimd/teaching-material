# Stringhe e Array in JavaScript (`JS.01.L05`)

Bentornato! 👋 Sono sempre **John Smith**, ed è il momento di affrontare due dei tipi di dato più usati in assoluto in JavaScript: **le stringhe** e **gli array**.

Questi due mondi ti accompagneranno ovunque nel tuo percorso di programmatore. Quindi... iniziamo subito! 🚀

## Creare stringhe

In JavaScript, una **stringa** è semplicemente una sequenza di caratteri. Puoi crearla in tre modi:

```js
const saluto1 = "Ciao";
const saluto2 = 'Hello';
const saluto3 = `Hi`;
```

Sì, puoi usare **doppi apici**, **singoli apici** o i **backtick** (`` ` ``). E ognuno ha i suoi vantaggi.

Puoi anche concatenare più stringhe:

```js
const nome = "Marco";
const frase = "Ciao " + nome + "!";
console.log(frase); // Ciao Marco!
```

Ma questo modo è un po’ vecchiotto... vediamo qualcosa di meglio 👇

## Template literals

I **template literals** (introdotti con ES6) sono stringhe scritte con i **backtick** (`` ` ``) che ti permettono di **inserire variabili direttamente** dentro la stringa con `${}`.

Ecco qui:

```js
const nome = "Luca";
const messaggio = `Benvenuto, ${nome}!`;
console.log(messaggio); // Benvenuto, Luca!
```

Molto più chiaro, no? 😎

Puoi anche andare **a capo** facilmente:

```js
const poesia = `Rosa è il colore
del cielo al tramonto.`;
console.log(poesia);
```

Output:

```
Rosa è il colore
del cielo al tramonto.
```

## Creare array

Un **array** è una *sequenza* di valori. Si crea usando le **parentesi quadre** `[]`.

Esempio:

```js
const numeri = [1, 0, 3, -1, 12];
const names = ["Alice", "Bob", "Carol"];
```

Puoi accedere agli elementi con l’indice:

```js
console.log(names[0]); // Alice
console.log(numeri[2]); // 3
```

Gli array iniziano da indice **0** — non dimenticarlo! 😁

Puoi anche modificare un valore:

```js
nomi[1] = "Adam";
console.log(nomi); //  ["Adam", "Bob", "Carol"]
```

E aggiungere un elemento con `.push()`:

```js
nomi.push("David");
console.log(nomi); // ["Adam", "Bob", "Carol", "David"]
```

⚠️ **Attenzione:** gli array in JavaScript sono **molto più flessibili** rispetto a quelli di linguaggi come Java. In Java, un array può contenere solo elementi dello **stesso tipo** (ad esempio solo `int`, solo `String`, ecc.). Ma in JavaScript… possiamo mescolare **numeri**, **stringhe**, **booleani** e persino **altri array** nello stesso array!

Guarda questo esempio:

```js
const misc = [42, "ciao", true, [1, 2, 3]];
console.log(misc);
```

Output:

```
[42, "ciao", true, [1, 2, 3]]
```

Come vedi, JavaScript non si fa problemi: finché è un valore, lo puoi infilare nell’array! Questa **dinamicità** è super comoda, ma attenzione: più libertà significa anche più responsabilità 🫣


## Ciclare su stringhe e array con `for ... of`

A volte vuoi **scorrere** tutti i caratteri di una stringa o tutti gli elementi di un array. Il modo più leggibile è usare `for ... of`:

### Su una stringa:

```js
const parola = "Cane";

for (const lettera of parola) {
    console.log(lettera);
}
```

Output:

```
C
a
n
e
```

### Su un array:

```js
const frutti = ["Mela", "Banana", "Kiwi"];

for (const frutto of frutti) {
    console.log(frutto);
}
```

Output:

```
Mela
Banana
Kiwi
```

Facile, elegante, potente. ✨

## 🧪 Esercizi pratici

### Esercizio 1

Crea una variabile `messaggio` usando un **template literal** che dica:

```
Ciao Mario, oggi è lunedì!
```

Usa due variabili: `nome` e `giorno`. Crea una seconda variante in cui il giorno viene indicato mediante un intero tra 1 e 7 ed il messaggio mostro il giorno della settimana corrispondente leggendo da un array. Ad esempio se `giorno=2` il messaggio conterrà `oggi è martedì`.

### Esercizio 2

Crea un array di nomi e stampa ognuno con un saluto usando `for ... of`.

Esempio:

```js
// Output:
Ciao Gavin!
Ciao Hall!
Ciao Ivone!
```

### Esercizio 3

Scrivi un ciclo `for ... of` che scorra la stringa `"JavaScript"` e stampi solo le vocali (`a`, `e`, `i`, `o`, `u`).

## Riassunto

In questa lezione abbiamo visto due strumenti fondamentali:

* Le **stringhe**, come crearle e usarle con i **template literals**.
* Gli **array**, come crearli, accedere agli elementi, e modificarli.
* Il ciclo `for ... of` per **scorrere stringhe e array** in modo semplice.

## 🚀 Preparati alla prossima lezione!

Continua a sperimentare! Prova a creare messaggi dinamici e a manipolare liste di dati. Ogni esercizio è un passo avanti verso la padronanza di JavaScript! 💡🧠
