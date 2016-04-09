public class FizzBuzz {

    String fizzBuzz(int number) {
        if (number % 3 == 0 && number % 5 == 0) {
            return "FizzBuzz";
        } else if (number % 3 == 0) {
            return "Fizz";
        } else if (number % 5 == 0) {
            return  "Buzz";
        }

        return Integer.toString(number);
    }

    String fizzBuzzSequence() {
        String result = "";
        for (int i = 1; i <= 50; i++) {
            result += fizzBuzz(i) + ", ";
        }

        String resultWithNoTrailingComma = result.substring(0, result.length() - 2);
        return resultWithNoTrailingComma;
    }

    public static void main(String[] args) {
        System.out.println(new FizzBuzz().fizzBuzzSequence());
    }
}