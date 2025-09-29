package com.pluralsight;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        System.out.println("Important: Just click enter if it doesn't apply to you");
        System.out.print("Enter First Name: ");
        String firstName = keyboard.nextLine();

        System.out.print("Enter Middle Initial: ");
        String middleName = keyboard.nextLine();

        System.out.print("Enter Last Name: ");
        String lastName = keyboard.nextLine();

        System.out.print("Enter Suffix (N/A): ");
        String suffix = keyboard.nextLine();

        if (middleName.equals("") && suffix.equals("")) {
            System.out.printf("%s %s \n ", firstName.trim(), lastName.trim());
        } else if (middleName.equals("")) {
            System.out.printf("%s %s %s \n ", firstName.trim() , lastName.trim(), suffix.trim());
        } else if (suffix.equals("")) {
            System.out.printf("%s %s %s \n ", firstName.trim(), middleName.trim(), lastName.trim());
        } else {
            System.out.printf("%s %s %s %s \n ", firstName.trim(), middleName.trim(), lastName.trim(), suffix);
        }
    }
}
