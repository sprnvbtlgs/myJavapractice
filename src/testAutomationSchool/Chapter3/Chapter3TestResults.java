package testAutomationSchool.Chapter3;

/*
 * IF-ELSE-IF
 * Display the letter grade for a student based on their test score.
 */

import java.util.Scanner;

public class Chapter3TestResults {

    public static void main(String[] args) {
        //Get the test score
        System.out.println("Enter your test score");
        Scanner scanner = new Scanner(System.in);
        double testScore = scanner.nextDouble();
        scanner.close();

        //Determine the letter grade
        char grade;

        if (testScore < 60){
            grade = 'F';
        }
        else if (testScore < 70){
            grade = 'D';
        }
        else if (testScore < 80) {
            grade = 'C';
        }
        else if (testScore < 90){
            grade = 'B';
        }
        else {
            grade = 'A';
        }
        System.out.println("Your grade is " + grade + " !");
    }
}
