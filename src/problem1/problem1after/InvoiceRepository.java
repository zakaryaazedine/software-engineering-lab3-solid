package problem1.problem1after;

import java.io.FileWriter;
import java.io.IOException;

public final class InvoiceRepository{
    private final InvoicePrinter printer;

    public InvoiceRepository(InvoicePrinter printer){
        this.printer = printer;
    }

    public void save(InvoiceData invoice) throws IOException{
        try (FileWriter writer = new FileWriter(invoice.getCustomer() + ".txt")){
            writer.write(printer.print(invoice));
        }
    }
}
