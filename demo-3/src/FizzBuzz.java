public class FizzBuzz {
    String fizzBuzz(int number) {
        String result = String.valueOf(number);

        if(number % 15 == 0){
            result = "FizzBuzz";
        } else if (number % 3 == 0) {
            result = "Fizz";
        } else if (number % 5 == 0) {
            result = "Buzz";
        }
        return result;
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
