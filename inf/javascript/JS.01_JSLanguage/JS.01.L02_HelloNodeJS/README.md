# Hello Node JS (`JS.01.L02`)

Ciao, sono sempre io John Smith (mi puoi chiamare John o JS), oggi ti mostro uno dei miei posti preferiti, si chiama **Node**. Cos'è Node? Molto semplice è un ambiente dove puoi divertirti o fare cose serie utilizzando il miglio linguaggio del mondo... **Javascript**. Se non hai mai avuto a che fare con node, forse è meglio se iniziamo dall'inizio.

## Installazione di NodeJS
Per scaricare l'installer di NodeJS si consiglia di andare sul [sito ufficiale][1] da dove è possibile scegliere la versione per il proprio sistema operativo. Una volta che si è correttamente installato Node si può avviarlo con il comando `node`. Questo comando (senza alcun parametro) avvia un REPL (Read-Eval-Print Loop) dove è possibile eseguire istruzioni Javascript (esattamente come nella console del browser).

```js
console.log("Hello Node JS!");
```

## Esecuzione di un file in Node
Oltre a divertirti con il REPL di node, puoi anche eseguire un file Javascript, puoi provare [quest](./src/hello_node.js) con il comando

```console
node hello_node.js
```

### Esercizio
Riprendi il [questo](../JS.01.L01_HelloJS/src/hello_js.js) codice ed eseguilo con Node JS. Cosa hai dovuto cambiare per far funzionare il codice?

## Moduli in Node JS
Lo sai che Node JS contiene moltissimi **moduli** che possono essere *importati* all'interno del tuo codice?! Vediamo subito un esempio per leggere dalla tastiera, useremo il modulo `readline`. Ci sono due modi per importare un modulo in Node JS: `import` e `require`.

```js
// Modo 1: import
import readline from 'readline';
```

```js
Modo 2: require
const readline = require('readline');
```

Anche se sono quasi uguali è preferibile il modo con `import` perché "più moderno". Proprio per questo motivo, però, codice vecchio potrebbe utilizzare `require` oppure potrebbe addirittura non supportare `import` obbligandoci ad utilizzare il modo `require`.

Adesso che abbiamo importato il modulo `readline` vediamo il codice per leggere dalla tastiera e riproporre sulla console quello che è stato letto (vedi anche il [sorgente](./src/input.js)).

```js
import readline from 'readline';

// Create interface for reading from stdin
const rl = readline.createInterface({
  input: process.stdin,
  output: process.stdout
});

// Read and echo
rl.question('Enter something: ', (answer) => {
  console.log(`You entered: ${answer}`);
  rl.close();
});
```


[1]: [https://nodejs.org/]