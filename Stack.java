// Stack.java
import java.util.LinkedList;

public class Stack<T> {
    private LinkedList<T> elements = new LinkedList<>();

    public void push(T item) {
        elements.addFirst(item);
    }

    public T pop() {
        if (isEmpty()) {
            throw new IllegalStateException("Stack underflow: Cannot pop from an empty stack.");
        }
        return elements.removeFirst();
    }

    public boolean isEmpty() {
        return elements.isEmpty();
    }

    @Override
    public String toString() {
        return "Stack{" + "elements=" + elements + '}';
    }
}
