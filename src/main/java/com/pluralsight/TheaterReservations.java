package com.pluralsight;

import java.util.Scanner;

public class TheaterReservations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Please enter your name: ");
        String name = scanner.nextLine();
        System.out.print("What date will you be coming? (MM/dd/yyyy): ");
        String date = scanner.nextLine();
        System.out.print("How many tickets would you like? ");
        int numTickets = scanner.nextInt();

        String[] splitName = name.split(" ");
        String firstName = splitName[0];
        String lastName = splitName[1];

        // Convert date here

        String tix = numTickets + " tickets";

        if (numTickets == 1) {
            tix = numTickets + " ticket";
        }

        System.out.println(tix + " reserved for " + date + " under " + lastName + ", " + firstName);
    }
}
