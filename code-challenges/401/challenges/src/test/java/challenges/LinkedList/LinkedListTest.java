package challenges.LinkedList;

import org.junit.Test;

import static org.junit.Assert.*;

public class LinkedListTest {

    @Test
    // instantiate an empty list
    public void linkedList() {
        LinkedList newList = new LinkedList();

        assertEquals("new linked list with null head",
                null,
                newList.head);
    }

    @Test
    // can insert a node
    public void testInsert() {
        LinkedList newList = new LinkedList();

        newList.insert(5);
        LinkedList.Node nodeVal = newList.head;

        assertEquals("new list, node w/ value of 5",
                5,
                nodeVal.data);
    }

    @Test
    // head will point to first node
    public void testHeadPointer() {
        LinkedList newList = new LinkedList();

        newList.insert(5);
        newList.insert(3);
        LinkedList.Node nodeVal = newList.head;

        assertEquals("new list, node w/ value of 5",
                3,
                nodeVal.data);
    }

    @Test
    // includes
    public void testIncludes() {
        LinkedList newList = new LinkedList();
        newList.insert(5);
        newList.insert(3);
        newList.insert(7);

        assertEquals("is value in list?",
                false,
                newList.includes(8));
    }
}