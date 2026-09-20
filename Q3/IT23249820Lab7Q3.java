import java.util.Scanner;

public class IT23249820Lab7Q3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        final double DISCOUNT_RATE = 0.05;

        for (int customer = 1; customer <= 5; customer++) {
            System.out.println("Customer " + customer);

            System.out.print("Enter total bill amount: ");
            double totalBill = input.nextDouble();

            System.out.print(
                "Enter mode of payment (C for cash, O for other): "
            );
            char paymentMode = input.next().charAt(0);

            if (paymentMode == 'C' || paymentMode == 'c') {
                double discount = totalBill * DISCOUNT_RATE;
                double amountToBePaid = totalBill - discount;

                System.out.println("Discount is : " + discount);
                System.out.println(
                    "Amount to be paid: " + amountToBePaid
                );
            } else if (paymentMode == 'O' || paymentMode == 'o') {
                System.out.println("No discount applicable");
                System.out.println(
                    "Amount to be paid: " + totalBill
                );
            } else {
                System.out.println("Payment Mode is Not Valid");
            }

            System.out.println();
        }

        input.close();
    }
}