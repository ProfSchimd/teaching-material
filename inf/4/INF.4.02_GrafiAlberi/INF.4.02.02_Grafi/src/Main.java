public class Main {
    public static void main(String[] args) {
        GraphNode<String> n1 = new GraphNode<String>("Alice");
        GraphNode<String> n2 = new GraphNode<String>("Bob");
        n2.addNeighbor(n1);
        n1.addNeighbor(n2);

        Graph<String> g = new Graph<String>();
        g.add(n1);
        g.add(n2);

        System.out.println(g);

    }
}
