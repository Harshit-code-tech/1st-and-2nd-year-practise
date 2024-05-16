package semester.lab.date_8march_24_6thlab;

import java.util.Scanner;

class HrsException extends Exception {
    public HrsException(String message) {
        super(message);
    }
}

class MinException extends Exception {
    public MinException(String message) {
        super(message);
    }
}

class SecException extends Exception {
    public SecException(String message) {
        super(message);
    }
}

class Time {
    int hours, minutes, seconds;

    public void getTime() throws HrsException, MinException, SecException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter hours:");
        hours = scanner.nextInt();
        if (hours < 0 || hours > 24)
            throw new HrsException("InvalidHourException: hour is not between 0 and 24");

        System.out.println("Enter minutes:");
        minutes = scanner.nextInt();
        if (minutes < 0 || minutes > 60)
            throw new MinException("InvalidMinuteException: minutes are not between 0 and 60");

        System.out.println("Enter seconds:");
        seconds = scanner.nextInt();
        if (seconds < 0 || seconds > 60)
            throw new SecException("InvalidSecondException: seconds are not between 0 and 60");
    }
}

public class fifth6_7 {
    public static void main(String[] args) {
        Time time = new Time();
        try {
            time.getTime();
            System.out.println("Correct Time -> " + time.hours + ":" + time.minutes + ":" + time.seconds);
        } catch (HrsException | MinException | SecException e) {
            System.out.println("Caught the exception");
            System.out.println("Exception occurred: " + e);
        }
    }
}
