function preprocess(text) {
    text = text.replaceAll(/[^A-zÀ-ú]+/g, " ").toLowerCase();
    console.log(text.slice(50,300));
    return text;
}

const textUrl = 'https://dmf.unicatt.it/~della/pythoncourse18/commedia.txt'

fetch(textUrl)
    .then(result => result.text())
    .then(text => preprocess(text))
    .catch(error => console.log(error));

