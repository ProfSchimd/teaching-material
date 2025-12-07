import java.util.ArrayList;

public class GraphNode<T> {
    private T content;
    private ArrayList<GraphNode> neighbors;

    public GraphNode(T content) {
        this.content = content;
        this.neighbors = new ArrayList<>();
    }

    public void addNeighbor(GraphNode<T> n) {
        this.neighbors.add(n);
    }

    public ArrayList<GraphNode> getNeighbors() {
        return this.neighbors;
    }

    public T getContent() {
        return this.content;
    }

    public String toString() {
        return this.content.toString() + " (" +  this.neighbors.size() + " neighbors)";
    };
}
