import java.util.Scanner;

public class IT24100860Lab7Q3 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Variables to store bill and discount
        double bill, discount;
        char paymentMode;

        // Loop for 5 customers
        for (int customer = 1; customer <= 5; customer++) {
            System.out.println("Customer " + customer);

            // Input the total bill amount
            System.out.print("Enter total bill amount: ");
            bill = scanner.nextDouble();

            // Input the mode of payment
            System.out.print("Enter mode of payment (C for cash, O for other): ");
            paymentMode = scanner.next().charAt(0);

            // Check the payment mode and apply the discount if it's cash
            if (paymentMode == 'C' || paymentMode == 'c') {
                discount = bill * 0.05;
                bill -= discount; // Subtract the discount from the bill
                System.out.println("Discount applied: " + discount);
            } else if (paymentMode == 'O' || paymentMode == 'o') {
                System.out.println("No discount applied.");
            } else {
                System.out.println("Payment mode is not valid.");
                continue; // Skip to the next customer if payment mode is invalid
            }

            // Display the final amount to be paid
            System.out.println("Amount to be paid: " + bill);
            System.out.println(); // Blank line for better readability
        }

        scanner.close();
    }
}

