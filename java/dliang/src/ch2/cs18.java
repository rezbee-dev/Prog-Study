package ch2;

import java.util.Scanner;

public class cs18 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter an amount in double, for example 11.56");
        System.out.print("Input: ");
        String input = scanner.nextLine();
        double amount = Double.parseDouble(input);

        // Convert to pennies
        int totalPennies = (int)(amount * 100);

        // Derive denominational values
        int dollars = totalPennies/100;
        totalPennies = totalPennies % 100;
        int quarters = totalPennies/25;
        totalPennies = totalPennies % 25;
        int dimes = totalPennies/10;
        totalPennies = totalPennies % 10;
        int nickels = totalPennies/5;
        totalPennies = totalPennies % 5;

        // Another way to solve?
//        int dollars = totalPennies/100;
//        totalPennies -= (dollars * 100);
//        int quarters = totalPennies/25;
//        totalPennies -= (quarters * 25);
//        int dimes = totalPennies/10;
//        totalPennies -= (dimes * 10);
//        int nickels = totalPennies/5;
//        totalPennies -= (nickels * 5);

        System.out.printf("Original input: %.2f\n%d dollars, %d quarters, %d dimes, %d nickels, %d pennies",
                amount, dollars, quarters, dimes, nickels, totalPennies);
    }
}
