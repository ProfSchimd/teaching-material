import java.util.Random;

public class Main {
    public static void main(String[] args) {
        SinglyLinkedList sll = new SinglyLinkedList();
        DoublyLinkedList dll = new DoublyLinkedList();
        Random r = new Random();
        for (int i = 0; i < 10; i++) {
            sll.insertAtHead(Integer.valueOf(r.nextInt(100)));
            dll.insertAtHead(Integer.valueOf(i));    
        }
        System.out.println(sll);
        System.out.println(dll);
    }
}
