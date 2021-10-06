package comp.comp152;

public abstract class Employee {

    public void fileW2Forms(){
        System.out.println("Here are your W2 Tax Forms");
    }

    public void WithholdTaxes(){
        System.out.println("Removing 25% of your pay for taxes");
    }

    public abstract double calculateBiWeeklyPay();
}
