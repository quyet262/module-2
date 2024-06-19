package ss9.bai_tap.next_day_calculator;

public class NextDayCalculator {
    public static String nextDayCalculator(int day, int month, int year) {
        if (day == theLastDayOfTheMonth(month, year)) {
            day = 1;
            if (month == 12) {
                month = 1;
                year++;
            } else {
                month++;
            }
        } else {
            day++;
        }
        return day + "-" + month + "-" + year;

    }

    public static int theLastDayOfTheMonth(int month, int year) {
        switch (month) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                return 31;
            case 2:
                return theLastDayOfTheMonth2(year);
        }
        return 30;
    }

    public static int theLastDayOfTheMonth2(int year) {
        if (isLeapYear(year)) {
            return 29;
        }
        return 28;
    }

    private static boolean isLeapYear(int year) {
        return yearIsDivisibleBy4(year) && yearIsDivisibleBy100(year) || yearIsDivisibleBy400(year);
    }

    private static boolean yearIsDivisibleBy400(int year) {
        return year % 400 == 0;
    }

    private static boolean yearIsDivisibleBy100(int year) {
        return year % 100 != 0;
    }

    private static boolean yearIsDivisibleBy4(int year) {
        return year % 4 == 0;
    }
}
