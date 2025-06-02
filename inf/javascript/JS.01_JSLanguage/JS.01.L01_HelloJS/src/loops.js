const n = 10;
for (let i = 0; i < n; i++) {
    console.log(`${i} squared is ${i*i} while cubed is ${i*i*i}`);
}

let j = 0;
while(j < n) {
    console.log(`The square root of ${j} is ${Math.sqrt(j)}`);
    j++;
}

let x = -10;
do {
    console.log(`10^${x} is ${Math.pow(10,x)}`);
    x++;
} while(x <= 0);