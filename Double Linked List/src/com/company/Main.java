/*
Author  : Maulana Rasoky Nasution
Website : https://mul-code.blogspot.com/
*/
package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int choose, index;
        String employeeId, employeeName, employeeSalary;
        Scanner input = new Scanner(System.in);
        LinkedList<Element> linked = new LinkedList<>();
        do {
            System.out.println("==============================================");
            System.out.println("\t\t   Employee Data Collection");
            System.out.println("==============================================");
            System.out.print("1. Insert First");
            System.out.println("\t\t9.  Delete Before");
            System.out.print("2. Insert Middle");
            System.out.println("\t10. Delete After");
            System.out.print("3. Insert Last");
            System.out.println("\t\t11. Search Employee Name");
            System.out.print("4. Insert Before");
            System.out.println("\t12. Search Employee ID");
            System.out.print("5. Insert After");
            System.out.println("\t\t13. Show Data");
            System.out.print("6. Delete First");
            System.out.println("\t\t14. Show Data Inverse");
            System.out.print("7. Delete Middle");
            System.out.println("\t15. Exit");
            System.out.println("8. Delete Last");
            System.out.println("===============================================");
            System.out.print("Choose : ");
            choose = input.nextInt();
            switch (choose) {
                case 1:
                    System.out.print("\nEmployee ID   : ");
                    employeeId = input.next();
                    System.out.print("Employee Name : ");
                    employeeName = input.next();
                    System.out.print("Salary        : ");
                    employeeSalary = input.next();
                    linked.insertFirst(new Element(employeeId, employeeName, employeeSalary));
                    break;
                case 2:
                    System.out.print("\nEmployee ID     : ");
                    employeeId = input.next();
                    System.out.print("Employee Name   : ");
                    employeeName = input.next();
                    System.out.print("Salary          : ");
                    employeeSalary = input.next();
                    System.out.print("Insert in index : ");
                    index = input.nextInt();
                    linked.insertMiddle(new Element(employeeId, employeeName, employeeSalary), index);
                    break;
                case 3:
                    System.out.print("\nEmployee ID   : ");
                    employeeId = input.next();
                    System.out.print("Employee Name : ");
                    employeeName = input.next();
                    System.out.print("Salary        : ");
                    employeeSalary = input.next();
                    linked.insertLast(new Element(employeeId, employeeName, employeeSalary));
                    break;
                case 4:
                    System.out.print("\nEmployee ID         : ");
                    employeeId = input.next();
                    System.out.print("Employee Name       : ");
                    employeeName = input.next();
                    System.out.print("Salary              : ");
                    employeeSalary = input.next();
                    System.out.print("Insert before index : ");
                    index = input.nextInt();
                    linked.insertBefore(new Element(employeeId, employeeName, employeeSalary), index);
                    break;
                case 5:
                    System.out.print("\nEmployee ID        : ");
                    employeeId = input.next();
                    System.out.print("Employee Name      : ");
                    employeeName = input.next();
                    System.out.print("Salary             : ");
                    employeeSalary = input.next();
                    System.out.print("Insert After index : ");
                    index = input.nextInt();
                    linked.insertAfter(new Element(employeeId, employeeName, employeeSalary), index);
                    break;
                case 6:
                    linked.deleteFirst();
                    break;
                case 7:
                    System.out.print("Delete data in index : ");
                    index = input.nextInt();
                    linked.deleteMiddle(index);
                    break;
                case 8:
                    linked.deleteLast();
                    break;
                case 9:
                    System.out.print("Delete data before index : ");
                    index = input.nextInt();
                    linked.deleteBefore(index);
                    break;
                case 10:
                    System.out.print("Delete data after index : ");
                    index = input.nextInt();
                    linked.deleteAfter(index);
                    break;
                case 11:
                    System.out.print("\nEnter the name of the employee you want to find : ");
                    employeeName = input.next();
                    linked.findEmployeename(employeeName);
                    break;
                case 12:
                    System.out.print("\nEnter the ID of the employee you want to find : ");
                    employeeId = input.next();
                    linked.findEmployeeid(employeeId);
                    break;
                case 13:
                    linked.show();
                    break;
                case 14:
                    linked.showInverse();
                    break;
                case 15:
                    System.out.println("\nThank You ^-^");
                    break;
                default:
                    System.out.println("\nSorry, the input you entered is not registered :(");
            }
            System.out.println();
        } while (choose < 15);
    }
}

