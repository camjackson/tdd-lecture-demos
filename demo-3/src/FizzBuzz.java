public class FizzBuzz {
    String fizzBuzz(int number) {
        return null;
    }

    String fizzBuzzSequence() {
        String result = "";
        for (int i = 0; i < 50; i++) {
            result += fizzBuzz(i) + ", ";
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(new FizzBuzz().fizzBuzzSequence());
    }

}
