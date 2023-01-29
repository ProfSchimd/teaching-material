import java.util.Iterator;

public class Stack implements Iterable<Object> {

    public class StackIterator implements Iterator<Object> {

        private Stack stack;
        private int i;

        public StackIterator(Stack stack) {
            this.stack = stack;
            i = stack.top;
        }

        @Override
        public boolean hasNext() {
            return i>0;
        }

        @Override
        public Object next() {
            return (i>0) ? stack.content[--i] : null;
        }

    }

    private static int ARRAY_SIZE = 65536;
    private Object[] content;
    private int top;

    public Stack() {
        content = new Object[ARRAY_SIZE];
        top = 0;
    }

    public void push(Object o) {
        content[top++] = o;
    }

    public Object pop() {
        return content[top--];
    }

    public int size() {
        return top;
    }

    public boolean isEmpty() {
        return (size() == 0);
    }

    public Iterator<Object> iterator() {
        return new StackIterator(this);
    }

    public static void main(String[] args) {
        Stack stack = new Stack();
        stack.push("Alice");
        stack.push("Bob");
        stack.push("Carol");
        stack.push("David");

        for (Object object : stack) {
            System.out.println(object);
        }
    }
}
