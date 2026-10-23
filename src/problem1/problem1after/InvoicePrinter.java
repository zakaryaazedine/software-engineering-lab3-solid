package problem1.problem1after;

public final class InvoicePrinter{
    private final InvoiceCalculator calculator;

    public InvoicePrinter(InvoiceCalculator calculator){
        this.calculator = calculator;
    }

    public String print(InvoiceData invoice){
        StringBuilder sb = new StringBuilder();
        sb.append("Invoice for ").append(invoice.getCustomer()).append("\n");
        for (int i = 0; i < invoice.getLines().size(); i++) sb.append(line(invoice.getLines().get(i).item(), invoice.getLines().get(i).price()));
        sb.append(line("Subtotal", calculator.subtotal(invoice)));
        sb.append(line("TOTAL", calculator.total(invoice)));
        return sb.toString();
    }

    private String line(String label, double value){
        return String.format("%-12s %8.2f%n", label, value);
    }
}
