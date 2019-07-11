package challenges.Tree.TreeIntersection;

import challenges.Tree.BinarySearchTree;
import org.apache.commons.math3.exception.NullArgumentException;
import org.junit.Test;
import static org.junit.Assert.*;

import java.util.HashSet;

public class TreeIntersectionTest {

    @Test
    public void findIntersection() {

        BinarySearchTree treeOne = new BinarySearchTree();
        treeOne.add(5);
        treeOne.add(2);
        treeOne.add(7);

        BinarySearchTree treeTwo = new BinarySearchTree();
        treeTwo.add(5);
        treeTwo.add(9);
        treeTwo.add(12);

        HashSet result = TreeIntersection.findIntersection(treeOne, treeTwo);

        assertEquals(1, result.size());
    }

    @Test(expected = NullArgumentException.class)
    public void findIntersectionNull() {
        BinarySearchTree treeOne = null;

        BinarySearchTree treeTwo = new BinarySearchTree();
        treeTwo.add(5);
        treeTwo.add(9);
        treeTwo.add(12);

        HashSet result = new HashSet();

        assertEquals(result, TreeIntersection.findIntersection(treeOne, treeTwo));
    }
}