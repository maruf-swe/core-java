package forloops;

public class ForLoopsInsideWhileLoops {
    public static void main(String[] args) {
        int totalCustomers = 10; // Total customers to be served
        int customersServed = 0; // Track the number of customers served
        int batchSize = 3;       // Max customers per batch

        System.out.println("Shop Simulation Started:");

        while (customersServed < totalCustomers) {
            System.out.println("New batch processing...");

            // Process a batch of customers
            for (int i = 1; i <= batchSize; i++) {
                if (customersServed >= totalCustomers) {
                    break; // Stop if all customers are served
                }
                customersServed++;
                System.out.println("  Serving customer #" + customersServed);
            }

            System.out.println("Batch completed. Customers served so far: " + customersServed);
            System.out.println("-----------------------------------------");
        }

        System.out.println("Shop is closed. All customers have been served!");
    }
}
