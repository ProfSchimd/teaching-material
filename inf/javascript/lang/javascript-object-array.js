console.log('Gli array nel linguaggio Javascript');
let array = [1, 2, 3];
console.log(array);
console.log(array.length);
console.log(typeof array);

const misc = [0, '0', 'Zero', false, undefined, [], [0]]
console.log(misc);

console.log(`Pos 0 -> ${array[0]}`);
console.log(`Pos 1 -> ${array[1]}`);
console.log(`Pos 2 -> ${array[2]}`);
console.log(`Pos 3 -> ${array[3]}`);

const names = ['Alice', 'Bob', 'Carol', 'Dave', 'Emily'];
console.log('\nfor(... ; ... ; ...)');
for(let i = 0; i < names.length; i++) {
    console.log(names[i]);
}
console.log('\nfor(... of ...)');
for(let name of names) {
    console.log(name);
}
console.log('\nfor(... in ...)');
for (let i in names) {
    console.log(names[i]);
}

console.log(array.at(0));
console.log(array.at(-1));

const stack = [1];
stack.push(2);
stack.push(3);
console.log(stack); // [1, 2, 3]
const removed = stack.pop(); 
console.log(removed); // 3

array = [0, 1, 2, 3, 4, 5, 6];
console.log(array.slice()); // [0, 1,2,...,6]
console.log(array.slice(1,3)); // [1,2]
console.log(array.slice(4)); // [4,5,6]
console.log(array.slice(-2)); // [5,6]
console.log(array.slice(-3,6)); // [4,5]

array = [1, 2, 3, 4, 5, 6];
console.log(array.join(',')); // 1,2,3,...,6
console.log(array.join()); // 123456
console.log(array.join(' -> ')); // 1 -> 2 -> 3 ...

array = [1, 2, 3];
const joined = array.join(','); // joined = '1,2,3'
const split = joined.split(','); // split = ['1', '2', '3']
console.log(split);

array = [1, 2, 3, 4, 5, 6, 7];
const even = array.filter(x => x%2 === 0);
console.log(even); // [2, 4, 6];

const json = `[
    {
        "name": "Alice",
        "age": 42
    },
    {
        "name": "Bob",
        "age": 58,
        "address": {
            "name": "Main Street",
            "number": 12,
            "zip": 12312,
            "state": "CA"
        }
    }
]`

let parsedObj = JSON.parse(json);
console.log(parsedObj);
console.log(JSON.stringify(parsedObj));