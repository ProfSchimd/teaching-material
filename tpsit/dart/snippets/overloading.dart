// Dart doesn't support function/method overloading
// We can simulate overloading with optional parameters...
void sayHello([String name = '', String greet = 'Hello', String trailer = '']) {
    print('$greet $name$trailer');
}

// ...even better we can use named parameters
void namedHello({String name = '', String greet = 'Hello', String trailer = ''}) {
  print('$greet $name$trailer');
}

void main() {
  print('Say hello (optional)');
  sayHello();
  sayHello('Alan');
  sayHello('Bob', 'Hi');
  sayHello('John', 'Yo', '!!!');
  print('');
  print('Say hello (named)');
  namedHello();
  namedHello(name: 'Alan', trailer: "!");
  namedHello(name: 'Bob', greet: 'Hi');
  namedHello(name: 'John', greet: 'Yo', trailer: '!!!');
}