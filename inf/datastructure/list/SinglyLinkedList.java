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
        return removed.value();
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
        return removed.value();
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
            if(iterator.value().equals(o)) {
                return iterator;
            }
            iterator = iterator.next();
        }
        return null;
    }

    @Override
    public String toString() {
        String str = "H -> ";
        IListPosition iterator = head;
        while(iterator != null) {
            str += iterator.value().toString() + " -> ";
            iterator = iterator.next();
        }
        str += "null";
        return str;
    }
}
