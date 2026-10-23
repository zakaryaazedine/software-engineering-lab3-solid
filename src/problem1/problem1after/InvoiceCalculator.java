package problem1.problem1after;

public final class InvoiceCalculator{
    public double subtotal(InvoiceData invoice){
        double sum = 0;
        for (int i = 0; i < invoice.getLines().size(); i++) sum += invoice.getLines().get(i).price();
        return sum;
    }

    public double total(InvoiceData invoice){
        return subtotal(invoice) * 1.20;
    }
}
