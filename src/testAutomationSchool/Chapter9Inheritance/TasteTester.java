package testAutomationSchool.Chapter9Inheritance;

public class TasteTester {

    public static void main(String[] args) {

        Cake cake = new Cake();
        BirthdayCake birthdayCake = new BirthdayCake();
        WeddingCake weddingCake = new WeddingCake();

        birthdayCake.Cake(5);
        weddingCake.Cake(11);

    }
}
