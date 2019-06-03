package challenges.LinkedList;

public class LinkedList {

    static class Node {
        int data;
        Node next;

        public Node(int inputData) {
            data = inputData;
            next = null;
        }
    }

    Node head;

    public void LinkedList() {
        this.head = null;
    }

    public LinkedList insert(int insertData) {

        // create node & set next
        Node newNode = new Node(insertData);
        newNode.next = null;

        // set new node to head

        // if empty list
        if (this.head == null) {
            this.head = newNode;
        }

        // if non-empty list
        else {
            Node tempPointer = this.head;
            this.head = newNode;
            newNode.next = tempPointer;
        }
        return this;
    }
}
