# Object Oriented Programming (OOP)

La **programmazione orientata agli oggetti** (**Object Oriented Programming - OOP**) più spesso chiamata *programmazione ad oggetti* è uno dei *modelli* (o *paradigmi*) di programmazione più utilizzati. L'idea è di organizzare il codice sulla base del concetto di **oggetto** che un'entità del mondo che può contenere dati e/o eseguire operazioni.

## Concetti base di OOP

### Classe e istanza

La **classe** è una "descrizione" delle caratteristiche di un oggetto ad esempio la classe `Person` descrive le caratteristiche di una generica **istanza** di persona.

```java
public class Person {
  private String firstName;
  private String lastName;
  // Consider alternative representation: YYYYMMGG
  private String birthDate; // DD/MM/YYYY

  public int age(String today) {
    // Exercise: returns age withr espect to `today`
  } 
}
```

### Campi, metodi e visibilità

Un **campo** è una *variabile* associata all'istanza e definita nella classe. Un **metodo** è una *procedura* o una *funzione* che può essere invocato su un istanza.

Campi e metodi possono avere visibilità `public` o `private`, nel primo caso è possibile utilizzarli in qualsiasi parte del codice, nel secondo caso è possibile accedervi solo all'interno della classe in cui sono definiti che è quindi lo **scope** del campo o metodo. 

Ad esempio, nel codice sopra `firstName` è un campo con visibilità `private` mentre `age()` è un metodo con visibilità `public`.

### Il metodo *costruttore*

Il **costruttore** è un metodo "speciale" che ha lo stesso nome della classe (anche maiscuole e minuscole), non ha un tipo restituito e che viene invocato all'atto della creazione dell'oggetto.

```
Person john = new Person(); // qui si chiama il costruttore
```

## Campi e metodi `static`
Quando un campo o un metodo viene indicato coome `static`, allora diventa un campo o metodo *di classe* anziché di istanza. Ovviamente, un metodo di classe **non** può accedere a metodi o campi di istanza.

