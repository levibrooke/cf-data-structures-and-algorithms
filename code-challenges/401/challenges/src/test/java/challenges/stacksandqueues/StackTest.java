package challenges.stacksandqueues;

import org.junit.Test;

import static org.junit.Assert.*;

public class StackTest {

    @Test
    public void push() {
        Stack classUnderTest = new Stack();
        classUnderTest.push(3);

        assertEquals(3,
                classUnderTest.top.data);
    }

    @Test
    public void pushMultiple() {
        Stack classUnderTest = new Stack();
        classUnderTest.push(3);
        classUnderTest.push(5);

        assertEquals(5,
                classUnderTest.peek());
    }

    @Test
    public void pop() {
        Stack classUnderTest = new Stack();
        classUnderTest.push(3);
        classUnderTest.push(5);

        assertEquals(5,
                classUnderTest.pop());
    }

    @Test (expected = NullPointerException.class)
    public void popUntilEmpty() {
        Stack classUnderTest = new Stack();
        classUnderTest.push(3);
        classUnderTest.push(5);

        classUnderTest.pop();
        classUnderTest.pop();

        assertEquals(null,
                classUnderTest.top);
    }

    @Test
    public void peek() {
        Stack classUnderTest = new Stack();
        classUnderTest.push(3);
        classUnderTest.push(5);

        assertEquals(5,
                classUnderTest.peek());
    }

    @Test
    public void emptyStack() {
        Stack classUnderTest = new Stack();

        assertEquals(null,
                classUnderTest.top);
    }
}