package ku.cs;

import ku.cs.cashRegister.BTax;
import ku.cs.cashRegister.CTax;
import ku.cs.cashRegister.CashRegister;
import ku.cs.cashRegister.ThailandTax;

public class MainCashRegister {
    public static void main(String[] args) {
        CashRegister cashRegister = new CashRegister(999);

        System.out.println(cashRegister.getNetPrice(new CTax()));
    }
}
