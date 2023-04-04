"use strict";

class GraphNode {
  constructor(v) {
    this.value = v;
    this.neighbors = [];
  }

  addNeighbor(n) {
    this.neighbors.push(n);
  }

  toString() {
    return `GraphNode val=${this.value} neighbors=${this.neighbors.map(v => v.value)}`;
  }
}

class Graph {
  constructor() {
    this.nodes = [];
  }

  addNode(node) {
    this.nodes.push(node);
  }

  toString() {
    return `Graph\n  ${this.nodes.join('\n  ')}`
  }
}

const graph = new Graph();
const nodes = [1,2,3].map(v => new GraphNode(v));
nodes[0].addNeighbor(nodes[1]);
nodes[1].addNeighbor(nodes[0]);
nodes[0].addNeighbor(nodes[2]);
nodes[2].addNeighbor(nodes[0]);
nodes[2].addNeighbor(nodes[2]);
for (let n of nodes) {
  graph.addNode(n);
}
console.log(graph.toString());
