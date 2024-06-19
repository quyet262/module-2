package ss9.bai_tap.fizz_buzz;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FizzBuzzTest {
    @Test
    void testFizz() {
        int number = 6;
        String expected = "Fizz";
        String actual = FizzBuzz.fizzBuzz(number);
        assertEquals(expected, actual);
    }
    @Test
    void testBuzz() {
        int number = 10;
        String expected = "Buzz";
        String actual = FizzBuzz.fizzBuzz(number);
        assertEquals(expected, actual);
    }
    @Test
    void testFizzBuzz(){
        int number = 15;
        String expected = "FizzBuzz";
        String actual = FizzBuzz.fizzBuzz(number);
        assertEquals(expected, actual);
    }
    @Test
    void testIsNotFizzbuzz(){
        int number = 17;
        String expected = ""+number;
        String actual = FizzBuzz.fizzBuzz(number);
        assertEquals(expected, actual);
    }
    @Test
    void testContainsNumberThree(){
        int number = 23;
        String expected = "Fizz";
        String actual = FizzBuzz.fizzBuzz(number);
        assertEquals(expected, actual);
    }
    @Test
    void testContainsNumberFive(){
        int number = 56;
        String expected = "Buzz";
        String actual = FizzBuzz.fizzBuzz(number);
        assertEquals(expected, actual);
    }



}