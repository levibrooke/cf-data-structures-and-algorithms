package challenges.Tree;

import org.junit.Test;

import static org.junit.Assert.*;

public class BinarySearchTreeTest {

    @Test
    public void treeWithRoot() {
        BinarySearchTree treeUnderTest = new BinarySearchTree();
        treeUnderTest.add(5);

        assertEquals(5,
                treeUnderTest.root.value);
    }
}