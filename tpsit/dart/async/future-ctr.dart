main() {
  // Usage of the unnamed constructor
  Future(() => print('Unnamed ctr.'));
  // Usage of the delayed constructor
  Future.delayed(
    const Duration(seconds: 2), 
    () => print('Delayed ctr. (2 sec)')
  );
  // Usage of the sync constructor
  Future.sync(() => print('Sync ctr.'));
}