import 'dart:math';
// positional
double sum(double a, double b) {
  return a + b;
}
// positional + named
double logF(double x, {double base = e}) {
  return log(x)/log(base);
}
// required named
double foo({required double x}) {
  return x;
}
// arrow function
double product(a, b) => a*b;

void main() {
  print(sum(1.0, 2.22));
  print(logF(e));
  print(logF(4,base: 2));
  print(foo(x: 1.11));
  print(product(pi,pi));
}