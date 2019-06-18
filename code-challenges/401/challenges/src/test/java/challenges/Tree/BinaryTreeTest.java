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
}