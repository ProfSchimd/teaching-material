public class SinglyLinkedList {
    private IListPosition head;
    private int n;

    /**
     * Constructs an empty singly linked list.
     */
    public SinglyLinkedList() {
        head = null;
        n = 0;
    }

    /**
     * Insert the given object at the head position of the list.
     * 
     * @param o the {@link Object} to be inserted as the new head
     */
    public void insertAtHead(Object o) {
        // crea IListPosition per l'oggetto da inserire
        // Il suo 'next' sarà quello che è adesso in testa
        // Funziona anche se la lista è vuota, perché?
        ListPosition newPosition = new ListPosition(o, head, null);
        // Inserisco la 'posizione' appena creata come nuova testa
        head = newPosition;
        // aggiorno il conteggio degli elementi
        n++;
    }

    /**
     * 
     * @return the value of the removed position, <code>null</code> if nothing is removed
     */
    public Object removeAtHead() {
        if (head == null) {
            // What to do?
            return null;
        }
        IListPosition removed = head;
        head = head.next();
        n--;
        return removed.content();
    }

    /**
     * Inserts the given object after the given position.
     * 
     * @param o the {@link Object} to be inserted
     * @param pos the position after which the element will be inserted
     */
    public void insertAfter(Object o, IListPosition pos) {
        IListPosition newPos = new ListPosition(o, pos.next(), null);
        pos.setNext(newPos);
        n++;
    }

    /**
     * 
     * @param pos the position preceding the one to remove
     * @return the value of the removed position
     */
    public Object removeAfter(IListPosition pos) {
        IListPosition removed = pos.next();
        pos.setNext(removed.next());
        return removed.content();
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

    /**
     * Splits the current list into two lists based on the given position.
     * The second list contains the elements after the given position and
     * is returned by this method. The current list is truncated up to the
     * given position (included).
     * 
     * @param splicePosition the position with respect to which the list
     * will be spliced.
     * @return the list created from elements after the given position
     */
    public SinglyLinkedList splice(IListPosition splicePosition) {
        SinglyLinkedList tailList = new SinglyLinkedList();
        tailList.head = splicePosition.next();
        splicePosition.setNext(null);
        IListPosition iterator = tailList.head;
        while(iterator != null) {
            tailList.n++;
            iterator = iterator.next();
        }
        n -= tailList.n;
        return tailList;
    }

    /**
     * Merges the current list with the one passed as parameters, the merge
     * occurs by appending the given list to the last element of the current one.
     * 
     * @param other the list to be appended
     * @return the current list after merging
     */
    public SinglyLinkedList merge(SinglyLinkedList other) {
        // current list is empty
        if (head == null) {
            head = other.head;
            n = other.n;
            return this;
        }
        // Finds the tail of the current list
        IListPosition last = head;
        while(last.next() != null) {
            last = last.next();
        }
        last.setNext(other.head);
        n+= other.n;
        return this;
    }

    /**
     * Gives the number of elements stored in the list.
     * 
     * @return the number of elements in the list.
     */
    public int size() {
        return n;
    }

    @Override
    public String toString() {
        String str = "H -> ";
        IListPosition iterator = head;
        while(iterator != null) {
            str += iterator.content().toString() + " -> ";
            iterator = iterator.next();
        }
        str += "null";
        return str;
    }
}
