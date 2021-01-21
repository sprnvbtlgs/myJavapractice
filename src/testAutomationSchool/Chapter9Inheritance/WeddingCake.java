package testAutomationSchool.Chapter9Inheritance;

public class WeddingCake extends Cake {

    protected int tiers;

    public int getTiers() {
        return tiers;
    }

    public void setTiers(int tiers) {
        this.tiers = tiers;
    }

    public void Cake(int flavor){
        int total = price * flavor;
        System.out.println("The wedding cake is cost $" + total);
    }
}
