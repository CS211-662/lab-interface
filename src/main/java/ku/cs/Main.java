package ku.cs;

import ku.cs.printer.InkJetPrinter;
import ku.cs.printer.LaserPrinter;
import ku.cs.printer.Printer;

public class Main {
    public static void main(String[] args) {
        String[] document = new String[3];
        document[0] = "FIRST LINE";
        document[1] = "SECOND LINE";
        document[2] = "LAST LINE";

//        InkJetPrinter inkJetPrinter = new InkJetPrinter();
        Printer.print(new LaserPrinter(), document);
    }
}