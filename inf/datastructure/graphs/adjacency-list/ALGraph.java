import java.util.ArrayList;

public class ALGraph implements IGraph {

    private ArrayList<GraphNode> nodes;

    @Override
    public int size() {
        return nodes.size();
    }

    @Override
    public boolean isEmpty() {
        return (size() == 0);
    }

    @Override
    public GraphNode[] nodes() {
        GraphNode[] a = new GraphNode[nodes.size()];
        return nodes.toArray(a);
    }

    @Override
    public void add(GraphNode node) {
        nodes.add(node);
    }

    @Override
    public GraphNode find(Object key) {
        for(GraphNode node : nodes) {
            if(node.value.equals(key)) {
                return node;
            }
        }
        return null;
    }

}