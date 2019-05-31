package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        BalanceChecker balanceChecker = new BalanceChecker();
        boolean loop = true, result;
        String userInput, tryAgain;
        while (loop) {
            System.out.print("Check balance : ");
            userInput = input.nextLine();
            result = balanceChecker.balanceCheck(userInput);
            if (result == false) {
                System.out.println("\nExpression " + userInput + " is not balance");
            } else {
                System.out.println("\nExpression " + userInput + " is balance");
            }
            System.out.print("\nDo you wanna try again ? ( Y / N ) : ");
            tryAgain = input.nextLine();
            switch (tryAgain) {
                case "Y":
                case "y":
                    continue;
                case "N":
                case "n":
                    loop = false;
                    System.out.println("\nBye - Bye :)");
                    break;
                default:
                    loop = false;
                    System.out.println("\nYour input is not registered");
                    break;
            }
        }
    }
}
