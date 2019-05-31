package com.company;

public class Function implements Interface {
    private int[] Heaptree;
    private int size;
    int maxsize;

    private static final int FRONT = 1;

    Function(int maxsize) {
        this.maxsize = maxsize;
        this.size = 0;
        Heaptree = new int[this.maxsize + 1];
        Heaptree[0] = Integer.MAX_VALUE;
    }

    private int parent(int node) {
        return node / 2;
    }

    private int leftChild(int node) {
        return (2 * node);
    }

    // Function to return the position of
    // the right child for the node currently
    // at pos
    private int rightChild(int node) {
        return (2 * node + 1);
    }

    // Function that returns true if the passed
    // node is a leaf node
    private boolean isLeaf(int node) {
        return node >= (size / 2) && node <= size;
    }

    // Function to swap two nodes of the heap
    private void swap(int kiri, int kanan) {
        int tmp;
        tmp = Heaptree[kiri];
        Heaptree[kiri] = Heaptree[kanan];
        Heaptree[kanan] = tmp;
    }

    // Function to heapify the node at pos
    private void maxHeapify(int node) {
        if (isLeaf(node))
            return;
        if (Heaptree[node] < Heaptree[leftChild(node)] ||
                Heaptree[node] < Heaptree[rightChild(node)]) {

            if (Heaptree[leftChild(node)] > Heaptree[rightChild(node)]) {
                swap(node, leftChild(node));
                maxHeapify(leftChild(node));
            } else {
                swap(node, rightChild(node));
                maxHeapify(rightChild(node));
            }
        }
    }

    @Override
    public void add(int element) {
        Heaptree[++size] = element;

        // Traverse up and fix violated property
        int temp = size;
        while (Heaptree[temp] > Heaptree[parent(temp)]) {
            swap(temp, parent(temp));
            temp = parent(temp);
        }
        System.out.println("\nData entered successfully !");
    }

    @Override
    public void remove(Object o) {
        int pop = Heaptree[FRONT];
        Heaptree[FRONT] = Heaptree[size--];
        maxHeapify(FRONT);
        System.out.println("\nData deleted successfully !");
    }

    @Override
    public void print() {
        if(size == 0) {
            System.out.println("Data is empty !");
        } else {
            for (int i = 1; i <= size / 2; i++) {
                System.out.print(" PARENT : " + Heaptree[i] + " LEFT CHILD : " +
                        Heaptree[2 * i] + " RIGHT CHILD :" + Heaptree[2 * i + 1]);
                System.out.println();
            }
        }
    }

}
