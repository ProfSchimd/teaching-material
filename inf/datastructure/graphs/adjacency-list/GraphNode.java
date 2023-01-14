import java.util.ArrayList;

public class GraphNode {
    public Object value;
    public ArrayList<GraphNode> neighbors;

    public static GraphNode fromValue(Object value) {
        GraphNode node = new GraphNode();
        node.value = value;
        return node;
    } 
}