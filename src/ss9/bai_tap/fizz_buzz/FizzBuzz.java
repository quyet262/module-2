package ss9.bai_tap.fizz_buzz;

public class FizzBuzz {
    public static String fizzBuzz(int number) {
        if (numberDivisibleByThree(number) && numberDivisibleByFive(number)) {
            return "FizzBuzz";
        }
        if (numberDivisibleByThree(number) || containsNumberThree(number)) {
            return "Fizz";
        }
        if (numberDivisibleByFive(number) || containsNumberFive(number)) {
            return "Buzz";
        }
        return ""+number;
    }

    private static boolean numberDivisibleByFive(int number) {
        return number % 5 == 0;
    }

    private static boolean numberDivisibleByThree(int number) {
        return number % 3 == 0;
    }

    public static boolean containsNumberThree(int number) {
        int hasNumberThree = number;
        int digit = 3;
        String numberString = String.valueOf(hasNumberThree);
        String digitString = String.valueOf(digit);
        if(numberString.contains(digitString)) {
            return true;
        }
        return false;
    }
    public static boolean containsNumberFive(int n) {
        int hasNumberFive = n;
        int digit = 5;
        String numberString = String.valueOf(hasNumberFive);
        String digitString = String.valueOf(digit);
        if(numberString.contains(digitString)) {
            return true;
        }
        return false;
    }
}
