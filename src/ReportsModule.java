import java.util.*;

public class ReportsModule {

    // Generate simple sales report from invoices
    public void generateSalesReport(List<BillingModule.Invoice> invoices) {
        double totalAmount = 0;
        int paidCount = 0;
        int unpaidCount = 0;

        for (BillingModule.Invoice invoice : invoices) {
            totalAmount += invoice.amount;
            if (invoice.isPaid()) paidCount++;
            else unpaidCount++;
        }

        System.out.println("----- Sales Report -----");
        System.out.println("Total Invoices: " + invoices.size());
        System.out.println("Paid Invoices: " + paidCount);
        System.out.println("Unpaid Invoices: " + unpaidCount);
        System.out.println("Total Amount: $" + totalAmount);
    }
}

