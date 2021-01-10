package testAutomationSchool;

import java.util.Scanner;

public class Chapter2HW {
    public static void main(String[] args) {
        System.out.println("Enter season of the year: ");
        Scanner scanner = new Scanner(System.in);
        String seasonOfYear = scanner.next();

        System.out.println("Enter the whole number: ");
        int randomNumber = scanner.nextInt();

        System.out.println("Enter the any adjective: ");
        String randomAdj = scanner.next();
        scanner.close();

        System.out.println("On a " + randomAdj + " " + seasonOfYear
                + " day, I drink a minimum of " + randomNumber + " cups of coffee.");
    }
}
