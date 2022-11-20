public class ListPosition implements IListPosition {

    private Object content;
    private IListPosition successor;
    private IListPosition predecessor;

    public ListPosition(Object c, IListPosition n, IListPosition p) {
        content = c;
        successor = n;
        predecessor = p;
    }

    @Override
    public Object value() {
        return this.content;
    }

    @Override
    public IListPosition next() {
        return successor;
    }

    @Override    
    public void setNext(IListPosition newNext) {
        successor = newNext;
    }

    @Override
    public IListPosition prev() {
        return predecessor;
    }

    @Override
    public void setPrev(IListPosition newPrev) {
        predecessor = newPrev;
    }
    
}
