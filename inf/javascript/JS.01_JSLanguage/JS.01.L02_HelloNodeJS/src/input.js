import readline from 'readline';

// Create interface for reading from stdin
const rl = readline.createInterface({
  input: process.stdin,
  output: process.stdout
});

// Read and echo
rl.question('Enter something: ', (answer) => {
  console.log(`You entered: ${answer}`);
  rl.close();
});