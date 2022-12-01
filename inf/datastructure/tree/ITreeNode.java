public interface ITreeNode {
    Object value();
    ITreeNode parent();
    ITreeNode[] children();

    void setValue(Object val);
    void setParent(ITreeNode parent);
    void addChild(ITreeNode child);
    void removeChild(ITreeNode child);

    boolean isRoot();
    boolean isLeaf();
    boolean isInternal();
}