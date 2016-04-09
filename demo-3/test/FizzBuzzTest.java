import org.junit.Test;

import static org.junit.Assert.*;

public class FizzBuzzTest {

    @Test
    public void itReturnsTheNumberAsStringIfNotDivisibleByThreeOrFive() {
        assertEquals("1", new FizzBuzz().fizzBuzz(1));
    }
}