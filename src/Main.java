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
        System.out.printf("Total Bill Before Tip: $%.2f\n", hunrgy.getTotalBeforeTip());
        System.out.println("Tip Percentage: "+hunrgy.getTipPercentage());
        System.out.printf("Total Tip: $%.2f\n", hunrgy.tipAmount());
        System.out.printf("Total Bill With Tip: $%.2f\n", hunrgy.totalBill());
        System.out.printf("Per Person Cost Before Tip: $%.2f\n", hunrgy.getTotalBeforeTip());
        System.out.printf("Tip Per Person: $%.2f\n", hunrgy.perPersonTipAmount());
        System.out.printf("Total Cost Per Person: $%.2f\n", hunrgy.perPersonTotalCost());
    }
}