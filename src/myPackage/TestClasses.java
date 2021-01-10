package myPackage;

public class TestClasses {

    public static void main(String[] args) {

        Car car1 = new Car();
        car1.color = "Red";
        car1.length = 5;
        car1.height = 2;
        car1.width = 2;

        car1.addWeight(50);
        car1.drive(120);
        System.out.println();

        car1.addWeight(700);
        car1.drive(100);
        System.out.println();

        Car car2 = new Car();
        Car car3 = new Car();

        car2.addWeight(1000);
        car2.drive(100);

    }
}
