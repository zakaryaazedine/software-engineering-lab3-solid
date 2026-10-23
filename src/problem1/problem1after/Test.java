package problem1.problem1after;

import java.io.IOException;
import java.util.List;

public class Test{
    public static void main(String[] args) throws IOException{
        InvoiceData invoice = new InvoiceData("ALAMI Samir", List.of(
                new InvoiceLine("Laptop", 9000),
                new InvoiceLine("Mouse", 150),
                new InvoiceLine("USB cable", 50)
        ));

        InvoiceCalculator calculator = new InvoiceCalculator();
        InvoicePrinter printer = new InvoicePrinter(calculator);
        InvoiceRepository repository = new InvoiceRepository(printer);

        System.out.print(printer.print(invoice));
        repository.save(invoice);
    }
}
