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
        ArrayList preOrderList = new ArrayList();

        this.preOrder(this.root, preOrderList);

        return preOrderList;
    }

    private void preOrder(BinaryTreeNode node, ArrayList preOrderList) {
        if (node == null) {
            return;
        }
        
        preOrderList.add(node.value);

        preOrder(node.left, preOrderList);

        preOrder(node.right, preOrderList);
    }
}
