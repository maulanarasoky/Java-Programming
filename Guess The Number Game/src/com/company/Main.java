/*
Author  : Maulana Rasoky Nasution
Website : https://mul-code.blogspot.com/
 */
package com.company;

import java.util.Random;
import java.util.Scanner;

public class Main {

    static Function<Element> function = new Function<>();
    static Scanner input = new Scanner(System.in);
    static Random rand = new Random();

    public static void main(String[] args) {
        String again;
        boolean loop = true;
        play();
        while (loop) {
            System.out.print("Continue ? (Y/N) : ");
            again = input.next();
            switch (again)
        {
                case "Y":
                    function.popAll();
                    play();
                    break;
                case "y":
                    function.popAll();
                    play();
                    break;
                case "N":
                    loop = false;
                    System.out.println("\nThank You ^-^");
                    break;
                case "n":
                    loop = false;
                    System.out.println("\nThank You ^-^");
                    break;
                default:
                    System.out.println("\nSorry, your input is wrong");
                    loop = false;
                    break;
            }
        }
    }

    static void play() {
        int random = rand.nextInt(5);
        int guess;
        for (int i = 5; i >= 1; i--) {
            System.out.println("Chance - " + i);
            System.out.print("Guess : ");
            guess = input.nextInt();
            if (guess == random) {
                System.out.println("*** Correct ***\n");
                function.pushCorrect(new Element(guess));
                function.pushPoint(new Element(guess));
            } else {
                System.out.println();
            }
        }
        System.out.println("Number that were successfully guessed : " + function.size);
        System.out.println("Number that were not successfully guessed : " + (5 - function.size));
        System.out.println("Your point : " + function.point * 10);
        function.popAll();
    }
}
