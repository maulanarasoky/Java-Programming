/*
Author  : Maulana Rasoky Nasution
Website : https://mul-code.blogspot.com/
*/
package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Function heap = new Function(100);
        Scanner input = new Scanner(System.in);
        int choose, number;
        do {
            System.out.println("=========================");
            System.out.println("\t\tHEAP TREE");
            System.out.println("=========================");
            System.out.println("1. Insert Data");
            System.out.println("2. Delete Data");
            System.out.println("3. Show Data");
            System.out.println("4. Maximum number of trees");
            System.out.println("5 .Exit");
            System.out.println("=========================");
            System.out.print("Choose : ");
            choose = input.nextInt();
            System.out.println();
            switch (choose) {
                case 1:
                    System.out.print("Insert data of number : ");
                    number = input.nextInt();
                    heap.add(number);
                    break;
                case 2:
                    System.out.print("Which number do you want to delete : ");
                    number = input.nextInt();
                    heap.remove(number);
                    break;
                case 3:
                    heap.print();
                    break;
                case 4:
                    System.out.println("Max size : " + heap.maxsize);
                    break;
                case 5:
                    System.out.println("Thank You ^-^");
                    break;
                default:
                    System.out.println("The input you entered is not registered !");
                    break;
            }
            System.out.println();
        } while (choose < 5);

    }
}
