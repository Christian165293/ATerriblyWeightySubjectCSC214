package org.example;

import java.util.Scanner;


public class App {
    public static void main(String[] args) {
        Scanner scanner1 = new Scanner(System.in);
        Converter converter1 = new Converter();
        System.out.print("\nHow many ounces do you have? ");
        int userOuncesInput = scanner1.nextInt();
        System.out.println("Thank you! Converting ounces to pounds.\n");
        System.out.println(userOuncesInput + " oz is equivalent to " + converter1.toPoundsAndOunces(userOuncesInput));
        System.out.println(userOuncesInput + " oz is equivalent to " + converter1.toPounds(userOuncesInput) + "\n");
    }
}
