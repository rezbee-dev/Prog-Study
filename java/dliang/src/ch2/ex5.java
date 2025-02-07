package ch2;

import java.util.Scanner;

public class ex5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Calculate total and gratuity amounts by entering subtotal and gratuity rate");
        System.out.print("Subtotal: ");
        double subtotal = Double.parseDouble(scanner.nextLine());
        System.out.print("Gratuity Rate (don't include %): ");
        double gRate = Double.parseDouble(scanner.nextLine());

        double gAmount = subtotal * (gRate/100);
        double total = subtotal + gAmount;
        System.out.printf("The gratuity is %.2f \nTotal is $%.2f", gAmount, total);
    }
}
