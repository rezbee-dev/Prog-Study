package ch2;

import java.util.Scanner;

public class ex6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number between 0 and 1000: ");
        int input = Integer.parseInt(scanner.nextLine());

        int first = input % 10;
        int second = (input / 10) % 10;
        int third = input / 100;
        int output = first + second + third;

        System.out.printf("The sum of all digits in %d is %d", input, output);
    }
}
