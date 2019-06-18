package challenges.Tree;

import java.util.ArrayList;

public class BinarySearchTree<T extends Comparable> extends BinaryTree<T> {

    public BinarySearchTree() {
        super();
    }

    public void add(T value) {
        this.root = this.add(value, this.root);
    }

    public BinaryTreeNode add(T value, BinaryTreeNode current) {
        if (current == null) {
            return new BinaryTreeNode(value);
        }

        if (current.value.compareTo(value) > 0) {
            current.left = this.add(value, current.left);
        } else {
            current.right = this.add(value, current.right);
        }

        return current;
    }

    public boolean contains(T value) {
        return this.contains(value, this.root);
    }

    public boolean contains(T value, BinaryTreeNode current) {
        if (current == null) {
            return false;
        }
        // if values match, return true
        else if (current.value.compareTo(value) == 0) {
            return true;
        }

        // if no match, move to left, then right and look
        if (current.value.compareTo(value) > 0) {
            return this.contains(value, current.left);
        } else {
            return this.contains(value, current.right);
        }
    }
}
