package ss9.bai_tap.next_day_calculator;

import org.junit.jupiter.api.Test;

public class NextDayCalculatorTest {
    @Test
    void testNormalDay() {
        int day = 1;
        int month = 1;
        int year = 2018;
        String expected = 2 + "-" + 1 + "-" + 2018;
        String result = NextDayCalculator.nextDayCalculator(day, month, year);
        assert expected.equals(result);
    }

    @Test
    void tesTheLastDayOfThe31DayMonth() {
        int day = 31;
        int month = 1;
        int year = 2018;
        String expected = 1 + "-" + 2 + "-" + 2018;
        String result = NextDayCalculator.nextDayCalculator(day, month, year);
        assert expected.equals(result);
    }
    @Test
    void testTheLastDayOfThe30DayMonth(){
        int day = 30;
        int month = 4;
        int year = 2018;
        String expected = 1 + "-" + 5 + "-" + 2018;
        String result = NextDayCalculator.nextDayCalculator(day, month, year);
        assert expected.equals(result);
    }
    @Test
    void testFebruaryOfTheYearDoesNotLeap(){
        int day = 28;
        int month = 2;
        int year = 2018;
        String expected = 1 + "-" + 3 + "-" + 2018;
        String result = NextDayCalculator.nextDayCalculator(day, month, year);
        assert expected.equals(result);
    }
    @Test
    void testFebruaryOfLeapYear(){
        int day = 29;
        int month = 2;
        int year = 2020;
        String expected = 1 + "-" + 3 + "-" + 2020;
        String result = NextDayCalculator.nextDayCalculator(day, month, year);
        assert expected.equals(result);
    }
    @Test
    void testTheLastDay(){
       int day = 31;
       int month = 12;
       int year = 2018;
       String expected = 1 + "-" + 1 + "-" + 2019;
       String result = NextDayCalculator.nextDayCalculator(day, month, year);
       assert expected.equals(result);
    }
}
