public class ListPosition implements IListPosition {

    private Object content;
    private ListPosition successor;
    private ListPosition predecessor;

    @Override
    public Object value() {
        return this.content;
    }

    @Override
    public IListPosition next() {
        return successor;
    }

    @Override
    public IListPosition prev() {
        return predecessor;
    }
    
}
