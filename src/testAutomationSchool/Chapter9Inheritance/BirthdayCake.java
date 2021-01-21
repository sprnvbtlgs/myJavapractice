package testAutomationSchool.Chapter9Inheritance;

public class BirthdayCake extends Cake{

    protected int candles;

    public int getCandles() {
        return candles;
    }

    public void setCandles(int candles) {
        this.candles = candles;
    }

    public void Cake(int flavor){
        int total = price * flavor;
        System.out.println("The birthday cake is cost $" + total);
    }
}
