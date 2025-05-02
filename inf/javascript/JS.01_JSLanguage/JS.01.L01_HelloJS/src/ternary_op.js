const d = new Date();
let hour = d.getHours();
let color = "black"; 
if (hour < 12) {
    color = "white";
}
console.log(color);

const col = hour > 12 ? "black" : "white";
console.log(col);