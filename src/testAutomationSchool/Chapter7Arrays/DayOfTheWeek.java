package testAutomationSchool.Chapter7Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class DayOfTheWeek {
    private static int numberC;
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Enter the number corresponding of the day of the week: ");
        numberC = scanner.nextInt();
        String[] dotw = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
        scanner.close();
        for (int i = 0; i<dotw.length; i++){
            if (numberC == i){
                System.out.println(dotw[i-1]);
            }
        }
    }
}
