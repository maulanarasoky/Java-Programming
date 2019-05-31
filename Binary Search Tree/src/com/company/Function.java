/*
Author  : Maulana Rasoky Nasution
Website : https://mul-code.blogspot.com/
*/
package com.company;

public class Function implements Interface {
    private Node root;

    private class Node {
        private int key;
        Node left, right;

        Node(int item) {
            this.key = item;
            this.left = null;
            this.right = null;
        }
    }

    private Node insertRec(Node root, int key) {
        if (isEmpty()) {
            root = new Node(key);
            return root;
        }
        if (key < root.key)
            root.left = insertRec(root.left, key);
        else if (key > root.key)
            root.right = insertRec(root.right, key);

        return root;
    }

    void insert(int key) {
        root = insertRec(root, key);
        System.out.println("\nData entered successfully");
    }

    private void preOrder(Node root) {
        if (!isEmpty()) {
            System.out.print(root.key + " ");
            preOrder(root.left);
            preOrder(root.right);
        }
    }

    private void inOrder(Node root) {
        if (!isEmpty()) {
            inOrder(root.left);
            System.out.print(root.key + " ");
            inOrder(root.right);
        }
    }

    private void postOrder(Node root) {
        if (!isEmpty()) {
            postOrder(root.left);
            postOrder(root.right);
            System.out.print(root.key + " ");
        }
    }

    private int minValue(Node root) {
        int minV = root.key;
        while (root.left != null) {
            minV = root.left.key;
            root = root.left;
        }
        return minV;
    }

    private Node removeRec(Node root, int angka) {
        if (isEmpty()) {
            return null;
        }
        if (angka < root.key) {
            root.left = removeRec(root.left, angka);
        } else if (angka > root.key) {
            root.right = removeRec(root.right, angka);
        } else {
            if (root.left == null) {
                return root.right;
            } else if (root.right == null) {
                return root.left;
            }
            root.key = minValue(root.right);
            root.right = removeRec(root.right, root.key);
        }
        return root;
    }

    @Override
    public boolean isEmpty() {
        return root == null;
    }

    @Override
    public void printPreOrder() {
        preOrder(root);
    }

    @Override
    public void printPostOrder() {
        postOrder(root);
    }

    @Override
    public void printInOrder() {
        inOrder(root);
    }

    @Override
    public void remove(int angka) {
        root = removeRec(root, angka);
        System.out.println("\nData deleted successfully");
    }

}
