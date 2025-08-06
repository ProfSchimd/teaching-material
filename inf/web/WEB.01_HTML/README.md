# HTML (`WEB.01`)

**HTML** (HyperText Markup Language) è un linguaggio di *markup*, cioè un linguaggio che descrive come è fatto un testo multimediale, HTML **non è un linguaggio di programmazione**. In un file HTML troviamo un documento multimediale che può essere fatto di testo, immagini, link, ... insieme ad una descrizione di come il documento deve essere presentato.

☞ Apri con un editor di testo (ad esempio Visual Studio Code) il file [empty.html](./src/01-   empty.html) nella cartella [`src`](./src/)

```html
<!DOCTYPE html>
<html>
<head>
    <title>Documento HTML Vuoto</title>
</head>
<body>
</body>
</html>
```

Il file contiene un documento HTML vuoto del quale però possiamo discuterne la struttura.

- Il documento indica nella prima riga che il contenuto che si trova nel file è di tipo html, questo avviene nella riga `<!DOCTYPE html>`.
- Ogni parte di un documento HTML è un **tag** con un nome, esiste l'apertura `<...>` e la chiusura `</...>` di un tag. Alcuni tag speciali (ad esempio `!DOCTYPE` non hanno chiusura).
- Il tag `html` contiene l'intero documento.
- All'interno di un tag possono essere presenti altri tag, ma la chiusura deve essere fatta in modo corretto, quanto segue non è corretto poiché `title` si chiude dopo aver chiuso `head`.
```html
<head><title>Titolo</head></title>
```
La struttura di un documento HTML viene chiamata **Document Object Model (DOM)** ed è simile ad un albero. Il tronco principale è il tag `html` (chiamato **radice** o *root* del documento), ogni tag è un ramo. Lungo un ramo (ad esempio il tag `head`) possono crescere altri rami che sono tag come `title` nell'esempio sopra.

## Contenuto di un documento HTML
Per inserire del contenuto all'interno di un documento HTML è sufficiente inserire il testo all'interno del tag `body`, se però siamo interessati a dare uno *stile* al testo, dobbiamo utilizzare dei tag che ci permettono di definire lo stile.

- `<h1>...</h1>` Permette di inserire un'intestazione di livello 1 (massimo livello)
- `<h2>...</h2>` Intestazione di livello due
- `<hN>...</hN>` Intestazione di livello `N` (può essere da 1 a 6)
- `<p>...</p>` Paragrafo di testo
- `<b>...</b>` Grassetto1
- `<i>...</i>` Italico

Inserisci dentro al tag `body` il seguente blocco. Apri il file salvato con un browser (ad esempio Chrome), cosa vedi?
```html
<h1>Primo documento HTML</h1>
<h2>Lezione 1 - HTML</h2>
<p>
    Questo è il mio <b>primo documento</p> HTML, <i>Feels Good!</i>
</p>
```

Come si nota il browser ha interpretato il codice HTML ed ha fatto il *rendering* del documento utilizzando uno **stile di default** per titoli paragrafi, grassetto, ... Certo non un gran stile!

## I fogli di stile: CSS
HTML non prevede un meccanismo per definire lo stile di un documento, è necessario utilizzare del codice **CSS (Cascading Style Sheet)** che ci permette di dire al browser come vogliamo il rendering dei vari elementi dei un documento.

Il modo più semplice per inserire lo stile CSS è utilizzando il tag `style` come parte del tag `head`, dentro il tag `style` mettiamo le **regole** CSS che vogliamo applicare. Copia il seguente codice prima della chiusura di `head`, cioè prima di `</head>`. Dopo averlo copiato salva e fai il *refresh* del documento dal browser (F5 oppure CTRL+R oppure il tasto ↻ del browser). Cosa succede al documento?

```html
<style>
h1 {
    color: red;
}
</style>
```

Una regola CSS è composta da un **selettore** (`h1` nell'esempio) ed una serie di stili (un solo stile `color: red` nell'esempio) raggruppati all'interno di parantesi graffe `{ ... }` e separati da punto e virgola. Ogni stile è specificata da una proprietà (`color`) ed un valore (`red`) separati da due punti `:`.

```css
selettore {
    prop1: val1;
    prop2: val2;
    ...
}
```

**Esercizio**
Sapendo che la proprietà `background-color` permette di assegnare un colore allo sfondo, aggiungere una regola per i tag `h2` che preveda il testo bianco e lo sfondo blu. Aggiungere anche il seguente stile `padding: 10px;`, cosa far questo stile? (Suggerimento si può commentare una regola usando la doppia barra `//` come i commenti Java e Javascript).

### Progetti
Creare una pagina con uno sfondo

Ecco alcune indicazioni e suggerimenti per lo svolgimento.
- In CSS, i colori si possono indicare per nome (come sopra), ma anche usando i valori RGB: `#RRGGBB` dove i valori `RR`, `GG` e `BB` sono valori esadecimali.
- La proprietà `margin` può essere usata per mettere dello spazio tra gli elementi, in alcuni casi, `margin: 0` è utilizzato per eliminare margini indesiderati. Possiamo anche indicare quale lato del margine impostare con `margin-LATO` mettendo al posto `LATO` `top`, `right`, `bottom` o `left`. Da provare anche margini *relativi* tipo `10%` anziché `10px`.
- Con la proprietà `font-family` è possibile cambiare il tipo di font e se vogliamo applicare la regola a tutto il documento dobbiamo selezionare il tag che contiene tutti gli altri (root).

## Sommario
In questa lezione abbiamo visto:
- Come è fatto un documento HTML
- I tag `hN`, `p`, `b` e `i` di HTML
- Come inserire lo stile CSS all'interno di un documento HTML
- Il selettore di tag CSS
- Le proprietà CSS `color`, `background-color`, `padding`.

## Dizionario