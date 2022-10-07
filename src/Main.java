import java.util.Scanner;
public class Main
{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); //creates a new scanner
        System.out.println("Welcome to the tip calculator!");
        System.out.println("How many people are in your group?");
        int ppl = input.nextInt();
        System.out.println("What's the tip percentage? (0-100)");
        double tip = input.nextDouble();
        TipCalculator hunrgy = new TipCalculator(ppl, tip);
        double mealCost = 0;
        while (!(mealCost == -1)) {
            System.out.println("Enter a cost in dollars and cents, e.g. 12.50 (type -1 to end)");
            mealCost = input.nextDouble();
            hunrgy.addMeal(mealCost);
        }
        System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^");
        System.out.println("Total Bill Before Tip: "+ hunrgy.getTotalBeforeTip());
        System.out.println("Tip Percentage: "+hunrgy.getTipPercentage());
        System.out.println("Total Tip: "+hunrgy.tipAmount());
        System.out.println("Total Bill Before Tip: "+ hunrgy.getTotalBeforeTip());
        System.out.println("Per Person Cost Before Tip: "+hunrgy.getTotalBeforeTip());
        System.out.println("Total Cost Per Person: "+hunrgy.perPersonTotalCost());
    }
}