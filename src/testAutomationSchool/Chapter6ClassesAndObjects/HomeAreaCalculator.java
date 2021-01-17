package testAutomationSchool.Chapter6ClassesAndObjects;

public class HomeAreaCalculator {

    public static void main(String[] args) {

        /*
        *RECTANGLE1*
         */

        //Create instance of rectangle class
        Rectangle room1 = new Rectangle();
        room1.setWidth(25);
        room1.setLength(50);
        double areaOfRoom1 = room1.calculateArea();

        /*
        *RECTANGLE2*
         */
        Rectangle room2 = new Rectangle(30,75);
        double areaOfRoom2 = room2.calculateArea();

        double totalArea = areaOfRoom1 + areaOfRoom2;
        System.out.println("Area of both rooms: " + totalArea);
    }
}
