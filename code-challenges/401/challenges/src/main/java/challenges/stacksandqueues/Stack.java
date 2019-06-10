package challenges.stacksandqueues;

public class Stack {
    Node top;

    public Stack() {
        top = null;
    }

    public void push(int value) {
        Node node = new Node(value);
        top = node;
    }

    public int pop() {
        Node current = top;

        if (top.next != null) {
            top = top.next;
        }

        return current.data;
    }

    public int peek() {
        return top.data;
    }
}
