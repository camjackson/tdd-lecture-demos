import org.junit.Test;

import static org.junit.Assert.*;

public class FizzBuzzTest {

    @Test
    public void itReturnsTheNumberAsStringIfNotDivisibleByThreeOrFive() {
        assertEquals("1", new FizzBuzz().fizzBuzz(1));
        assertEquals("2", new FizzBuzz().fizzBuzz(2));
    }

    @Test
    public void itReturnsFizzIfDivisibleByThree() {
        assertEquals("Fizz", new FizzBuzz().fizzBuzz(24));
    }

    @Test
    public void itReturnsFizzIfDivisibleByFive() {
        assertEquals("Buzz", new FizzBuzz().fizzBuzz(20));
    }

    @Test
    public void itReturnsFizzBuzzIfDivisibleByThreeAndFive() {
        assertEquals("FizzBuzz", new FizzBuzz().fizzBuzz(45));
    }

    @Test
    public void itStartsWithTheRightSequence() {
        assertEquals("1, 2, Fizz, 4, Buzz", new FizzBuzz().fizzBuzzSequence().substring(0, 19));
    }

    @Test
    public void itEndsWithTheRightSequence() throws Exception {
        String sequence = new FizzBuzz().fizzBuzzSequence();
        assertEquals("Fizz, 49, Buzz", sequence.substring(sequence.length() - 14));
    }
}