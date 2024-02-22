package ku.cs.printer;

public class LaserPrinter implements Printable {
    @Override
    public void print(String[] document) {
        // Simulate process of Ink Jet Printer
        System.out.println("Feed paper");
        System.out.println("Setup for Laser Printer");

        for (String data : document) {
            System.out.println(data);
        }
    }
}
