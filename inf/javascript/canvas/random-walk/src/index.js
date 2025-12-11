const canvas = document.getElementById("canvas");
const ctx = canvas.getContext("2d");

const GRID_SIZE = 20;
const CELL_SIZE = 25;
const CANVAS_SIZE = GRID_SIZE*CELL_SIZE;

canvas.width = CANVAS_SIZE;
canvas.height = CANVAS_SIZE;

// the grid counting how many times the bot visits each cell
// Create an Array of GRID_SIZE null and then mapping each 
// position in an Array of GRID_SIZE 0's
let visitCounts = Array(GRID_SIZE).fill(null).map(a => Array(GRID_SIZE).fill(0));

// position for the bot (starts at the center of the grid)
let botPosition = {
    x: Math.floor(GRID_SIZE/2),
    y: Math.floor(GRID_SIZE/2),
}

// animation state
let isRunning = false;
let animatedId = null; // manage animation timeout
let stepCount = 0;

function drawCell(x, y) {
    const visits = visitCounts[x][y];
    const darkness = Math.min(visits/10, 1); // maximum darkness with 10 or more visits
    const grayValue = Math.floor(255*(1-darkness)); 
    
    ctx.fillStyle = `rgB(${grayValue}, ${grayValue}, ${grayValue})`;
    ctx.fillRect(x*CELL_SIZE, y*CELL_SIZE, CELL_SIZE, CELL_SIZE);
    ctx.strokeStyle = "#ddd";
    ctx.strokeRect(x*CELL_SIZE, y*CELL_SIZE, CELL_SIZE, CELL_SIZE);

}

function drawBot(x, y) {
    const centerX = x * CELL_SIZE + CELL_SIZE / 2;
    const centerY = y * CELL_SIZE + CELL_SIZE / 2;
    const radius = CELL_SIZE / 3;

    ctx.fillStyle = "#FF4444";
    ctx.beginPath();
    ctx.arc(centerX, centerY, radius, 0, 2 * Math.PI); // outer circle
    ctx.fill();

    ctx.fillStyle = "#000";
    ctx.beginPath();
    ctx.arc(centerX, centerY - radius/3, radius/4, 0, 2 * Math.PI); // inner circle
    ctx.fill();
}

function drawGrid() {
    for (let i = 0; i < GRID_SIZE; i++) {
        for (let j = 0; j < GRID_SIZE; j++) {
            drawCell(i,j);
        }
    }

    drawBot(botPosition.x, botPosition.y);
}

function moveBot() {
    const moves = [
        { dx: 0, dy: -1 }, // up
        { dx: 0, dy: 1  }, // down
        { dx: -1, dy: 0 }, // left
        { dx: 1, dy: 0  }, // right
    ];

    const randomMove = moves[Math.floor(Math.random()*moves.length)];

    let newX = botPosition.x + randomMove.dx;
    let newY = botPosition.y + randomMove.dy;
    // keep bot within board, wrapping around edges
    newX = (newX + GRID_SIZE) % GRID_SIZE;
    newY = (newY + GRID_SIZE) % GRID_SIZE;

    botPosition.x = newX;
    botPosition.y = newY;

    visitCounts[newX][newY]++;
    stepCount++;
}

function updateStats() {
    document.getElementById("stepCount").textContent = stepCount;

    let uniqueCount = 0;
    for (let i = 0; i < GRID_SIZE; i++) {
        for(let j = 0; j <GRID_SIZE; j++) {
            if (visitCounts[i][j] > 0) {
                uniqueCount++;
            }
        }
    }

    document.getElementById("cellCount").textContent = uniqueCount;
}

function animate() {
    if (!isRunning) {
        return;
    }

    moveBot();
    updateStats();
    drawGrid();

    animatedId = setTimeout(() => {
        requestAnimationFrame(animate);
    }, 100)
}

function start() {
    if (!isRunning) {
        isRunning = true;
        animate();
    }
}

function pause() {
    isRunning = false;
    if(animatedId) {
        clearTimeout(animatedId);
    }
}

function reset() {
    pause();
    
    // Reset visit counts
    visitCounts = Array(GRID_SIZE).fill(null).map(() => Array(GRID_SIZE).fill(0));
    
    botPosition = {
        x: Math.floor(GRID_SIZE / 2),
        y: Math.floor(GRID_SIZE / 2)
    };
    
    visitCounts[botPosition.y][botPosition.x] = 1;

    stepCount = 0;
    
    drawGrid();
}

document.getElementById("startBtn").addEventListener('click', start);
document.getElementById("pauseBtn").addEventListener('click', pause);
document.getElementById("resetBtn").addEventListener('click', reset);

reset();