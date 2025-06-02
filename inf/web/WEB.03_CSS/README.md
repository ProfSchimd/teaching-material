# CSS e selettori (`WEB.03`)

Questa lezione introduce in modo più approfondito i fogli di stile CSS, il loro funzionamento e, soprattutto, i principali selettori. 

Questa lezione può essere proficuamente svolta all'interno di un modulo in cui si studiano le strutture dati ad albero. Infatti accedere agli elementi del DOM utilizzando i selettori CSS richiede una buona conoscenza della terminologia legata agli alberi (nodi, figli, discendenti, fratelli, ...).

## Selettori CSS

Selettori di base
- `*`
- *type* selezioni elementi per tipo: `p { }` seleziona tutti i `<p>`
- *class* selezioni elementi per classe `.important { }` selezioni tutti gli elementi `<... class="important">`
- *id* seleziona elementi per id `#title { }` seleziona *tutti* gli elementi con `<... id="title">`

Combinare selettori
- *Discendente* `A B`
- *Figlio diretto* `A > B`
- *Fratello successivo* `A ~ B`
- *Fratello immediatamente successivo* `A + B`

Selezione per attributo
- `A[attr='val']` seleziona tutti gli elementi `<... attr='val'>`