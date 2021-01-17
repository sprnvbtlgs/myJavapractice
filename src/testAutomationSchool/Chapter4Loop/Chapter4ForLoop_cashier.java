package testAutomationSchool.Chapter4Loop;
/*
FOR LOOP:
Write a cashier program that will scan a given number of items and tally the cost
 */

import java.util.Scanner;

public class Chapter4ForLoop_cashier {

    public static void main(String[] args) {

        //Get the number of items to scan
        System.out.println("Enter the number of items would you like to scan: ");
        Scanner scanner = new Scanner(System.in);
        int quantity = scanner.nextInt();

        double total = 0;

        //Create loop to iterate through all of the items and accumulate the costs
        for (int i=0; i < quantity; i++) {
            System.out.println("Enter the cost of the item: ");
            double price = scanner.nextDouble();
            total = total + price;
        }
        scanner.close();

        System.out.println("Your total costs is $" + total);
    }
}
