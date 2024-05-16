package semester.lab;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.Scanner;

public class third {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the day number of the current month: ");
        int dayNumber = sc.nextInt();
        sc.close();

        LocalDate currentDate = LocalDate.now();
        LocalDate targetDate = currentDate.withDayOfMonth(dayNumber);
        DayOfWeek dayOfWeek = targetDate.getDayOfWeek();

        String weekDay = switch (dayOfWeek) {
            case MONDAY -> "Monday";
            case TUESDAY -> "Tuesday";
            case WEDNESDAY -> "Wednesday";
            case THURSDAY -> "Thursday";
            case FRIDAY -> "Friday";
            case SATURDAY -> "Saturday";
            case SUNDAY -> "Sunday";
            default -> "Invalid day";
        };

        System.out.println("The week day for day number " + dayNumber + " of the current month is: " + weekDay);
    }
}
