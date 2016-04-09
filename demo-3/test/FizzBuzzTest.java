import org.junit.Test;

import static org.junit.Assert.*;

public class FizzBuzzTest {
    @Test
    public void itReturnsTheNumberAsStringIfNotDivisibleByThreeOrFive() throws Exception {
        assertEquals("-1", new FizzBuzz().fizzBuzz(-1));
    }

    @Test
    public void itReturnsFizzIfDivisibleByThree() throws Exception {
        assertEquals("Fizz", new FizzBuzz().fizzBuzz(3));
    }

    @Test
    public void itReturnsBuzzIfDivisibleByFive() throws Exception {
        assertEquals("Buzz", new FizzBuzz().fizzBuzz(5));
    }

    @Test
    public void itReturnsFizzBuzzIfDivisibleByThreeAndFive() throws Exception {
        assertEquals("FizzBuzz", new FizzBuzz().fizzBuzz(15));
    }

    @Test
    public void itStartsWithTheRightSequence() throws Exception {
        assert(new FizzBuzz().fizzBuzzSequence().startsWith("1, 2, Fizz, 4, Buzz"));
    }
    @Test
    public void itEndsWithTheRightSequence() throws Exception {
        System.out.println(new FizzBuzz().fizzBuzzSequence());
        assert(new FizzBuzz().fizzBuzzSequence().endsWith("Fizz, 49, Buzz"));
    }
}
