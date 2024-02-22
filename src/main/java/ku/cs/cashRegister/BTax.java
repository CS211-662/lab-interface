package ku.cs.cashRegister;

public class BTax implements Taxable {

    @Override
    public double calculateTax(double totalPrice) {
        if (totalPrice < 100) {
            return 0;
        } else {
            return totalPrice * 5 / 100;
        }
    }
}
