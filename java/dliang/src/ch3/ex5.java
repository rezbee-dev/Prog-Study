// Can improve by including more error handling and better formatting

package ch3;

import java.util.Scanner;

public class ex5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the day today: ");
        String dayInput = scanner.nextLine();
        System.out.print("Enter the number of days elapsed: ");
        int numDaysInput = Integer.parseInt(scanner.nextLine());

        int futureDayPosition = (DAY.valueOf(dayInput).ordinal() + numDaysInput) % 6;
        String futureDay = DAY.values()[futureDayPosition].name();

        System.out.printf("The future day is %s",futureDay);
    }

    enum DAY {
        SUNDAY,
        MONDAY,
        TUESDAY,
        WEDNESDAY,
        THURSDAY,
        FRIDAY,
        SATURDAY;
    }
}
