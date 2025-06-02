# JavaScript in HTML e nel Browser (`JS.01.L04`)

Ben ritrovato! Sono sempre **John Smith**, e oggi ti porto con me nel mondo in cui JavaScript è veramente *a casa sua*: il **browser**. Se finora abbiamo solo giocato nella console o in ambienti isolati, oggi il nostro codice inizia a vivere **dentro le pagine web**!

## Il tag `script`

Tutto comincia con una riga magica. Anzi, con un **tag** magico (guarda anche [questo file](./src/hello_browser.html)):

```html
<script>
  // Here goes JavaScript code
  console.log("Hello from the browser!");
</script>
```

Questo tag, scritto dentro una pagina HTML, dice al browser: "Ehi! Qui c'è del JavaScript da eseguire". Semplice, vero?

Puoi mettere il tag `<script>` sia nel `<head>` sia nel `<body>`, ma attenzione: l'**ordine** con cui il browser carica la pagina ha un'importanza cruciale, come vedremo subito.

## Ciclo di vita del document web e `onLoad`

Quando il browser carica una pagina, lo fa in **fasi**:

1. Scarica l’HTML.
2. Costruisce una struttura interna chiamata *DOM* (ne parleremo meglio più avanti).
3. Esegue gli script (i tag `<script>`).
4. Mostra la pagina all’utente.

Ma che succede se uno script prova a “toccare” elementi HTML **prima che siano stati caricati**? Succede un bel pasticcio.

La soluzione è dire al browser: *aspetta di eseguire questo script finché tutta la pagina non è pronta*. Possiamo farlo in due modi:

### Metodo 1: usare l’attributo `defer`

```html
<script src="myscript.js" defer></script>
```

Questo dice: *carica il file JS, ma eseguilo solo quando tutta la pagina è stata caricata*.

### Metodo 2: usare `window.onload`

```js
window.onload = function () {
    console.log("La pagina è stata caricata!");
};
```

Questo codice lo puoi anche mettere direttamente nel tuo script dentro `<script>`, e sarà eseguito **solo dopo** che tutto è pronto.

## I/O nel browser

Finora abbiamo comunicato con il mondo solo con `console.log`, ma nel browser abbiamo **strumenti molto più interattivi**.

### `console.log`

Lo conosci bene ormai:

```js
console.log("Questo messaggio appare nella console del browser!");
```

È utilissimo per il *debug* e per capire cosa sta succedendo dietro le quinte. Ma se vogliamo **parlare con l’utente**, abbiamo bisogno di qualcos’altro.

### `alert`

Un messaggio d’allerta che l’utente **non può ignorare** finché non clicca “OK”.

```js
alert("Attenzione! Hai cliccato qualcosa!");
```

### `prompt`

Vuoi chiedere qualcosa all’utente? Ecco il modo più semplice:

```js
const nome = prompt("Come ti chiami?");
console.log(`Benvenuto, ${nome}!`);
```

Attenzione: `prompt` **restituisce sempre una stringa**!

### `confirm`

Hai bisogno di una risposta **sì/no**? Usa `confirm`:

```js
const risposta = confirm("Sei sicuro di voler continuare?");
if (risposta) {
    console.log("L'utente ha detto SÌ");
} else {
    console.log("L'utente ha detto NO");
}
```

## Esercizi pratici

### Esercizio 1: Messaggio di benvenuto

Scrivi un programma che:

1. Chiede il nome all’utente con `prompt`;
2. Mostra un `alert` con il messaggio:

```
Ciao [nome]! Benvenuto sul mio sito!
```

### Esercizio 2: Conferma pericolosa

Scrivi un programma che:

1. Mostra un `confirm` che dice: “Vuoi davvero eliminare tutti i tuoi dati?”
2. Se l’utente conferma, stampa in console:

   ```
   😱 OK, i tuoi dati saranno eliminati! (sul serio?)
   ```
3. Altrimenti:

   ```
   😅 Meno male, operazione annullata!
   ```

### Esercizio 3: Calcolatrice base

1. Chiedi due numeri con `prompt`
2. Chiedi all’utente quale operazione desidera (`+`, `-`, `*`, `/`)
3. Mostra il risultato con `alert`

Esempio:

```
Inserisci primo numero: 5
Inserisci secondo numero: 3
Che operazione vuoi? +
Risultato: 8
```

💡 Ricorda: tutto ciò che `prompt` restituisce è una *stringa*, quindi forse dovrai usare `parseInt` o `parseFloat`.

## Riassunto

Ecco cosa abbiamo scoperto oggi:

* Il tag `<script>` serve per scrivere JavaScript nelle pagine HTML.
* Il browser carica la pagina in più fasi → attenzione al momento in cui esegui gli script!
* `window.onload` e `defer` sono tuoi amici.
* Abbiamo visto nuovi strumenti per l’interazione con l’utente:

  * `alert()` mostra un messaggio.
  * `prompt()` chiede un input.
  * `confirm()` chiede un sì o no.

## 🚀 Preparati al prossimo livello!

Ora che sai come JavaScript **vive nel browser**, sei pronto per usarlo per **modificare pagine HTML**, reagire agli **eventi degli utenti**, e creare **interfacce dinamiche**.

Prepara le dita… e la curiosità! Ci vediamo presto! 🌐💻✨
