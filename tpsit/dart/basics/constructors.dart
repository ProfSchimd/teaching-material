class Person {
  String firstName;
  String secondName;
  // Usual constructor syntax
  Persona(List<String> list) {
    firstName = list[0];
    secondName = list[1];
  }
  // Initializing format of constructor
  Person(this.firstName, this.secondName);
  // Named constructor with pre-body initialization
  Person.johnSmith() : firstName = 'John', secondName = 'Smith';
  
  @override
  String toString() {
    return '$firstName $secondName';
  }
}

void main() {
  var p1 = Person.johnSmith();
  var p2 = Person('Mario', 'Rossi');
  var p3 = Person(['Alan', 'Turing']);
  print(p1);
  print(p2);
  print(p3);
}
