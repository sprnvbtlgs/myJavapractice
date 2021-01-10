package testAutomationSchool;

import java.util.Scanner;

public class Chapter4AveregeTestScores {

    public static void main(String[] args) {

        //Initialize what we known
        int numberOfStudents = 24;
        int numberOfTests = 4;

        Scanner scanner = new Scanner(System.in);


        //Process all students
        for (int i=0;i<numberOfStudents;i++){

            double total = 0;
            for (int j=0;j<numberOfTests;j++){
                System.out.println("Enter the score for test#" + (j+1));
                double score = scanner.nextDouble();
                total = total + score;
            }
            double averegeScore = total / numberOfTests;
            System.out.println("The test average for student #" + (i+1) + " is " + averegeScore);
        }
    }
}
