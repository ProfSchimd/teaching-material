# Regole CSS e selettori di base (`WEB.03.L01`)
Ciao, sono Cas S. Stewart, solo Cas per gli amici. In questa parte del tuo viaggio ti presento una delle cose più utili e interessanti della programmazione web: i *fogli di stile* meglio noti come **CSS** (*Cascading Style Sheets*). Imparare i CSS ti permette di trasformare una pagina semplice in un sito accattivante e moderno. Prima di arrivare ad animazioni spettacolari, iniziamo dalle basi. 🎆

## Fogli di stile 🖌️
HTML è uno standard per descrivere la struttura del documento, ma lo *stile* (font, colore, background, ...) non è parte di HTML. Nel tempo sono state proposte molte soluzioni che hanno permesso di dare uno stile ad una pagina HTML, il modo corretto di farlo oggi è attraverso i *fogli di stile*, meglio noti come *Cascading Style Sheet, CSS*. 

Ci sono tre modi per aggiungere stile ad una pagina HTML.
1. Definire lo stile per ciascun elemento utilizzando l'attributo `style="..."`.
2. Definire un foglio di stile *inline* all'interno del documento con il tag `<style>`.
3. Includere un foglio di stile esterno all'interno del documento.

La prima soluzione è da scartare a meno che non si tratti di una semplicissima pagina singola. Il problema principale della soluzione 1. è che ogni elemento va gestito da solo e non è possibile riutilizzare lo stesso stile senza "copia-incolla".

La soluzione con foglio di stile *inline* permette una maggiore flessibilità, ma è consigliabile solo per singole pagine quando le *regole* che definiscono lo stile non sono molte. Questa soluzione, infatti, oltre a appesantire l’HTML con regole di stile non permette di usare lo stesso stile su pagine diverse senza fare copia-incolla.

La modalità raccomandata per aggiungere un foglio di stile ad un documento HTML è crearlo in un file apposito, normalmente con estensione `css` e includerlo in tutte le pagine in cui si vuole applicare lo stile.

### Definizione degli stili
In CSS il modo in cui si definisce lo stile è attraverso delle regole. Per comodità le regole vengono spesso chiamate stile. Prima di assegnare uno stile, dobbiamo indicare a a quale elemento del DOM applicare questa regola, questo avviene tramite un **selettore**. Ovviamente, quando lo stile è definito direttamente negli elementi (modalità 1. descritta sopra), il selettore non è necessario in quanto lo stile verrà applicato solo all'elemento che stiamo considerando
```html
<span style="color: blue">Il colore blu sarà assegnato a questo elemento <code>span</code></span>, questo testo avrà il colore definito in precedenza.
```

### Sintassi generale
Per applicare lo stile ad uno o più elementi, si definiscono regole all'interno di un blocco che viene preceduto dal selettore
```css
selettore {
    regola1;
    regola2;
    ...
}
```
Ogni regola è composta da `property: value;`, notare che la regola termina con un punto e virgola `;`. Ecco un esempio pratico.
```css
code {
    background-color: lightgray;
    padding: 4px 3px;
    border-radius: 5px;
}
```
Questo codice CSS applica a tutti gli elementi `<code>` uno stile che comprende tre regole:
- sfondo di colore `lightgray`,
- spazio di riempimento (*padding*) 4 pixel in verticale e 3 pixel in orizzontale e
- bordi arrotondati (con raggio di 5 pixel).

> [!NOTE]
> Il numero di proprietà che sono definite nello standard CSS è estremamente ampio ed è impossibile affrontarlo in poche lezioni. La documentazione MDN comprende anche un [indice delle proprietà](https://developer.mozilla.org/en-US/docs/Web/CSS/Properties), ma il modo migliore per familiarizzare è seguire lezioni, tutorial, guide, ... e, soprattutto, creare i propri progetti.

## Selettori di base 👉
Ciao, sono sempre Cas e qui sotto ti mostro i principali selettori che si usano in CSS. Lo standard attuale prevede decine forse centinaia di selettori, ma ti consiglio di partire con quelli facili, ci rivedremo quando sarai pronto per un upgrade 🆙.

### Selettore per elemento
Il selettore per elemento (*type selector*) permette di **selezionare tutti gli elementi del DOM con un dato tipo**. Ad esempio posso scegliere tutti gli elementi *anchor* e farli diventare viola con sfondo rosa.
```css
a {
    color: purple;
    background-color: pink;
}
```

> [!IMPORTANT]
> Una volta definito uno stile per `<a>`, tutti gli elementi di questo tipo avranno lo stesso stile, **a meno che altre regole non sovrascrivano questo comportamento**.


### Selettore per id
Il selettore per id permette di **selezionare ogni elemento con un determinato valore dell'attributo id**. Per indicare il selettore si utilizza un *hash* `#` prima della stringa identificativo. Ad esempio il seguente elemento `<a id="best-link">...</a>` può essere selezionato nel seguente modo

```css
#best-link {
    font-size: 2rem;
    color: red;
    padding: 5px;
}
```

> [!WARNING]
> I browser non effettuano nessun controllo sull'univocità di un `id`. Quindi è possibile che ci siano più elementi con lo stesso valore di `id` (per un errore o di proposito).

### Selettore per classe
Il selettore per *classe* permette di scegliere tutti gli elementi che hanno una certa classe (dichiarata nell'attributo `class` del tag). Per indicare tale selettore si inserisce un punto `.` prima del nome della classe (senza spazi). Ecco due esempi di utilizzo del selettore di classe (uno per la classe `.blue` e uno per la classe `.caps`).

```css
.blue {
    color: blue;
}

.caps-thin {
    font-weight: 200;
    font-variant: small-caps;
    letter-spacing: 2px;
}
```

> [!NOTE]
> Nel secondo dei due esempi, le regole riguardano il font:
> - `font-weight` determina la grossezza del tratto (i font normali hanno weight 400),
> - `font-variant` determina la variante del font, in questo usa il maiuscoletto,
> - `letter-spacing` determina lo spazio aggiuntivo tra le lettere.
> 
> Sperimenta anche valori negativi per `letter-spacing` e prova anche la proprietà `word-spacing`.

## Pseudo classi 🔗
È possibile utilizzare delle *pseudo classi* che servono ad indicare lo *stato* in modo da poter selezionare uno o più elementi che si trovano in uno stato specifico.

### `:hover`
La pseudo classe `:hover` indica che all'interno dell'elemento è posizionato il cursore (mouse). Questa pseudo classe è molto utile, ad esempio, per i link.

```css
a:hover {
    font-weight: 800;
}
```

La pseudo classe `:hover` può essere utilizzata anche con altri tag.

```css
h1:hover {
    background-color: cyan;
}
```

> [!IMPORTANT] 
> Quando navighiamo una pagina web, siamo abituati a certi comportamenti standard. Ad esempio se un testo diventa sottolineato quando ci passiamo sopra con il cursore, ci aspettiamo che quello sia un link (che dovrebbe anche avere un colore diverso rispetto al testo). Per non creare situazioni inattese e fastidiose durante la navigazione è sempre bene mantenere certi comportamenti inalterati.

### `:visited`
La pseudo classe `:visited` si applica ai link e descrive la situazione in cui la pagina indicata nell'attributo `href` è già stata visitata in precedenza.

## Specificità delle regole
Abbiamo visto vari tipi di selettori ed come si utilizzano in CSS. Guarda questo esempio che comprende i tre tipi principali di selettori che abbiamo visto.

```css
/* Selettori per tipo */
body {
    
    color: blue;
}
p {
    color: gray;
}
/* Selettore per classe */
.alert {
    color: red;
}
/* Selettore per id */
#message {
    color: green;
}
```

Applichiamo il foglio di stile sopra alla seguente pagina HTML, cosa succede?

```html
<html>
<head></head>
<body>
    <h1>...</h1>
    ...
    <p>...</p>
    <p class="alert">...</p>
    <p id="message" class="red">....</p>
</body>
</html>
```

Da questo esperimento si vede che ci sono alcune regole che vengono ignorate a favore di altre, ma quali? Ogni tipo di selettore ha una sua **specificità** o priorità, se più regole sono applicate ad uno stesso elemento, vince quella con la priorità più alta. In altre parole, se una regola supera (ha maggiore priorità di) un'altra, la prima vince ed imposterà il valore della proprietà. Per i selettori che abbiamo visto sopra, questo è il livello `>` significa *maggiore priorità*.
```
:pseudo-class > id > class > element > ereditato
```

Il risultato nell'esempio sopra è 
- Il testo non dentro `<p>` *eredita* il valore già impostato (il blu del `body`, vedi sotto);
- `<p>` senza nulla è soggetto alla regola `p { ... }` che quindi sarà grigio;
- `<p class="alert">` sarà mostrato in rosso per la regola `.alert { ... }`;
- infine `<p id="message" class="alert">` sarà mostrato in verde poiché, anche se la classe contiene `alert`, il selettore `#message` basato su id ha maggiore specificità.

> [!NOTE]
> Il codice CSS sopra contiene dei *commenti* che si inseriscono tra `/*` e `*/`, i commenti possono essere multi linea (come C++ e Java).

## Ereditarietà delle regole
Avrai notato che nel CSS sopra abbiamo assegnato uno stile al tag `<body>`, ma `body` non è un elemento visibile, cosa succede? Dato che `body` è antenato di tutti gli elementi del DOM, lo stile che viene impostato in `body` viene ereditato da tutti i suoi discendenti, a meno che non venga ridefinito.

Questo fatto di ereditarietà dello stile non vale solo per body, ma vale per tutti gli elementi. La regola da ricordare è semplice **uno stile impostato su un dato elemento viene ereditato da tutti gli elementi che sono suoi discendenti, a meno che non venga ri-definito**. Tuttavia le cose sono un po' più complicate di così poiché *non tutte le proprietà sono ereditate*. L'esempio sopra mostra come la proprietà `color` sia ereditata, ma altre come `margin` non lo sono. Per sapere quali proprietà sono ereditate e quali no, è necessario consultare la documentazione.

> [!TIP]
> In generale, le proprietà legate al testo (come `color`, `font-family`, f`ont-size`) si ereditano, mentre quelle legate al layout e al box model (come `margin`, `padding`, `border`, `background`) non si ereditano.