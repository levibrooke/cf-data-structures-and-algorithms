package challenges.stacksandqueues;

public class Queue {
    Node front;
    Node rear;

    public Queue() {
        front = null;
        rear = null;
    }

    public void enqueue(int value) {
        Node node = new Node(value);

        // if empty queue
        if (front == null) {
            front = node;
            rear = node;
        }

        // if not empty
        front.next = node;
        rear = node;
    }

    public int dequeue() {
        Node current = front;
        front = front.next;
        current.next = null;

        return current.data;
    }

    public int peek() {
        return front.data;
    }
}
