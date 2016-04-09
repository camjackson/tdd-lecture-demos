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
}