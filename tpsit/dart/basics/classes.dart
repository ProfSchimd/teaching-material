class Person {
  String firstName;
  String secondName;
  DateTime? _birthDate;

  
  // Initializing format of constructor
  // uses 'initializing formal parameters'
  Person(this.firstName, this.secondName);
  // Equivalent to the following
  // Person(String fn, String sn) :
  //   firstName = fn,
  //   secondName = sn;
  
  // Named constructor with initializing list
  Person.johnSmith() : firstName = 'John', secondName = 'Smith';
  Person.fromList(List<String> list) : firstName = list[0], secondName = list[1];
  
  String introduce() {
    return 'Hello I\'m $firstName $secondName!';
  }
}

class Student extends Person {
  Student(super.firstName, super.secondName);
}

void main() {
  Person bob = new Person("Bob", "Kennedy");
  Person john = Person.johnSmith();
  Person? alice = Person.fromList(["Alice", "Brown"]);
  
  print(bob.firstName); // Bob
  print(john.secondName); // Smith
  print(alice.toString()); // Instance of 'Person'
  
  print(john.introduce());
}