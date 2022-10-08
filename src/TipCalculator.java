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
    public int getTipPercentage(){ //getter
        return (int)tipPercentage*100;
    }
    public void addMeal(double cost){ //adds cost to total bill
        double addCost = cost;
        if (cost == -1){
            addCost = 0;
        }
        totalBeforeTip += addCost;
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
