/*
Author  : Maulana Rasoky Nasution
Website : https://mul-code.blogspot.com/
*/
package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Function function = new Function();
        int choose, data, delete;
        do {
            System.out.println("==================================");
            System.out.println("\t\tBINARY SEARCH TREE");
            System.out.println("==================================");
            System.out.println("1. Insert Data");
            System.out.println("2. Transverse using PreOrder");
            System.out.println("3. Transverse using InOrder");
            System.out.println("4. Transverse using PostOrder");
            System.out.println("5. Delete Data");
            System.out.println("6. Exit");
            System.out.println("==================================");
            System.out.print("Choose : ");
            choose = input.nextInt();
            switch (choose) {
                case 1:
                    System.out.print("Insert data : ");
                    data = input.nextInt();
                    function.insert(data);
                    break;
                case 2:
                    System.out.print("Transverse using PreOrder : ");
                    function.printPreOrder();
                    System.out.println();
                    break;
                case 3:
                    System.out.print("Transverse using InOrder : ");
                    function.printInOrder();
                    System.out.println();
                    break;
                case 4:
                    System.out.print("Transverse using PostOrder : ");
                    function.printPostOrder();
                    System.out.println();
                    break;
                case 5:
                    System.out.print("Delete data : ");
                    delete = input.nextInt();
                    function.remove(delete);
                    break;
                case 6:
                    System.out.println("\nThank You ^-^");
                    break;
                default:
                    System.out.println("\nYour input is not registered");
                    break;
            }
            System.out.println();
        } while (choose < 6);
    }
}
