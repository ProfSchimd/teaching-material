import java.util.Random;

public class Main {
    public static void main(String[] args) {
        SinglyLinkedList sll = new SinglyLinkedList();
        DoublyLinkedList dll = new DoublyLinkedList();
        Random r = new Random();
        for (int i = 0; i < 10; i++) {
            dll.insertAtHead(Integer.valueOf(r.nextInt(100)));
            sll.insertAtHead(Integer.valueOf(i));    
        }
        System.out.println(sll);
        System.out.println(dll);
        IListPosition ilp = sll.search(Integer.valueOf(5));
        SinglyLinkedList tl = sll.splice(ilp);
        System.out.println(sll + " " + sll.size());
        System.out.println(tl + " " + tl.size());
        

    }
}
