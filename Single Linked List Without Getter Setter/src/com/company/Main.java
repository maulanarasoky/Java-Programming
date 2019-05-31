/*
Author  : Maulana Rasoky Nasution
Website : https://mul-code.blogspot.com/
*/
package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String employeeId, employeeName, refId;
        int choose;
        Scanner input = new Scanner(System.in);
        Function function = new Function();
        do {
            System.out.println("====== Employee List ======");
            System.out.println("1. Insert First");
            System.out.println("2. Insert Middle");
            System.out.println("3. Insert Last");
            System.out.println("4. Delete First");
            System.out.println("5. Delete Middle");
            System.out.println("6. Delete Last");
            System.out.println("7. Show Data");
            System.out.println("8. Exit");
            System.out.println("===========================");
            System.out.print("Choose : ");
            choose = input.nextInt();
            switch (choose) {
                case 1:
                    System.out.print("Employee Id   : ");
                    employeeId = input.next();
                    System.out.print("Employee Name : ");
                    employeeName = input.next();
                    function.insertFirst(employeeId, employeeName);
                    break;
                case 2:
                    System.out.print("Employee Id       : ");
                    employeeId = input.next();
                    System.out.print("Employee Name     : ");
                    employeeName = input.next();
                    System.out.print("After Employee Id : ");
                    refId = input.next();
                    function.insertMiddle(employeeId, employeeName, refId);
                    break;
                case 3:
                    System.out.print("Employee Id   : ");
                    employeeId = input.next();
                    System.out.print("Employee Name : ");
                    employeeName = input.next();
                    function.insertLast(employeeId, employeeName);
                    break;
                case 4:
                    function.deleteFirst();
                    break;
                case 5:
                    System.out.print("Which Employee Id : ");
                    refId = input.next();
                    function.deleteMiddle(refId);
                    break;
                case 6:
                    function.deleteLast();
                    break;
                case 7:
                    function.show();
                    break;
                case 8:
                    System.out.println("\nThank You ^-^");
                    break;
                default:
                    System.out.println("\nSorry, the input you entered is not registered :(");
                    break;
            }
            System.out.println();
        } while (choose < 8);
    }
}
