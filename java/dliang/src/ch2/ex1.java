package ch2;

import java.util.Scanner;

public class ex1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter in Celsius value: ");
        String input = scanner.nextLine();

        double cTemp = Double.parseDouble(input);
        double fTemp = (9.0/5) * cTemp + 32;

        System.out.printf("Fahrenheit Value: %.1f", fTemp);
    }
}
