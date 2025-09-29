public class DoublyLinkedList {
    private IListPosition head;
    private IListPosition tail;
    private int n;

    public DoublyLinkedList() {
        head = null;
        tail = null;
        n = 0;
    }

    public void insertAtHead(Object o) {
        ListPosition newPosition = new ListPosition(o, head, null);
        head = newPosition;
        if(tail == null) { // la lista era vuota (tail -> null)
            tail = newPosition;
        } else { // esisteva una head e quindi aggiorno il suo prev
            newPosition.next().setPrev(newPosition); // !!!
        }
        n++;
    }

    /**
     * Search for a position with content testing equal to the provided {@link Object}
     * 
     * @param o the {@link Object} to search within the list
     * @return the {@link IListPosition} containing a value equals to the provided {@link Object}.
     * <code>null<code> if no such position exists in the list.
     */
    public IListPosition search(Object o) {
        IListPosition iterator = head;
        while(iterator != null) {
            if(iterator.content().equals(o)) {
                return iterator;
            }
            iterator = iterator.next();
        }
        return null;
    }

    @Override
    public String toString() {
        String str = "H <-> ";
        IListPosition iterator = head;
        while(iterator != null) {
            str += iterator.content().toString() + " <-> ";
            iterator = iterator.next();
        }
        str += "T";
        return str;
    }
}

