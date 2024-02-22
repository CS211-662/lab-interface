package ku.cs.cashRegister;

public class CashRegister {
    private double totalPrice;

    public CashRegister(double totalPrice) {
        this.totalPrice = totalPrice;
    }

    public double getNetPrice(Taxable taxable) {
        return totalPrice + taxable.calculateTax(totalPrice);
    }

}
