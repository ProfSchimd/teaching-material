public class Main {

    private static void exampleQueue(IQueue q) {
        // 1. Add three strings
        q.enqueue("Alice");
        q.enqueue("Bob");
        q.enqueue("Carol");
        // 2. dequeue one element
        System.out.println(q.dequeue());
        // 3. Add two more elements and then dequeue one
        q.enqueue("David");
        q.enqueue("Emily");
        System.out.println(q.dequeue());
        // 4. size and isEmpty
        System.out.println("Size: " + q.size() + " Empty: " + q.isEmpty());
        // 5. empty (works because I know that there are three elements left)
        q.dequeue();
        q.dequeue();
        q.dequeue();
        // 6. size and isEmpty
        System.out.println("Size: " + q.size() + " Empty: " + q.isEmpty());
    }

    private static void exampleStack(IStack s) {
        // 1. Add three strings
        s.push("Alice");
        s.push("Bob");
        s.push("Carol");
        // 2. dequeue one element
        System.out.println(s.pop());
        // 3. Add two more elements and then dequeue one
        s.push("David");
        s.push("Emily");
        System.out.println(s.pop());
        // 4. size and isEmpty
        System.out.println("Size: " + s.size() + " Empty: " + s.isEmpty());
        // 5. empty (works because I know that there are three elements left)
        s.pop();
        s.pop();
        s.pop();
        // 6. size and isEmpty
        System.out.println("Size: " + s.size() + " Empty: " + s.isEmpty());
    }

    public static void main(String[] args) {
        IQueue q = null;
        IStack s = null;
        // initialization of `q` and `s`
        exampleQueue(q);
        exampleStack(s);
    }
}
