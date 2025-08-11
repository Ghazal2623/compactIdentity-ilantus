import java.util.*;

public class BillingModule {
    private Map<String, Invoice> invoices = new HashMap<>();

    // Generate invoice for a client
    public Invoice generateInvoice(String clientId, double amount) {
        Invoice invoice = new Invoice(clientId, amount, new Date(), false);
        invoices.put(clientId, invoice);
        System.out.println("Invoice generated for client: " + clientId + " Amount: " + amount);
        return invoice;
    }

    // Track payment for invoice
    public void recordPayment(String clientId) {
        Invoice invoice = invoices.get(clientId);
        if (invoice != null && !invoice.isPaid()) {
            invoice.setPaid(true);
            System.out.println("Payment recorded for client: " + clientId);
        } else {
            System.out.println("No unpaid invoice found for client: " + clientId);
        }
    }

    // Display all invoices
    public void showInvoices() {
        System.out.println("----- All Invoices -----");
        for (Invoice invoice : invoices.values()) {
            System.out.println(invoice);
        }
    }

    // Invoice inner class
    static class Invoice {
        private String clientId;
        private double amount;
        private Date invoiceDate;
        private boolean paid;

        public Invoice(String clientId, double amount, Date invoiceDate, boolean paid) {
            this.clientId = clientId;
            this.amount = amount;
            this.invoiceDate = invoiceDate;
            this.paid = paid;
        }

        public boolean isPaid() {
            return paid;
        }

        public void setPaid(boolean paid) {
            this.paid = paid;
        }

        @Override
        public String toString() {
            return "Invoice [ClientID=" + clientId + ", Amount=" + amount + ", Date=" + invoiceDate + ", Paid=" + paid + "]";
        }
    }
}

