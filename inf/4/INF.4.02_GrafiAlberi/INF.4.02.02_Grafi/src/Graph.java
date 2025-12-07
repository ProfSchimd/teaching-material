import java.util.ArrayList;

public class Graph<T> {
    private ArrayList<GraphNode<T>> nodes;

    public Graph() {
        this.nodes = new ArrayList<>();
    }

    public void add(GraphNode<T> node) {
        this.nodes.add(node);
    }

    public String toString() {
        String s = "Nodes: \n";
        for (GraphNode<T> n : this.nodes) {
            s += " " + n.toString() + "\n";
        }
        return s;
    };
}
