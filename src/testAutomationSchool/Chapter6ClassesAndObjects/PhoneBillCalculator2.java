package testAutomationSchool.Chapter6ClassesAndObjects;

public class PhoneBillCalculator2 {

    private int idBill;
    private int numberOfMinutesUsed;
    private int numberOfAllotedMinutes;
    private double baseCost;

    private double priceOfMinutesOverThePlan = 0.25;
    private double taxForSubtotal = 0.15;

    public PhoneBillCalculator2(){
        idBill = 1;
        baseCost = 80;
        numberOfAllotedMinutes = 100;
        numberOfMinutesUsed = 30;
    }

    public PhoneBillCalculator2(int idBill){
        this.idBill = idBill;
        baseCost = 100;
        numberOfAllotedMinutes = 200;
        numberOfMinutesUsed = 450;
    }


    public PhoneBillCalculator2(int idBill, double baseCost, int numberOfAllotedMinutes, int numberOfMinutesUsed){
        this.idBill = idBill;
        this.baseCost = baseCost;
        this.numberOfAllotedMinutes = numberOfAllotedMinutes;
        this.numberOfMinutesUsed = numberOfMinutesUsed;
    }

    public int getId(){
        return idBill;
    }

    public void setId(int idBill){
        this.idBill = idBill;
    }

    public double getBaseCost(){
        return baseCost;
    }

    public void setBaseCost(double baseCost){
        this.baseCost = baseCost;
    }

    public int getAllotedMinutes(){
        return numberOfAllotedMinutes;
    }

    public void setAllotedMinutes(int numberOfAllotedMinutes){
        this.numberOfAllotedMinutes = numberOfAllotedMinutes;
    }

    public int getNumberOfMinutesUsed(){
        return numberOfMinutesUsed;
    }

    public void setUsedMinutes(int numberOfMinutesUsed){
        this.numberOfMinutesUsed = numberOfMinutesUsed;
    }

    public double calculateOverage(){
        double overageMinutes;
        if (numberOfMinutesUsed > numberOfAllotedMinutes){
            return overageMinutes = numberOfMinutesUsed - numberOfAllotedMinutes;
        }
        return 0;
    }

    public double billOverMinutes(){
        double priceOverMin = calculateOverage() * priceOfMinutesOverThePlan;
        return priceOverMin;
    }

    public double billOfTax(){
        if (numberOfMinutesUsed > numberOfAllotedMinutes){
            double priceT = taxForSubtotal * (billOverMinutes() + baseCost);
            return priceT;
        }
        return 0;
    }

    public double totalPrice(){
        double totPrice = billOfTax() + baseCost + billOverMinutes();
        return totPrice;
    }

    public void resultOfAll(){
        System.out.println("id: " + idBill);
        System.out.println("Phone bill statement: $" + baseCost);
        System.out.println("Overage: $" + String.format("%.2f", billOverMinutes()));
        System.out.println("Tax: $" + String.format("%.2f", billOfTax()));
        System.out.println("Total: $" + String.format("%.2f", totalPrice()));
    }

}
