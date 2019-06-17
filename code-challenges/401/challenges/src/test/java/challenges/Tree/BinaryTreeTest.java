package challenges.Tree;

import org.junit.Test;

import static org.junit.Assert.*;

public class BinaryTreeTest {

    @Test
    public void isEmpty() {
        BinaryTree treeUnderTest = new BinaryTree();

        assertTrue("should be empty",
                treeUnderTest.isEmpty());
    }
}