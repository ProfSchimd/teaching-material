# Random Walk in Javascript

Simulatore di *random walk* (*passeggiata casuale*) utilizzando l'elemento `<canvas>` e vanilla Javascript.

Utilizzo didattico:
- Esercitazione su Javascript e `<canvas>`
- Esercitazione di preparazione di una scacchiera di gioco
- Teoria della probabilità (processi stocastici)

L'attività è stata predisposta utilizzando Claude AI, [qui](./tutorial.md) è possibile trovare l'intero tutorial predisposto da Claude.

## Argomenti oggetto dell'attività

- HTML e CSS
    - `<canvas>`, `<div>`
    - `<button>`
    - selettori CSS di base: id, classe
    - combinatori CSS di base
    - stili CSS di base
    - CSS Flexbox
    - Use of `defer` in `<script>`
- Javascript
    - `getElementById`
    - `Array()`
    - `Array.fill()`
    - `Array.map()`
    - `Math.floor()`
    - `Math.min()`
    - `Math.random()`
    - `setTimeout()`
    - `requestAnimationFrame()`
    - `addEventListener()`
    - `innerText`
- Canvas
    - `getContext()`
    - `fillStyle`
    - `fillRect()`
    - `strokeStyle`
    - `strokeRect()`
    - `beginPath()`
    - `arc()`
    - `fill()`

Argomenti di *problem solving* e pensiero algoritmico
- Convertire contatore in sfumatura e poi in colore RGB
- Disegnare una griglia di gioco sulla base dello stato del gioco
- Aggiornare lo stato del gioco
- Rendering con una routine di disegno
- Generare numeri casuali interi utilizzando generatore di double casuali in [0,1)
- Modulo arithmetic for wrap around