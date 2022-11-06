Stream<int> timedCounter(Duration interval, [int? maxCount]) async* {
  int i = 0;
  while (true) {
    await Future.delayed(interval);
    yield i++;
    if (i == maxCount) break;
  }
}

Stream<int> squaredCounter(Stream<int> counter) async* {
  await for (final i in counter) {
    yield i*i;
  }
}

void main() async {
  // Utilizzo di async*
  Stream<int> stream = timedCounter(Duration(seconds: 1), 10);
  await for (final i in stream) {
    print('$i seconds');
  }

  // trasformazione 'manuale'
  stream = timedCounter(Duration(seconds: 1), 10);
  Stream<int> squaredStream = squaredCounter(stream);
  await for (final i in squaredStream) {
    print(i);
  }

  // trasformazione con le funzioni della classe Stream
  // map
  stream = timedCounter(Duration(milliseconds: 200), 5);
  Stream<int> transformed = stream.map((i) => i*i);
  await for (final i in transformed) {
    print(i); // 0, 1, 4, 16
  }

  // take
  stream = timedCounter(Duration(milliseconds: 200), 5);
  transformed = stream.take(3);
  await for (final i in transformed) {
    print(i); // 0, 1, 2
  }

  // skip
  stream = timedCounter(Duration(milliseconds: 200), 5);
  transformed = stream.skip(3);
  await for (final i in transformed) {
    print(i); // 3, 4
  }

  // where
  stream = timedCounter(Duration(milliseconds: 200), 5);
  transformed = stream.where((i) => (i % 2 == 0)); // numeri pari
  await for (final i in transformed) {
    print(i); // 0, 2, 4
  }

  // equivalentemente (usando forEach)
  stream = timedCounter(Duration(milliseconds: 200), 6);
  stream.where((i) => (i % 2 == 0)).forEach(print);
}
