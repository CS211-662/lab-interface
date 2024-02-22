package ku.cs.cashRegister;

public class ThailandTax implements Taxable {

    @Override
    public double calculateTax(double totalPrice) {
        return totalPrice * 7 / 100;
    }
}
