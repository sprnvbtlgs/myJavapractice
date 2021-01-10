package myPackage;

public class TestMethods {
    public static void main(String[] args) {

        int a = 10;
        int b = 3;

        int sum;
        sum = getSum(a, b);
        System.out.println(sum);
        sum = getSum(15, 20);
        System.out.println(sum);
        System.out.println();

        showSum(1, 55, 77);
        System.out.println();

        saySomething();
        System.out.println();

        sayHello("Peter");
        System.out.println();

        showSumToPerson("Artyom", 7, 11, 12);

    }

    static int getSum(int x, int y) {
        int sum;
        sum = x + y;
        return sum;
    }

    static void showSum(int x, int y, int z) {
        int sum = x + y + z;
        System.out.println("Sum is " + sum);
    }

    static void saySomething(){
        System.out.println("Some words");
        System.out.println("Piu piu");
    }

    static void sayHello(String name) {
        System.out.println("Hello, " + name + " !");
        System.out.println("How are you?");
    }

    static void showSumToPerson(String name, int x, int y, int z) {
        System.out.println("Start of program");
        sayHello(name);
        saySomething();
        showSum(x, y, z);
        System.out.println("End of program");
    }
}
