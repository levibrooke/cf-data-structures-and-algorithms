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

        assertEquals("new list, node w/ value of 3",
                3,
                nodeVal.data);
    }

    @Test
    // can properly insert multiple nodes into the linked list
    public void testMultipleInsert() {
        LinkedList newList = new LinkedList();

        newList.insert(5);
        newList.insert(3);
        LinkedList.Node nodeVal = newList.head;

        assertEquals("head val equals 3",
                3,
                nodeVal.data);

        assertEquals("second node equals 5",
                5,
                nodeVal.next.data);
    }
    @Test
    // includes true
    public void testIncludesTrue() {
        LinkedList newList = new LinkedList();
        newList.insert(5);
        newList.insert(3);
        newList.insert(7);

        assertEquals("is value in list?",
                true,
                newList.includes(3));
    }

    @Test
    // includes false
    public void testIncludesFalse() {
        LinkedList newList = new LinkedList();
        newList.insert(5);
        newList.insert(3);
        newList.insert(7);

        assertEquals("is value in list?",
                false,
                newList.includes(8));
    }

    @Test
    // test print
    public void testPrint() {
        LinkedList newList = new LinkedList();
        newList.insert(5);
        newList.insert(3);
        newList.insert(7);

        System.out.println(newList.print());

        assertEquals("test print",
                "LinkedList: 7 -> 3 -> 5 -> null",
                newList.print());
    }

    @Test
    public void append() {
        LinkedList newList = new LinkedList();
        newList.insert(5);
        newList.insert(3);
        newList.insert(7);

        newList.append(9);

        assertEquals("test append",
                "LinkedList: 7 -> 3 -> 5 -> 9 -> null",
                newList.print());

        System.out.println(newList.print());
    }
}