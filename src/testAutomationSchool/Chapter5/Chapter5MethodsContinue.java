package testAutomationSchool.Chapter5;

/*
* write an "instant credit check" program that approves anyone who makes
* more than $25000 and has a credit score of 700 or better. Reject all others.
 */

import java.util.Scanner;

public class Chapter5MethodsContinue {

    static int requiredSalary = 25000;
    static int requiredCreditScore = 700;
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        //Initialize what we know


        //Get what we unknown
        double sal = getSalary();
        double cscore = getCurrentCreditScore();
        scanner.close();

        //Check of the user is qualified
        boolean qualified = isUserQualified(cscore, sal);

        //Notify the user
        notifyUser(qualified);
    }
    public static double getCurrentCreditScore(){

        System.out.println("Enter your current credit score: ");
        double currentCreditScore = scanner.nextDouble();

        return currentCreditScore;
    }

    public static double getSalary(){

        System.out.println("Enter your current salary: ");
        double currentSalary = scanner.nextDouble();
        return currentSalary;
    }

    public static boolean isUserQualified(double currentCreditScore, double currentSalary){
        if (currentCreditScore >= requiredCreditScore && currentSalary >= requiredSalary) {
            return true;
        }
        else{
            return false;
        }
    }

    public static void notifyUser(boolean isQualified) {
        if (isQualified){
            System.out.println("Congrats! You have been approved!");
        }
        else {
            System.out.println("Sorry! You've been diclined");
        }
    }
}
