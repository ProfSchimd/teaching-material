import {Graph, GraphNode} from "./graph.js";

function preprocess(text) {
    text = text.replaceAll(/[^A-zÀ-ú]+/g, " ").toLowerCase();
    return text;
}

function tokenizer(text) {
    return text.split(" ");
}

function createWordGraph(tokens) {
    const graph = new Graph();
    let token = tokens[0];
    graph.addNode(new GraphNode(token));
    for (let i = 1; i < tokens.length; i++) {
        const nextToken = tokens[i];
        if (!graph.getNode(nextToken)) {
            // node doesn't exist, add it
            graph.addNode(new GraphNode(nextToken));    
        }
        const nextNode = graph.getNode(nextToken);
        const tokenNode = graph.getNode(token);
        tokenNode.addNeighbor(nextNode);
        token = nextToken;
    }
    return graph;
}

function processData(text) {
    text = preprocess(text);
    const tokens = tokenizer(text);
    const graph = createWordGraph(tokens);
    console.log(text.slice(50,300));
    console.log(tokens.slice(10,30));
    // console.log(graph.nodes.slice(10,30));
    console.log(graph.getNode('vita'));
}

const textUrl = 'https://dmf.unicatt.it/~della/pythoncourse18/commedia.txt'

fetch(textUrl)
    .then(result => result.text())
    .then(text => processData(text))
    .catch(error => console.log(error));

