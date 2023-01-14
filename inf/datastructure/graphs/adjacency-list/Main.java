public class Main {
    private static IGraph createSocialGraph() {
        ALGraph graph = new ALGraph();
        GraphNode alice = GraphNode.fromValue("Alice");
        GraphNode bob = GraphNode.fromValue("Bob");
        GraphNode carol = GraphNode.fromValue("Carol");
        GraphNode david = GraphNode.fromValue("David");
        GraphNode eric = GraphNode.fromValue("Eric");
        GraphNode fred = GraphNode.fromValue("Fred");
        GraphNode zoe = GraphNode.fromValue("Zoe");

        alice.neighbors.add(bob);
        alice.neighbors.add(carol);
        alice.neighbors.add(david);
        alice.neighbors.add(fred);

        bob.neighbors.add(alice);
        bob.neighbors.add(fred);

        carol.neighbors.add(alice);
        carol.neighbors.add(david);
        carol.neighbors.add(eric);

        david.neighbors.add(alice);
        david.neighbors.add(carol);
        david.neighbors.add(fred);

        eric.neighbors.add(carol);
        eric.neighbors.add(fred);

        fred.neighbors.add(alice);
        fred.neighbors.add(bob);
        fred.neighbors.add(david);
        fred.neighbors.add(eric);

        graph.add(alice);
        graph.add(bob);
        graph.add(carol);
        graph.add(david);
        graph.add(fred);
        graph.add(eric);
        graph.add(zoe);
        
        return graph;
    }
    public static void main(String[] args) {
        IGraph graph = createSocialGraph();
    }
}