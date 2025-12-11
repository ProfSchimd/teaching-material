# Building a Random Walk Simulator: A Step-by-Step Tutorial

I'll guide you through creating an interactive random walk simulator. We'll build this incrementally so you understand each component.

## Step 1: Understanding the Core Concepts

Before we code, let's understand what we're building:
- **Grid**: An n×n grid of cells
- **Random Walk**: The bot moves randomly (up, down, left, right)
- **Trail**: Cells get darker each time they're visited
- **Visual Feedback**: We'll use Canvas API for smooth rendering

## Step 2: HTML Structure

Let's start with the basic HTML skeleton:

```html
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Random Walk Simulator</title>
</head>
<body>
    <canvas id="gridCanvas"></canvas>
    <div class="controls">
        <button id="startBtn">Start</button>
        <button id="pauseBtn">Pause</button>
        <button id="resetBtn">Reset</button>
    </div>
</body>
</html>
```

**What's happening here:**
- `<canvas>` element: This is where we'll draw our grid
- Control buttons: To interact with the simulation

## Step 3: CSS Styling

```css
body {
    display: flex;
    flex-direction: column;
    align-items: center;
    padding: 20px;
    font-family: Arial, sans-serif;
}

canvas {
    border: 2px solid #333;
    margin-bottom: 20px;
}

.controls button {
    margin: 0 5px;
    padding: 10px 20px;
    font-size: 16px;
}
```

## Step 4: JavaScript - Setting Up Constants and Variables

```javascript
const canvas = document.getElementById('gridCanvas');
const ctx = canvas.getContext('2d');

// Grid configuration
const GRID_SIZE = 20; // 20x20 grid
const CELL_SIZE = 25; // Each cell is 25x25 pixels
const CANVAS_SIZE = GRID_SIZE * CELL_SIZE;

// Set canvas dimensions
canvas.width = CANVAS_SIZE;
canvas.height = CANVAS_SIZE;
```

**Key concepts:**
- `getContext('2d')`: Gets the 2D drawing context for the canvas
- We calculate canvas size based on grid dimensions

## Step 5: Data Structures

```javascript
// Grid to track visit counts
let visitCounts = Array(GRID_SIZE).fill(null).map(() => Array(GRID_SIZE).fill(0));

// Bot position
let botPosition = {
    x: Math.floor(GRID_SIZE / 2),
    y: Math.floor(GRID_SIZE / 2)
};

// Simulation state
let isRunning = false;
let animationId = null;
```

**JavaScript concepts explained:**

- **`Array(GRID_SIZE).fill(null).map(...)`**: 
  - `Array(GRID_SIZE)`: Creates an array with GRID_SIZE empty slots
  - `.fill(null)`: Fills all slots with null (necessary for map to work)
  - `.map(() => Array(GRID_SIZE).fill(0))`: For each element, creates a new array filled with zeros
  - Result: A 2D array (grid) initialized to all zeros

- **Object literal `{ x: ..., y: ... }`**: A JavaScript object to store coordinates

## Step 6: Drawing Functions

```javascript
// Draw a single cell
function drawCell(x, y) {
    const visits = visitCounts[y][x];
    
    // Calculate darkness based on visits (max out at 10 visits)
    const darkness = Math.min(visits / 10, 1);
    const grayValue = Math.floor(255 * (1 - darkness));
    
    ctx.fillStyle = `rgb(${grayValue}, ${grayValue}, ${grayValue})`;
    ctx.fillRect(x * CELL_SIZE, y * CELL_SIZE, CELL_SIZE, CELL_SIZE);
    
    // Draw grid lines
    ctx.strokeStyle = '#ddd';
    ctx.strokeRect(x * CELL_SIZE, y * CELL_SIZE, CELL_SIZE, CELL_SIZE);
}

// Draw the bot (using a simple circle as placeholder)
function drawBot(x, y) {
    const centerX = x * CELL_SIZE + CELL_SIZE / 2;
    const centerY = y * CELL_SIZE + CELL_SIZE / 2;
    const radius = CELL_SIZE / 3;
    
    ctx.fillStyle = '#FF4444';
    ctx.beginPath();
    ctx.arc(centerX, centerY, radius, 0, Math.PI * 2);
    ctx.fill();
    
    // Add a simple "eye" to show direction
    ctx.fillStyle = '#000';
    ctx.beginPath();
    ctx.arc(centerX, centerY - radius/3, radius/4, 0, Math.PI * 2);
    ctx.fill();
}
```

**Key concepts:**
- **`Math.min(visits / 10, 1)`**: Ensures darkness doesn't exceed 1 (100%)
- **`Math.floor()`**: Rounds down to get an integer value for RGB
- **Template literals**: ``rgb(${grayValue}, ${grayValue}, ${grayValue})`` - allows embedding variables in strings
- **`ctx.arc()`**: Draws a circle (x, y, radius, startAngle, endAngle)
- **`Math.PI * 2`**: Full circle in radians (360 degrees)

## Step 7: Drawing the Complete Grid

```javascript
function drawGrid() {
    // Draw all cells
    for (let y = 0; y < GRID_SIZE; y++) {
        for (let x = 0; x < GRID_SIZE; x++) {
            drawCell(x, y);
        }
    }
    
    // Draw bot on top
    drawBot(botPosition.x, botPosition.y);
}
```

## Step 8: Random Walk Logic

```javascript
function moveBot() {
    // Define possible moves: up, down, left, right
    const moves = [
        { dx: 0, dy: -1 },  // up
        { dx: 0, dy: 1 },   // down
        { dx: -1, dy: 0 },  // left
        { dx: 1, dy: 0 }    // right
    ];
    
    // Choose a random move
    const randomMove = moves[Math.floor(Math.random() * moves.length)];
    
    // Calculate new position
    let newX = botPosition.x + randomMove.dx;
    let newY = botPosition.y + randomMove.dy;
    
    // Keep bot within bounds (wrap around)
    newX = (newX + GRID_SIZE) % GRID_SIZE;
    newY = (newY + GRID_SIZE) % GRID_SIZE;
    
    // Update position
    botPosition.x = newX;
    botPosition.y = newY;
    
    // Increment visit count
    visitCounts[newY][newX]++;
}
```

**Key concepts:**
- **Array of objects**: `moves` stores all possible directions as {dx, dy} pairs
- **`Math.random()`**: Returns a number between 0 and 1
- **`Math.floor(Math.random() * moves.length)`**: Converts random decimal to integer index (0-3)
- **Modulo operator `%`**: Used for wrapping (if bot goes off edge, appears on opposite side)
- **`(newX + GRID_SIZE) % GRID_SIZE`**: Handles negative wrapping correctly

## Step 9: Animation Loop

```javascript
function animate() {
    if (!isRunning) return;
    
    moveBot();
    drawGrid();
    
    // Continue animation (approximately 10 steps per second)
    animationId = setTimeout(() => {
        requestAnimationFrame(animate);
    }, 100);
}
```

**Key concepts:**
- **`requestAnimationFrame()`**: Browser API for smooth animations
- **`setTimeout()`**: Delays execution, controlling speed of random walk
- **Recursive calling**: `animate()` calls itself to create continuous loop

## Step 10: Control Functions

```javascript
function start() {
    if (!isRunning) {
        isRunning = true;
        animate();
    }
}

function pause() {
    isRunning = false;
    if (animationId) {
        clearTimeout(animationId);
    }
}

function reset() {
    pause();
    
    // Reset visit counts
    visitCounts = Array(GRID_SIZE).fill(null).map(() => Array(GRID_SIZE).fill(0));
    
    // Reset bot to center
    botPosition = {
        x: Math.floor(GRID_SIZE / 2),
        y: Math.floor(GRID_SIZE / 2)
    };
    
    // Mark starting position as visited
    visitCounts[botPosition.y][botPosition.x] = 1;
    
    drawGrid();
}
```

## Step 11: Event Listeners

```javascript
// Attach button handlers
document.getElementById('startBtn').addEventListener('click', start);
document.getElementById('pauseBtn').addEventListener('click', pause);
document.getElementById('resetBtn').addEventListener('click', reset);

// Initial draw
reset();
```

**Key concepts:**
- **`addEventListener()`**: Attaches event handlers to DOM elements
- **Event types**: 'click', 'mouseover', 'keydown', etc.

## Complete Working Code

Let me put it all together as a functional artifact:## Summary of Key JavaScript Concepts Used

1. **Array methods**:
   - `.fill()`: Populates array with a value
   - `.map()`: Creates new array by transforming each element

2. **Math functions**:
   - `Math.random()`: Random number [0, 1)
   - `Math.floor()`: Round down
   - `Math.min()`: Smallest value

3. **Canvas API**:
   - `getContext('2d')`: Get drawing context
   - `fillRect()`: Draw filled rectangle
   - `arc()`: Draw circle
   - `strokeRect()`: Draw rectangle outline

4. **Control flow**:
   - Nested loops for 2D grid iteration
   - Conditional statements for boundaries

5. **Timing**:
   - `setTimeout()`: Delay execution
   - `requestAnimationFrame()`: Smooth animation

You can now modify the grid size, colors, bot appearance, or speed by changing the constants at the top of the JavaScript code!

## Proposed Extension
Add to the web page a *stats* section that displays
- The number of steps (moves) so far performed
- The number of *unique* cells visited

Remember to update these values each time a move is performed and also to reset them when resetting the whole app.

**Hint** The number of uniquely visited cells is the number of non-zero cells in the `visitCounts` matrix.