import java.time.LocalDate;
import java.util.Scanner;

/**
 * Problem: Java Date and Time
 * Domain: Java / Introduction
 * Author: Jaydeep Sahu (github.com/sahujaydeep712-cpu)
 *
 * Description:
 * Given month, day, and year, determine the day of the week in UPPERCASE
 * using modern Java time API (java.time.LocalDate).
 *
 * Time Complexity: O(1)
 * Space Complexity: O(1)
 */
public class Solution {

    /**
     * Computes the day of the week for given date components.
     *
     * @param month Month value (1 - 12)
     * @param day   Day of the month (1 - 31)
     * @param year  Year value
     * @return String representing DayOfWeek in UPPERCASE (e.g. "WEDNESDAY")
     */
    public static String findDay(int month, int day, int year) {
        LocalDate date = LocalDate.of(year, month, day);
        return date.getDayOfWeek().name();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int month = scanner.nextInt();
        int day = scanner.nextInt();
        int year = scanner.nextInt();
        scanner.close();

        System.out.println(findDay(month, day, year));
    }
}
