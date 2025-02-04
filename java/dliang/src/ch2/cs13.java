package ch2;

public class cs13 {
    public static void main(String[] args) {
        // Get milliseconds elapsed since unix epoch time
        long milliSeconds = System.currentTimeMillis();

        // Convert total elapsed milliseconds into total seconds, minutes, hours
        // Note: integer division results in truncated values
        long seconds = milliSeconds / 1000;
        long minutes = seconds / 60;
        long hours = minutes / 60;

        // Use modulo to derive current times
        //   modulo works with the remainder that is left over from integer division
        int currentSecond = (int) seconds % 60;
        int currentMinute = (int) minutes % 60;
        int currentHour = (int) hours % 24;

        System.out.printf("Current time is: %d:%d:%d GMT", currentHour,currentMinute,currentSecond);
    }
}
