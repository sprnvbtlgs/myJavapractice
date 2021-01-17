package testAutomationSchool.Chapter4Loop;

import java.util.Scanner;

public class Chapter4LetterSearch {

    public static void main(String[] args) {

        //Get text
        System.out.println("Enter some text: ");
        Scanner scanner = new Scanner(System.in);
        String someText = scanner.next();
        scanner.close();

        boolean letterFound = false;

        //Search text for letter A
        for (int i=0; i<someText.length();i++){
            char currentLetter = someText.charAt(i);
            if (currentLetter == 'A' || currentLetter == 'a') {
                letterFound = true;
                break;
            }
        }
        if (letterFound){
            System.out.println("This text contains the letter 'A'");
        }
        else {
            System.out.println("This text doesn't contain the letter 'A'");
        }
    }
}
