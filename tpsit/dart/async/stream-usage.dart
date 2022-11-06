Future<int> sumStream(Stream<int> stream) async {
  var sum = 0;
  await for (final value in stream) {
    sum += value;
  }
  return sum;
}

void main() async {
  Stream<int> stream = Stream.empty();
  int sum = await sumStream(stream);
  print(sum);
}
