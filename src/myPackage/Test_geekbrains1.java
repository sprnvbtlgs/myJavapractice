package myPackage;

import java.util.Scanner;

public class Test_geekbrains1 {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
//        System.out.println("Enter the number: ");
//        Scanner scanner = new Scanner(System.in);
//        int a = scanner.nextInt();
//        System.out.println("A = " + a);

        //calculator
//        System.out.println("Enter the operation: ");
//        System.out.println("1, Addition/sum");
//        System.out.println("2, Subtraction/minus");
//        System.out.println("3, Multiplication/Times");
//        System.out.println("4, Division/Divided by");
//        Scanner scanner = new Scanner(System.in);
//        int operation = scanner.nextInt();
//        System.out.println("Enter the first number: ");
//        int a = scanner.nextInt();
//        System.out.println("Enter the second number: ");
//        int b = scanner.nextInt();
//        double result = 0;
//        if (operation == 1) {
//            result = a + b;
//        } else if(operation == 2) {
//            result = a - b;
//        } else if(operation == 3) {
//            result = a * b;
//        } else if(operation == 4) {
//            result = a / b;
//        }
//        System.out.println("Result is " + result);

//        GUESS THE RANDOM NUMBER

        System.out.println("Your goal - guess the number");
        for(int i = 10; i <= 30; i += 10) playLevel(i);
        System.out.println("You're win!");
        scanner.close();
    }

    private static void playLevel(int range) {
        int number = (int) (Math.random() * range);
        while(true) {
            System.out.println("Guess the number from 1 to " + range);
            int input_number = scanner.nextInt();
            if(input_number == number) {
                System.out.println("You're brilliant, dude!");
                break;
            } else if(input_number > number) {
                System.out.println("Unfortunately - your number is more");
            } else {
                System.out.println("Unfortunately - your number is less");
            }
        }
    }

}
