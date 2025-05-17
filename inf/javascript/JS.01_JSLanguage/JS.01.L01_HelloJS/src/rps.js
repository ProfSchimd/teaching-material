// Rock-Paper-Scissor
const SYMBOLS = ["📄","✂️", "🪨"];

function winner(p1, p2) {
    if (p1 === p2) {
        return 0;
    }
    if ((p1 === SYMBOLS[0] && p2 === SYMBOLS[2]) || 
        (p1 === SYMBOLS[1] && p2 === SYMBOLS[0]) ||
        (p1 === SYMBOLS[2] && p2 === SYMBOLS[1])) {
        return 1;
    }
    return 2;
}

function endMessage(result, p1, p2) {
    switch(result) {
        case 0:
            return `${p1} ${p2} <span class="draw">That was a draw!</span> ${result}`;
        case 1:
            return `${p1} ${p2} <span class="win">You win!</span> ${result}`;
        case 2:
            return `${p1} ${p2} <span class="loose">You loose!</span> ${result}`;
        default:
            return "";
    }
}

window.addEventListener("load", () => {
    console.log(`Rock-Paper-Scissor ${SYMBOLS.join(" ")}`);
    const rockButton = document.querySelector("#rockButton");
    const goButton = document.querySelector("#goButton");
    rockButton.addEventListener("click", () => {
        const playerChoice = document.querySelector("#playerChoice");
        playerChoice.innerText = SYMBOLS[2];
        goButton.disabled = false;
    });

    const paperButton = document.querySelector("#paperButton");
    paperButton.addEventListener("click", () => {
        const playerChoice = document.querySelector("#playerChoice");
        playerChoice.innerText = SYMBOLS[0];
        goButton.disabled = false;
    });

    const scissorButton = document.querySelector("#scissorButton");
    scissorButton.addEventListener("click", () => {
        const playerChoice = document.querySelector("#playerChoice");
        playerChoice.innerText = SYMBOLS[1];
        goButton.disabled = false;
    });

    
    goButton.addEventListener("click", () => {
        const botChoice = document.querySelector("#botChoice");
        let interval;
        const duration = 100;
        interval = setInterval(() => {
            const randomChoice = SYMBOLS[Math.floor(Math.random()*3)];
            botChoice.textContent = randomChoice;
        }, duration);
        setTimeout(() => {
            clearInterval(interval);
            const randomChoice = SYMBOLS[Math.floor(Math.random()*3)];
            botChoice.innerHTML = randomChoice;
            const resultP = document.querySelector("#resultP");
            const playerChoice = document.querySelector("#playerChoice");
            const theWinner = winner(playerChoice.innerText, botChoice.innerText);
            resultP.innerHTML = endMessage(
                theWinner,
                playerChoice.innerText,
                botChoice.innerText,
            );
            goButton.disabled = false;

        }, 10*duration)
        goButton.disabled = true;
    });

});