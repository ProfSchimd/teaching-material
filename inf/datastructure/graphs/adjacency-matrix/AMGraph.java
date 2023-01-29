import java.util.ArrayList;

public class AMGraph implements IGraph {

    private static final int INITIAL_MATRIX = 8;
    private ArrayList<GraphNode> nodes;
    private int[][] matrix;

    public AMGraph() {
        matrix = new int[INITIAL_MATRIX][INITIAL_MATRIX];
        nodes = new ArrayList<GraphNode>();
    }

    @Override
    public int size() {
        return nodes.size();
    }

    @Override
    public boolean isEmpty() {        
        return nodes.isEmpty();
    }

    @Override
    public GraphNode[] nodes() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public void add(GraphNode node) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public GraphNode find(Object key) {
        for (GraphNode node : nodes) {
            if(key.equals(node.value)) {
                return node;
            }
        }
        return null;
    }

    public String matrixToString() {
        String str = "";
        int n = nodes.size();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                str += matrix[i][j] + " ";
            }
            str += "\n";
        }
        return str;
    }
    
}
