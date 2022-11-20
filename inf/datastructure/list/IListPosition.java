public interface IListPosition {
    Object value();
    IListPosition next();
    public void setNext(IListPosition newNext);
    IListPosition prev();
    public void setPrev(IListPosition newPrev);
}
