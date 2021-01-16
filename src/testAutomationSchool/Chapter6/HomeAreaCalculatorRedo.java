package testAutomationSchool.Chapter6;

import java.util.Scanner;

public class HomeAreaCalculatorRedo {

    private Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        /*
        * getRoom() don't be used as non-static method can't referenced from static context(main).
        * So if don't want to make static getRoom() method - we would have to instantiate
        * the very class that we are in, just so that we could get the things that are not static within this class.
        * it’s a blank constructor that does nothing.
        * So we have to build <ClassName> <object name> = new <ClassName>; and then
        * we addition obj.name to methods;
         */

        HomeAreaCalculatorRedo calculatorRedo = new HomeAreaCalculatorRedo();
        Rectangle kitchen = calculatorRedo.getRoom();
        Rectangle bathroom = calculatorRedo.getRoom();

        double area = calculatorRedo.calculateTotalArea(kitchen, bathroom);

        System.out.println("The total area is: " + area);

        /*
        * scanner is not static, so it cannot be used directly in static main.
        * So we use calculatorRedo in order to scanner has accessed
         */
        calculatorRedo.scanner.close();

    }

    public Rectangle getRoom(){

        System.out.println("Enter the length of your room: ");
        double length = scanner.nextDouble();

        System.out.println("Enter the width of your room: ");
        double width = scanner.nextDouble();

        /*
        * String below there is equal
        * Rectangle room1 = new Rectangle(length, width)
        * But we will not use value 'room1'. We need simply return length and width without store this.
         */
        return new Rectangle(length, width);
    }

    public double calculateTotalArea(Rectangle rectangle1, Rectangle rectangle2){
        return rectangle1.calculateArea() + rectangle2.calculateArea();
    }
}
