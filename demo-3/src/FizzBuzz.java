public class FizzBuzz {

    String fizzBuzz(int number) {
        if (number % 3 == 0) {
            return "Fizz";
        }

        return Integer.toString(number);
    }
}