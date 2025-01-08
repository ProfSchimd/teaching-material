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
