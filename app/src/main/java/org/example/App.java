package org.example;

import java.util.Scanner;


public class App {
    public static void main(String[] args) {
        Scanner scanner1 = new Scanner(System.in);
        System.out.print("\nHow many ounces do you have? ");
        int userOuncesInput = scanner1.nextInt();
        System.out.println("Thank you! Converting ounces to pounds.\n");
        System.out.println(userOuncesInput + " oz is equivalent to " + Converter.toPoundsAndOunces(userOuncesInput));
        System.out.println(userOuncesInput + " oz is equivalent to " + Converter.toPounds(userOuncesInput) + "\n");
    }
}
