// After 'load' event everything is ready (including any
// downloaded resources, e.g., images, styles, scripts, ...)
window.addEventListener("load", main);

function main() {
    console.log("Document is now ready to be processed!");
    const el = document.querySelector("#click");
    
    el.addEventListener("click", clicked);
}

function clicked() {
    console.log("Clicked!");
    const magic = document.querySelector("#magicText");
    magic.classList.toggle("visible");
}