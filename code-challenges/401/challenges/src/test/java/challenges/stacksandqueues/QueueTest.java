package challenges.stacksandqueues;

import org.junit.Test;

import static org.junit.Assert.*;

public class QueueTest {

    @Test
    public void enqueue() {
        Queue classUnderTest = new Queue();
        classUnderTest.enqueue(2);

        assertEquals(2,
                classUnderTest.peek());
    }

    @Test
    public void enqueueMultiple() {
        Queue classUnderTest = new Queue();
        classUnderTest.enqueue(2);
        classUnderTest.enqueue(4);

        assertEquals(2,
                classUnderTest.front.data);
        assertEquals(4,
                classUnderTest.rear.data);
    }

    @Test
    public void dequeue() {
        Queue classUnderTest = new Queue();
        classUnderTest.enqueue(2);
        classUnderTest.enqueue(4);

        assertEquals(2,
                classUnderTest.dequeue());
    }

    @Test
    public void peek() {
        Queue classUnderTest = new Queue();
        classUnderTest.enqueue(2);
        classUnderTest.enqueue(4);

        assertEquals(2,
                classUnderTest.peek());
    }

    @Test (expected = NullPointerException.class)
    public void dequeueUntilEmpty() {
        Queue classUnderTest = new Queue();
        classUnderTest.enqueue(2);
        classUnderTest.enqueue(4);

        classUnderTest.dequeue();
        classUnderTest.dequeue();

        assertEquals(null,
                classUnderTest.peek());
    }

    @Test
    public void emptyQueue() {
        Queue classUnderTest = new Queue();

        assertEquals(null,
                classUnderTest.front);
    }
}