package testAutomationSchool.Chapter5Methods;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Chapter5HW {

    static Scanner scanner = new Scanner(System.in);
    static int minutesOverPlan;
    static double priceOfMinutesOverThePlan = 0.25;
    static double taxForSubtotal = 0.15;
    static double baseCost;
    static double priceOverMin;
    static double priceT;
    static double totPrice;
    static DecimalFormat decimalFormat = new DecimalFormat(".##");

    public static void main(String[] args) {

        isBaseCostOfThePlan();
        overageMinutes();
        priceOverMinutes();
        priceTax();
        totalPrice();
        resltOfAll();
    }

    public static double isBaseCostOfThePlan(){
        System.out.println("Enter the base cost of the plan: ");
        baseCost = scanner.nextDouble();
        return baseCost;
    }

    public static int overageMinutes(){
        System.out.println("Enter overage minutes: ");
        minutesOverPlan = scanner.nextInt();
        return minutesOverPlan;
    }

    public static double priceOverMinutes(){
        priceOverMin = minutesOverPlan * priceOfMinutesOverThePlan;
        return priceOverMin;
    }

    public static double priceTax(){
        priceT = (priceOverMin + baseCost) * taxForSubtotal;
        String.format("%.2f", priceT);
        return priceT;
    }

    public static double totalPrice(){
        totPrice = priceT + baseCost + priceOverMin;
        return totPrice;
    }

    public static void resltOfAll(){
        System.out.println("Phone bill statement: $" + decimalFormat.format(baseCost));
        System.out.println("Overage: $" + decimalFormat.format(priceOverMin));
        System.out.println("Tax: $" + decimalFormat.format(priceT));
        System.out.println("Total: $" + decimalFormat.format(totPrice));
    }
}
