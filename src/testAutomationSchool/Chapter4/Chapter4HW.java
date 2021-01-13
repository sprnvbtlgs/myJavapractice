package testAutomationSchool.Chapter4;
import java.util.Random;

public class Chapter4HW {

    public static void main(String[] args) {

        int space = 20;
        int throwCube = 5;
        int totalScore = 0;
        Random random = new Random();

        System.out.println("Welcome to Roll the Die! Let's begin...");

        for (int i = 1; i <= throwCube; i++) {
            int die = random.nextInt(6) + 1;
            totalScore = totalScore + die;

            if (totalScore == space) {
                System.out.println("Roll #" + (i) + ": You are on space " + totalScore + ". Congrats, you win!");
                break;
            } else if (totalScore > space) {
                System.out.println("Drop is " + die + ". Unfortunately, it's more than " + space);
                break;
            } else {
                System.out.println("Roll #" + (i) + ": You have rolled a " + die + ". You are now on space " + totalScore + " and have to "
                        + (space - totalScore) + " more to go");
                if (i == throwCube) {
                    System.out.println("I'm sorry. You don't win! =( ");
                }
            }
        }
    }
}

