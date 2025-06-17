export class GraphNode {
    constructor(value) {
        this.value = value;
        this.neighbors = new Map();
    }

    addNeighbor(n) {

        if (!this.neighbors.get(n.value)) {
            this.neighbors.set(n.value, {node: n, count: 1});
        } else {
            this.neighbors.get(n.value).count += 1;
        }
        
    }
}

export class Graph {
    constructor() {
        this.nodes = new Map();
    }

    addNode(node) {
        this.nodes.set(node.value, node);
    }

    getNode(value) {
        return this.nodes.get(value);
    }

}