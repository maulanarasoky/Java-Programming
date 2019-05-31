/*
Author    : Maulana Rasoky Nasution
Website   : https://mul-code.blogspot.com/ 
*/
package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String employeeId, employeeName;
        int choose;
        Scanner input = new Scanner(System.in);
        LinkedList<Element> linked = new LinkedList<>();
        do {
            System.out.println("====== Employee List ======");
            System.out.println("1. Insert First");
            System.out.println("2. Insert Last");
            System.out.println("3. Show Data");
            System.out.println("4. Exit");
            System.out.println("===========================");
            System.out.print("Choose : ");
            choose = input.nextInt();
            switch (choose) {
                case 1:
                    System.out.print("Employee Id : ");
                    employeeId = input.next();
                    System.out.print("Employee Name : ");
                    employeeName = input.next();
                    linked.insertFirst(new Element(employeeId, employeeName));
                    break;
                case 2:
                    System.out.print("Employee Id : ");
                    employeeId = input.next();
                    System.out.print("Employee Name : ");
                    employeeName = input.next();
                    linked.insertLast(new Element(employeeId, employeeName));
                    break;
                case 3:
                    linked.show();
                    break;
                case 4:
                    System.out.println("Thank You ^-^");
                    break;
                default:
                    System.out.println("\nSorry, the input you entered is not registered :(");
                    break;
            }
            System.out.println();
        } while (choose < 4);
    }
}
