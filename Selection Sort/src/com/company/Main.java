/*
Author  : Maulana Rasoky Nasution
Website : https://mul-code.blogspot.com
*/
package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int size, swap;

        System.out.println("=============================");
        System.out.println("\t\tSELECTION SORT");
        System.out.println("=============================");
        System.out.print("Enter amount of data : ");
        size = input.nextInt();
        System.out.println();

        int [] array = new int [size];

        for (int i = 0; i < size; i++){
            System.out.print((i+1) + " - data : ");
            array[i] = input.nextInt();
        }
        System.out.println("\nData before sorting");
        for (int i = 0; i < size; i++) {
            System.out.print(array[i] + " ");
        }
        for (int i = 0; i < size; i++) {
            for (int j = i+1; j < size; j++) {
                if (array[i] > array[j]) {
                    swap = array[i];
                    array[i] = array[j];
                    array[j] = swap;
                }
            }
        }
        System.out.println("\nData after sorting Ascending");
        for (int i = 0; i < size; i++) {
            System.out.print(array[i] + " ");
        }
        for (int i = 0; i < size; i++) {
            for (int j = i+1; j < size; j++) {
                if (array[i] < array[j]) {
                    swap = array[i];
                    array[i] = array[j];
                    array[j] = swap;
                }
            }
        }
        System.out.println("\nData after sorting Descending");
        for (int i = 0; i < size; i++) {
            System.out.print(array[i] + " ");
        }
    }
}
