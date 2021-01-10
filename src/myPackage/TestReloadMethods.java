package myPackage;

public class TestReloadMethods {

    public static void main(String[] args) {
        System.out.println(getSum(1, 5, 7));
    }

    static int getSum(int x, int y) {
        int sum;
        sum = x + y;
        return sum;
    }

    static int getSum(int x, int y, int z) {
        int sum;
        sum = x + y + z;
        return sum;
    }
    static void sayHello(String name) {
        System.out.println("Hello, " + name + " !");
        System.out.println("How are you?");
    }
}
