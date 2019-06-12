package challenges.stacksandqueues;

public class PseudoQueue {
    Stack enqueueStack;
    Stack dequeueStack;

    public PseudoQueue() {
        this.enqueueStack = new Stack();
        this.dequeueStack = new Stack();
    }

    public void enqueue(int value) {
        enqueueStack.push(value);
    }

    public int dequeue() {
        if (dequeueStack.top != null) {
            return dequeueStack.pop();
        }

        else {
            while (enqueueStack.top != null) {
                dequeueStack.push(enqueueStack.pop());
            }
            return dequeueStack.pop();
        }
    }

    public int peek() {
        if (dequeueStack.top != null) {
            return dequeueStack.peek();
        }

        else {
            while (enqueueStack.top != null) {
                dequeueStack.push(enqueueStack.pop());
            }
            return dequeueStack.peek();
        }
    }
}
