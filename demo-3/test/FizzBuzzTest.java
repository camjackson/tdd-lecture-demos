import org.junit.Test;

import static org.junit.Assert.*;

public class FizzBuzzTest {
    @Test
    public void itDoesSomething() throws Exception {
        assertEquals(null, new FizzBuzz().fizzBuzz(-1));
    }


    @Test
    public void itStartsWithTheRightSequence() throws Exception {
        assert(new FizzBuzz().fizzBuzzSequence().startsWith("1, 2, Fizz, 4, Buzz"));
    }
    @Test
    public void itEndsWithTheRightSequence() throws Exception {
        assert(new FizzBuzz().fizzBuzzSequence().endsWith("Fizz, 49, Buzz"));
    }
}
