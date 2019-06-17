package challenges.Tree;

import java.util.ArrayList;

public class BinaryTree<T extends Comparable> {
    BinaryTreeNode<T> root;

    public BinaryTree() {}
    public BinaryTree(T value) {
        this.root = new BinaryTreeNode<>(value);
    }

    public boolean isEmpty() {
        return this.root == null ? true : false;
    }

    // traversal methods go here

    public ArrayList preOrder() {
        if (this.root == null) {
            return null;
        }
        ArrayList preOrderList = new ArrayList();

        this.preOrder(this.root, preOrderList);


        return preOrderList;
    }

    private void preOrder(BinaryTreeNode node, ArrayList preOrderList) {
        // add root
        preOrderList.add(this.root.value, preOrderList);

        // add left
        preOrderList.add(this.root.left.value);

        // add right
        preOrderList.add(this.root.right.value);
    }
}
