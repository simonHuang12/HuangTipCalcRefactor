public class TipCalculator {
    private int numOfPeople;
    private double tipPercentage;
    private double totalBeforeTip;

    public TipCalculator(int numOfPeople, double tipPercentage){ //constructor
        this.numOfPeople = numOfPeople;
        this.tipPercentage = tipPercentage/100;
        totalBeforeTip = 0.0;
    }
    public double getTotalBeforeTip(){ //getter
        return totalBeforeTip;
    }
    public double getTipPercentage(){ //getter
        return tipPercentage;
    }
    public void addMeal(double cost){ //adds cost to total bill
        totalBeforeTip += cost;
    }
    public double tipAmount(){ //returns tip only
        return tipPercentage*totalBeforeTip;
    }
    public double totalBill(){ //returns total bill
        return totalBeforeTip+tipAmount();
    }
    public double perPersonCostBeforeTip(){ //returns cost before tip per person
        return totalBeforeTip/numOfPeople;
    }
    public double perPersonTipAmount(){ //returns tip per person
        return tipAmount() / numOfPeople;
    }
    public double perPersonTotalCost(){ //returns total per person
        return perPersonCostBeforeTip()+perPersonTipAmount();
    }
}
