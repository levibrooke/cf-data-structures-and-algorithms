package challenges.stacksandqueues;

public class Stack {
    Node top;

    public Stack() {
        top = null;
    }

    public void push(int value) {
        Node node = new Node(value);
        node.next = top;
        top = node;
    }

    public int pop() {
        Node current = top;

        // if there are more than 1 nodes
        if (top.next != null) {
            top = top.next;
        }
        else {
            top = null;
        }
        current.next = null;

        return current.data;
    }

    public int peek() {
        return top.data;
    }
}
