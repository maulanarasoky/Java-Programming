/*
Author  : Maulana Rasoky Nasution
Website : https://mul-code.blogspot.com
*/
package com.company;

public class Function implements Interface {

    private final int DEFAULTMAX = 100;
    private int[][] data = new int[DEFAULTMAX][DEFAULTMAX];
    private String[] label = new String[DEFAULTMAX];
    private int jumlahVertex;

    StackInterface stack = new StackLL();

    public Function(int maximum) {
        data = new int[maximum][maximum];
        jumlahVertex = 0;
    }

    private int find(String labelVertex) {
        for (int i = 0; i <= jumlahVertex; i++) {
            if (label[i] == labelVertex)
                return i;
        }
        return -1;
    }

    @Override
    public void insertVertex(String labelVertex) {
        if (jumlahVertex == data.length) {
            System.out.println("FULL");
            return;
        }

        if (find(labelVertex) > -1) {
            System.out.println("Sudah ada");
            return;
        }

        for (int i = 0; i <= jumlahVertex; i++) {
            data[i][jumlahVertex] = 0;
            data[jumlahVertex][i] = 0;
        }

        label[jumlahVertex] = labelVertex;

        jumlahVertex++;
    }

    @Override
    public void insertEdge(String vertex1, String vertex2) {
        int pos1 = find(vertex1);
        int pos2 = find(vertex2);

        if ((pos1 == -1) || (pos2 == -1)) {
            System.out.println("Ada vertex yang gak dikenal");
            return;
        }
        data[pos1][pos2] = 1;
    }

    @Override
    public void displayDFS() {
        QueueInterface traversalOrder = new QueueLL();
        StackInterface vertexStack = new StackLL();
        char[] simpulDiKunjungi = new char[data.length];

        for (int i = 0; i < jumlahVertex; i++)
            simpulDiKunjungi[i] = 'x';

        vertexStack.push(label[0]);

        while (!vertexStack.isEmpty()) {
            String topVertex = (String) vertexStack.pop();

            int posisi = find(topVertex);
            if (simpulDiKunjungi[posisi] == 'x') {
                traversalOrder.enQueue(topVertex);
                simpulDiKunjungi[posisi] = 'v';
            }

            for (int j = 0; j < jumlahVertex; j++) {
                if (data[posisi][j] == 1) {
                    if (simpulDiKunjungi[j] == 'x') {
                        vertexStack.push(label[j]);
                    }
                }
            }
        }
        while (!traversalOrder.isEmpty()) {
            System.out.print(traversalOrder.deQueue() + " - ");
        }
    }

    @Override
    public void displayBFS() {
        QueueInterface traversalOrder = new QueueLL();
        QueueInterface vertexQueue = new QueueLL();
        char[] simpulDiKunjungi = new char[data.length];
        for (int i = 0; i < jumlahVertex; i++)
            simpulDiKunjungi[i] = 'x';
        simpulDiKunjungi[0] = 'v';
        traversalOrder.enQueue(label[0]);
        vertexQueue.enQueue(label[0]);

        while (!vertexQueue.isEmpty()) {
            String frontVertex = (String) vertexQueue.deQueue();
            int posisi = find(frontVertex);
            for (int j = 1; j < jumlahVertex; j++)
                if (data[posisi][j] == 1)
                    if (simpulDiKunjungi[j] == 'x') {
                        vertexQueue.enQueue(label[j]);
                        traversalOrder.enQueue(label[j]);
                        simpulDiKunjungi[j] = 'v';
                    }
        }
        while (!traversalOrder.isEmpty()) {
            System.out.print(traversalOrder.deQueue() + " - ");
        }
    }

    @Override
    public void display() {
        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data[i].length; j++) {
                System.out.print(data[i][j] + " ");
            }
            System.out.println();
        }
    }
}
