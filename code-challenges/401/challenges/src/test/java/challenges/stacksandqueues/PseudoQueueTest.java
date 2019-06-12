package challenges.stacksandqueues;

import org.junit.Test;

import static org.junit.Assert.*;

public class PseudoQueueTest {

    @Test
    public void enqueue() {
        PseudoQueue classUnderTest = new PseudoQueue();
        classUnderTest.enqueue(1);
        classUnderTest.enqueue(2);

        assertEquals(2,
                classUnderTest.enqueueStack.top.data);
    }

    @Test
    public void dequeue() {
        PseudoQueue classUnderTest = new PseudoQueue();
        classUnderTest.enqueue(1);
        classUnderTest.enqueue(2);

        assertEquals(2,
                classUnderTest.dequeue());
    }

    @Test
    public void peek() {
        PseudoQueue classUnderTest = new PseudoQueue();
        classUnderTest.enqueue(1);
        classUnderTest.enqueue(2);

        assertEquals(2,
                classUnderTest.peek());
    }
}