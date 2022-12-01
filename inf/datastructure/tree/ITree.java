public interface ITree {
    ITreeNode getRoot();
    void setRoot(ITreeNode root);
    ITreeNode[] getNodes();
    ITreeNode[] getLeaves();
    ITreeNode[] getInternalNodes();

    int size();
    boolean isEmpty();

    ITreeNode search(Object o);
}
