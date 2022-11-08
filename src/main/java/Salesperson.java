public class Salesperson {
    private int IDNumber;
    private double annual_Sales_Amount;

    public Salesperson(int IDNumber, double annual_Sales_Amount) {
        this.IDNumber = IDNumber;
        this.annual_Sales_Amount = annual_Sales_Amount;
    }
    public int getIDNumber(){
        return IDNumber;
    }
    public double getAnnual_Sales_Amount(){
        return annual_Sales_Amount;
    }
}
