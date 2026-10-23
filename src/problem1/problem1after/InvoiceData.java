package problem1.problem1after;

import java.util.List;

public final class InvoiceData{
    private final String customer;
    private final List<InvoiceLine> lines;

    public InvoiceData(String customer, List<InvoiceLine> lines){
        this.customer = customer;
        this.lines = List.copyOf(lines);
    }

    public String getCustomer(){
        return customer;
    }

    public List<InvoiceLine> getLines(){
        return lines;
    }
}
