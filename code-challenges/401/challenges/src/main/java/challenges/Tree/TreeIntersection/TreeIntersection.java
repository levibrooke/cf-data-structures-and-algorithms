package challenges.Tree.TreeIntersection;

import challenges.Tree.BinaryTree;
import challenges.Tree.BinaryTreeNode;
import org.apache.commons.math3.exception.NullArgumentException;

import java.util.HashSet;

public class TreeIntersection {
    public static HashSet findIntersection(BinaryTree bTreeOne, BinaryTree bTreeTwo) {
        if (bTreeOne == null || bTreeTwo == null) {
            throw new NullArgumentException();
        }

        HashSet one = new HashSet();
        HashSet result = new HashSet();

        // put keys from bTreeOne vals into set
        one = treeToSet(bTreeOne.getRoot(), one);

        // call helper to check if bTreeTwo has intersections
        return treeToSet(bTreeTwo.getRoot(), one, result);
    }

    private static HashSet treeToSet(BinaryTreeNode node, HashSet set) {
        if (node == null) {
            return set;
        }

        set.add(node.getValue());
        set = treeToSet(node.getLeft(), set);
        set = treeToSet(node.getRight(), set);

        return set;
    }

    private static HashSet treeToSet(BinaryTreeNode node, HashSet set, HashSet result) {
        if (node == null) {
            return result;
        }

        if (set.contains(node.getValue())) {
            result.add(node.getValue());
        }

        result = treeToSet(node.getLeft(), set, result);
        result = treeToSet(node.getRight(), set, result);

        return result;
    }
}
