package threeStrings;
//Write a program that asks the user for three strings.
//
//Then, print out whether the first string
//concatenated to the second string is equal to the
//third string. Here are a few sample program runs:
//
//Sample Program 1:
//
//First string? pepper
//Second string? mint
//Third string? peppermint
//pepper + mint is equal to peppermint!
//Sample Program 2:
//
//First string? go
//Second string? fish
//Third string? donuts
//go + fish is not equal to donuts!

import java.util.Scanner;

public class ThreeStrings {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("First string? ");
        String firstString = input.nextLine();

        System.out.print("Second string? ");
        String secondString = input.nextLine();

        System.out.print("Third string? ");
        String thirdString = input.nextLine();

        input.close();
        String concString = firstString + secondString;

        if (concString.equals(thirdString)) {
            System.out.print(firstString + " + " + secondString + " is equal to " + thirdString + "!");
        } else {
            System.out.print(firstString + " + " + secondString + " is not equal to " + thirdString + "!");
        }
    }
}