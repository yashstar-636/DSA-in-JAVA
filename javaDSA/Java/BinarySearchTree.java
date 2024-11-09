package JavaWithDsa;

public  class BinarySearchTree {

    static class node {
        int data;
        node left;
        node right;

        node(int value) {
            this.data = value;
        }
    }

    public static node insert(node root, int value) {
        if (root == null) {
            root = new node(value);
            return root;
        }
        if (root.data > value) {
//            left subtree
            root.left = insert(root.left,value);

        } else {
//            right subtree
            root.right = insert(root.right,value);

        }
        return root;
    }

    public static void inorder(node root) {
        if (root == null) {
            return;
        }
        inorder(root.left);
        System.out.println(root.data + " ");
        inorder(root.right);
    }

    public static void main(String[] args) {
        int values[] = {5, 1, 3, 4, 2, 7};
        node root = null;
        for (int i =0;i<values.length;i++){
            root=insert(root,values[i]);
        }
        inorder(root);
    }
}
