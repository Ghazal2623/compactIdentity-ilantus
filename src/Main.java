import java.util.*;

public class Main {
    public static void main(String[] args) {
        BillingModule billing = new BillingModule();

        // Generate invoices
        billing.generateInvoice("ClientA", 1000);
        billing.generateInvoice("ClientB", 2500);

        // Record payment for one client
        billing.recordPayment("ClientA");

        // Show invoices
        billing.showInvoices();

        // Prepare list for report
        List<BillingModule.Invoice> invoicesList = new ArrayList<>(billing.invoices.values());

        // Generate reports
        ReportsModule reports = new ReportsModule();
        reports.generateSalesReport(invoicesList);
    }
}

