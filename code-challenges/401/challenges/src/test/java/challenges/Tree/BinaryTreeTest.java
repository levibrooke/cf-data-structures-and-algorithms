package challenges.Tree;

import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class BinaryTreeTest {

    @Test
    public void isEmpty() {
        BinaryTree treeUnderTest = new BinaryTree();

        assertTrue("should be empty",
                treeUnderTest.isEmpty());
    }

    @Test
    public void treeWithRoot() {
        BinaryTree treeUnderTest = new BinaryTree("test");

        String result = treeUnderTest.root.value.toString();

        System.out.println(result);

        assertEquals("test",
                result);
    }

    @Test
    public void addLeft() {
        BinarySearchTree treeUnderTest = new BinarySearchTree();
        treeUnderTest.add(5);
        treeUnderTest.add(2);
        treeUnderTest.add(7);

        assertEquals(2, treeUnderTest.root.left.value);
    }

    @Test
    public void addRight() {
        BinarySearchTree treeUnderTest = new BinarySearchTree();
        treeUnderTest.add(5);
        treeUnderTest.add(2);
        treeUnderTest.add(7);

        assertEquals(7, treeUnderTest.root.right.value);
    }

    @Test
    public void containsMethodFalse() {
        BinarySearchTree treeUnderTest = new BinarySearchTree();
        treeUnderTest.add(5);
        treeUnderTest.add(2);
        treeUnderTest.add(7);

        assertEquals(false, treeUnderTest.contains(6));
    }

    @Test
    public void containsMethodTrue() {
        BinarySearchTree treeUnderTest = new BinarySearchTree();
        treeUnderTest.add(5);
        treeUnderTest.add(2);
        treeUnderTest.add(7);

        assertEquals(true, treeUnderTest.contains(2));
    }

    @Test
    public void testPreOrder() {
        BinaryTree treeUnderTest = new BinaryTree(2);
        treeUnderTest.root.setLeft(new BinaryTreeNode(1));
        treeUnderTest.root.setRight(new BinaryTreeNode(5));
        System.out.println(treeUnderTest.preOrder().toString());

        ArrayList expected = new ArrayList();
        expected.add(2);
        expected.add(1);
        expected.add(5);

        assertEquals(expected,
                treeUnderTest.preOrder());
    }

    @Test
    public void testInOrder() {
        BinaryTree treeUnderTest = new BinaryTree(2);
        treeUnderTest.root.setLeft(new BinaryTreeNode(1));
        treeUnderTest.root.setRight(new BinaryTreeNode(5));
        System.out.println(treeUnderTest.inOrder().toString());

        ArrayList expected = new ArrayList();
        expected.add(1);
        expected.add(2);
        expected.add(5);

        assertEquals(expected,
                treeUnderTest.inOrder());
    }

    @Test
    public void testPostOrder() {
        BinaryTree treeUnderTest = new BinaryTree(2);
        treeUnderTest.root.setLeft(new BinaryTreeNode(1));
        treeUnderTest.root.setRight(new BinaryTreeNode(5));
        System.out.println(treeUnderTest.postOrder().toString());

        ArrayList expected = new ArrayList();
        expected.add(1);
        expected.add(5);
        expected.add(2);

        assertEquals(expected,
                treeUnderTest.postOrder());
    }

    @Test
    public void testBreadthFirstSearch() {
        BinaryTree treeUnderTest = new BinaryTree(2);
        treeUnderTest.root.setLeft(new BinaryTreeNode(1));
        treeUnderTest.root.setRight(new BinaryTreeNode(5));

        treeUnderTest.breadthFirst(treeUnderTest);

        // visually check for println
    }

    @Test
    public void testMaximumValue() {
        BinaryTree treeUnderTest = new BinaryTree(2);
        treeUnderTest.root.setLeft(new BinaryTreeNode(1));
        treeUnderTest.root.setRight(new BinaryTreeNode(5));
        treeUnderTest.root.left.setLeft(new BinaryTreeNode(11));
        treeUnderTest.root.left.setRight(new BinaryTreeNode(6));

        treeUnderTest.breadthFirst(treeUnderTest);

        int result = treeUnderTest.findMaximumValue(treeUnderTest);

        assertEquals(11, result);
    }

    @Test(expected = NullPointerException.class)
    public void testEmptyMaxValue() {
        BinaryTree treeUnderTest = new BinaryTree();

        treeUnderTest.findMaximumValue(treeUnderTest);
    }
}