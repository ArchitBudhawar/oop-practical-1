package basic;

import java.util.Scanner;

public class Tony {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the base bill amount: ₹");
        double baseAmount = input.nextDouble();

        double GST = 0.18;
        double MAINTENANCE = 50.0;

        double gstAmount = baseAmount * GST;
        double subtotal = baseAmount + gstAmount + MAINTENANCE;

        double discountRate = (subtotal > 1000) ? 0.10 : 0.05;
        double discountAmount = subtotal * discountRate;

        double totalBill = subtotal - discountAmount;
        System.out.printf("Base Amount         : ₹%.2f\n", baseAmount);
        System.out.printf("GST (18%%)            : ₹%.2f\n", gstAmount);
        System.out.printf("Maintenance Charges : ₹%.2f\n", MAINTENANCE);
        System.out.printf("Subtotal            : ₹%.2f\n", subtotal);
        System.out.printf("Discount (%.0f%%)      : -₹%.2f\n", discountRate * 100, discountAmount);
        System.out.printf("Total Bill          : ₹%.2f\n", totalBill);

        input.close();
    }
}

