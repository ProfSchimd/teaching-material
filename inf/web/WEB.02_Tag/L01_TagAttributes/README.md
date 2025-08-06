# HTML Semantico, tag e attributi (`WEB.02.L01`)

## HTML Semantico
L'attuale versione di HTML è chiamata HTML5 e comprende diversi tag che permettono di identificare la struttura del documento non solo il suo *layout*. Ad esempio guadiamo il [questo file](./src/semantic.html) nel quale ci sono alcuni "strani" tag
```html
<header>...</header>
<nav>...</nav>
<main>...</main>
<article>...</article>
<footer>...</footer>
```
Questi non sono i "classici" (generici) tag `<div>`, `<p>`, ... bensì sono tag che indicano più nello specifico cosa contengono. Ad esempio `<main>` contiene la parte "principale" della pagina. Questi tag sono a volte detti *semantici* perché indicano il significato del loro contenuto, oggi sono utilizzati nelle moderne applicazioni web ed il loro impiego è fortemente raccomandato.

## Attributi
I tag HTML spesso contengono **attributi** che servono a specificare alcune delle caratteristiche. Un classico esempio è il tag `<a>` (*anchor*) che è utilizzato per collegare (*link* 🔗) altre pagine o altre sezioni della stessa pagina. Per indicare quale pagina collegare si usa un tag chiamato `href`
```html
<a href="https://www.itiszuccante.edu.it/">La nostra scuola</a>
```

I tag vengono specificati nel tag di apertura, tra il nome del tag e la fine dell'apertura  `<NOME_TAG ATTRIBUTI>`. Ogni attributo ha un suo nome ed un valore, ad esempio `href="..."`.

> [!TIP]
> Possiamo inserire tutti gli attributi che vogliamo in un qualsiasi tag. Ad esempio possiamo avere il seguente codice
> ```html
> <a href="google.com" landing="search-engine">Search Engine</a>
> ```
> Gli attributi che non sono utili al browser per eseguire il *rendering* della pagina verranno ignorati. Il motivo per inserire degli attributi personalizzati può essere per facilitare la scrittura del codice Javascript. Alcuni framework, tra cui AlpineJS, utilizzano degli attributo *custom* per permettere alla libreria di fare il *parsing* del codice HTML e crearne la versione finale.

Vediamo ora alcuni dei tag più frequentemente utilizzati (per un esempio completo si veda il file [`semantic.html`](./src/semantic.html) nella cartella `src/`).

### `id`
Ad ogni elemento del documento può essere assegnato un valore di `id` che viene utilizzato in varie situazione. Un tipico utilizzo di `id` e in CSS dove esiste una *selettore* che permette di applicare delle regole di stile solo a determinati `id`.

```html
<div id="content">
    <h1 id="title">Page Title</h1>
</div>
```

> [!WARNING]
> Nel scrivere un file HTML, nulla ci vieta di inserire due diversi tag con lo stesso valore di `id`. Spesso questo succede quando i progetti diventano complicati o si usano framework che generano i vari tag "automaticamente". Questo significa il browser può ricevere un HTML con tag che hanno stesso valore di `id`. In questo caso qualsiasi operazione si basi sull'univocità di un `id` può non funzionare correttamente. Questo può essere importante in fase di *styling* (si può applicare uno stile sulla base dell'`id`) o in fase di programmazione Javascript (ad esempio si pensa di *selezionare* l'unico elemento con un dato `id`, ma in realtà ne esistono più d'uno).

### `class`

Una classe indica che un tag appartiene ad una certa categoria (classe). Ad esempio possiamo usare una classe per indicare tutti gli elementi di codice che sono html

```html
<code class="html-tag">div</code>
```

Le classi sono stringhe che non possono contenere spazi o caratteri speciali quali `:!;,` possono tuttavia contenere numeri underscore `_` ed anche trattini `-`.

Si possono inserire più classi in `class` basta separarle con uno spazio. Ad esempio vogliamo indicare che un contenuto è importante e codice html
```html
<code class="important html-tag">&lt;html&gt;</code>
```

### `style`
Un attributo utile è `style` che permette di applicare degli stili a ciascun elemento. Ad esempio se vogliamo che una parte di testo sia rossa, possiamo includere il testo nel tag `<span>` a cui aggiungiamo un attributo `style`
```html
 <span style="color: red">testo in rosso</span>
```
All'interno dell'attributo `style` possiamo inserire anche più regole
```html
 <span style="color: red; font-weight: bold">red and bold text</span>
 ```

> [!IMPORTANT]
> L'attributo `style` è usato raramente in quanto la definizione dello stile di un elemento dovrebbe sempre essere fatta utilizzando i *fogli di stile* CSS in un file esterno o nel tag `<style>`.

### Altri attributi
Esistono centinaia di attributi definiti dallo standard HTML5, alcuni si applicano a tutti i tag altri invece sono specifici di alcuni tag. Ecco una lista di attributi che si presentano spesso in una web application.
- `name`
- `role`
- `target`
- `aria-label`
- `src`

Fai una ricerca 📚 e cerca di capire quale è lo scopo di ciascuno degli attributi sopra e in che tag vengono utilizzati, ricordati di recuperare anche le fonti ⛲ delle tue informazioni (ti consiglio [MDN Web Docs](https://developer.mozilla.org/))

## Dizionario

**Attributo**

**`class`**

**HTML Semantico**

**`id`**

**`style`**

**Tag**