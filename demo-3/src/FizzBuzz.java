public class FizzBuzz {

    String fizzBuzz(int number) {
        if (number % 3 == 0) {
            return "Fizz";
        } else if (number % 5 == 0) {
            return  "Buzz";
        }

        return Integer.toString(number);
    }
}