public interface IListPosition {
    Object content();
    IListPosition next();
    void setNext(IListPosition newNext);
    IListPosition prev();
    void setPrev(IListPosition newPrev);
}
