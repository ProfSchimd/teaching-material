Future<String> someLongComputation() =>
  Future.delayed(
    const Duration(seconds: 3),
    () => 'Finally the DATA!'
);

main() async {
  print(await someLongComputation());
}