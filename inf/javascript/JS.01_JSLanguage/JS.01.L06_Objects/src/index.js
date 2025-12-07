const person = {
    name: "Alice",
    age: 30,
    isStudent: false
};

console.log(person.name);  // Alice
console.log(person.age);   // 30

console.log(person["name"]); // Alice

const prop = "age";
console.log(person[prop]); // 30

person.age = 31;
console.log(person.age); // 31

person.city = "Roma";
console.log(person);

delete person.isStudent;
console.log(person);

const car = {
    brand: "Toyota",
    model: "Yaris",
    engine: {
        cc: 1200,
        fuel: "benzina"
    },
    optional: ["ABS", "Radio", "Bluetooth"]
};

console.log(car.engine.cc);  // 1200
console.log(car.optional[1]);        // Radio

const robot = {
    name: "T-800",
    greet() {
        console.log("Hasta la vista, baby!");
    }
};

robot.greet(); // Hasta la vista, baby!

const persona = {
    name: "Sara",
    age: 27,
    city: "Milano"
};

for (const key in person) {
    console.log(key, person[key]);
}

firstJson = `{
    "name": "Alice",
    "age": 30,
    "hobby": ["read", "swim"],
    "active": true
}`;

invalidJson = `{
    name: "Mario",    
    greet() {},        
    active: true,
}`;

const person2= { name: "Luca", age: 25 };

const json = JSON.stringify(person2);
console.log(json);


const text = `{"name":"Sara","age":22}`;

const obj = JSON.parse(text);
console.log(obj.name); // Sara