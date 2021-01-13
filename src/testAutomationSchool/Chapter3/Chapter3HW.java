package testAutomationSchool.Chapter3;

import java.util.Scanner;

public class Chapter3HW {
    public static void main(String[] args) {
        System.out.println("How many pennies?");
        Scanner scanner = new Scanner(System.in);
        double pennies = scanner.nextDouble();
        System.out.println("How many gold coins?");
        double coins = scanner.nextDouble();
        System.out.println("How many quarters?");
        double quarters = scanner.nextDouble();



        if (pennies > 100 || coins > 10 || quarters > 4){
            System.out.println("Congrats! You've won 1$");
        }
        else {
            System.out.println("So sorry.. you don't win!");
        }
    }
}
