/*
Author  : Maulana Rasoky Nasution
Website : https://mul-code.blogspot.com/
*/
package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Function<Element> function = new Function<>();
        String name, order;
        int total, choose;
        do {
            System.out.println("=====================================");
            System.out.println("\t\t   MUL MINIMARKET");
            System.out.println("=====================================");
            System.out.println("1. Input Queue");
            System.out.println("2. Queue List");
            System.out.println("3. Queue Process");
            System.out.println("4. First Queue");
            System.out.println("5. Exit");
            System.out.println("=====================================");
            System.out.print("Choose : ");
            choose = input.nextInt();
            switch (choose) {
                case 1:
                    System.out.print("\nName        : ");
                    name = input.next();
                    System.out.print("Order       : ");
                    order = input.next();
                    System.out.print("Total       : ");
                    total = input.nextInt();
                    function.inputQueue(new Element(name, order, total));
                    break;
                case 2:
                    System.out.println("Number of queues : " + function.size);
                    function.queueList();
                    break;
                case 3:
                    function.queueProcess();
                    break;
                case 4:
                    function.queueFirst();
                    break;
                case 5:
                    System.out.println("\nThank You ^-^");
                    break;
                default:
                    System.out.println("\nYour input is wrong");
                    break;
            }
            System.out.println();
        } while (choose < 5);
    }
}
