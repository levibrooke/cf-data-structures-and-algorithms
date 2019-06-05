# Singly Linked List
Implement a Singly Linked List Data Structure

## Challenge
- Create a Node class that has properties for the value stored in the Node, and a pointer to the next Node.
- Within your LinkedList class, include a head property. Upon instantiation, an empty Linked List should be created.
- This object should be aware of a default empty value assigned to head when the linked list is instantiated.
- Define a method called insert which takes any value as an argument and adds a new node with that value to the head of the list with an O(1) Time performance.
- Define a method called includes which takes any value as an argument and returns a boolean result depending on whether that value exists as a Node’s value somewhere within the list.
- Define a method called print which takes in no arguments and returns a collection all of the current Node values in the Linked List.
- At no time should an exception or stack trace be shown to the end user. Catch and handle any such exceptions and return a printed value or operation which cleanly represents the state and either stops execution cleanly, or provides the user with clear direction and output.
- Be sure to follow your language/frameworks standard naming conventions (e.g. C# uses PascalCasing for all method and class names).

## Approach & Efficiency
- Create a linked list class
- Create a subclass for creating each node
- This implementation has Big O of O(1) except the insert and includes have O(n).

## API
- Create a new Linked List
- Insert a value into head
- Check if Linked List includes a value
- Print the values of a Linked List

## Solution
- [Link to code](../challenges/src/main/java/challenges/LinkedList/LinkedList.java)
- [Link to tests](../challenges/src/test/java/challenges/LinkedList/LinkedListTest.java)