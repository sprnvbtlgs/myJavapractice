package myPackage;

public class TestExceptions {

    public static void main(String[] args) {
        devide(10, 2);
        System.out.println();
        devide(10, 0);

    }
    public static void devide(int a, int b) throws ArithmeticException{
//        try {
//            System.out.println("Result is: " + a / b);
//        } catch (ArithmeticException e) {
//            System.out.println("Problems!");
//        } finally {
//            System.out.println("Finish him!");
//        }
        if (b==0) {
            throw new ArithmeticException("Cannot devide by zero!");
        }  else {
            System.out.println("Result is: " + a / b);
        }

    }
}
