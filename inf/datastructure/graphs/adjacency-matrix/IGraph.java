public interface IGraph {
    int size();
    boolean isEmpty();
    GraphNode[] nodes();
    void add(GraphNode node);
    GraphNode find(Object key);
}
