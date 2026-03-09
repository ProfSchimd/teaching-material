import { Vec3 } from "./vector.js";
"use strict";

class Momentum {
    constructor(px, py, pz) {
        this.px = px;
        this.py = py;
        this.pz = pz;
    }
}

class State {
    constructor(position, momentum) {
        this.position = position;
        this.momentum = momentum;
    }
}

class Shape {
    constructor(color, fill) {
        this.color = color;
        this.fill = fill;
        this.velocity = {vx: 0, vy: 0}
    }
    get type() {
        return undefined;
    }
}

class Circle extends Shape {
    constructor(center, radius, color, fill) {
        super(color, fill);
        this.center = center;
        this.radius = radius;
    }

    get type() {
        return "circle";
    }
}

class Rectangle extends Shape {
    constructor(top, width, height, color, fill) {
        super(color, fill);
        this.top = top;
        this.width = width;
        this.height = height;
        this.color = color;
    }

    get type() {
        return "rect";
    }
}

const objects = [
    new Circle(new Vec3(100,100,0), 20, "#FF0000", "#FFDDDD"),
    new Circle(new Vec3(300,100,0), 40, "#00FF00"),
    new Circle(new Vec3(200,300,0), 50, "#0000FF"),
    new Rectangle(new Vec3(10,10,0), 100, 50, "black", "#EEE"),
]

function clear(ctx, width, height) {
    ctx.clearRect(0, 0, width, height);
}

function drawCircle(ctx, x, y, r, color, fill) {
    ctx.beginPath();
    ctx.arc(x, y, r, 0, 2 * Math.PI);
    if (color) {
        ctx.strokeStyle = color;
        ctx.stroke();
    }
    if (fill) {
        ctx.fillStyle = fill;
        ctx.fill();
    }
}

function drawRectangle(ctx, x, y, w, h, color, fill) {
    ctx.beginPath();
    ctx.rect(x, y, w, h);
    if (color) {
        ctx.strokeStyle = color;
        ctx.stroke();
    }
    if (fill) {
        ctx.fillStyle = fill;
        ctx.fill();
    }
}


function main() {
    let simulating = true;
    document.querySelector("#toggleSim").addEventListener("click", (e) => {
        simulating =!simulating;
        e.target.value =  simulating ? "⏹" : "▶";
    })
    console.log("Hello Bouncing Ball");
    const canvas = document.querySelector("#canvas");
    const ctx = canvas.getContext("2d");
    const height = canvas.height;
    const width = canvas.width;
    let start = undefined;
    const render = (timestamp) => {
        if (start === undefined) {
            start = timestamp;
        }
        const elapsed = timestamp - start;
        const dt = 0.1; // JUST FOR EXAMPLE
        clear(ctx, width, height);
        objects.forEach( (obj) => {
            switch(obj.type) {
                case "circle":
                    drawCircle(ctx, obj.center.x, obj.center.y, obj.radius, obj.color, obj.fill);
                    const ds = 0
                    obj.center.x += (Math.random()*ds - ds/2);
                    obj.center.y += (Math.random()*ds - ds/2);
                    break;
                case "rect":
                    drawRectangle(ctx, obj.top.x, obj.top.y, obj.width, obj.height, obj.color, obj.fill);
                    if (simulating) {
                        obj.top.x += obj.velocity.vx*dt;
                        obj.top.y += obj.velocity.vy*dt;
                        obj.velocity.vy += 9.81*dt; // freely falling body
                        if (obj.top.y > canvas.height) {
                            obj.top.y = -2*obj.height;
                            obj.velocity.vy = 1; 
                        }
                        if (obj.top.x > canvas.width) {
                            obj.top.x = -2*obj.width;
                        }
                    }
                    break;  
                default:
                    break;
            }
        })
        requestAnimationFrame(render);

    }
    render();

}

window.addEventListener("load", main);