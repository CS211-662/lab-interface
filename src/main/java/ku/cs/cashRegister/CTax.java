package ku.cs.cashRegister;

public class CTax implements Taxable{
    @Override
    public double calculateTax(double totalPrice) {
        if (totalPrice < 1000) {
            return totalPrice * 3 / 100;
        } else {
            return totalPrice * 5 / 100;
        }
    }
}
