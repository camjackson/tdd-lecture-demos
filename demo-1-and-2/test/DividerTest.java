import org.junit.Test;

import static org.junit.Assert.*;

public class DividerTest {
    @Test
    public void dividingByZeroReturnsZero() {
        assertEquals(0, new Divider().divide(4, 0));
    }

    @Test
    public void dividingANumberByItselfReturnsOne() {
        assertEquals(1, new Divider().divide(5, 5));
    }

    @Test
    public void dividingANumberByOneReturnsTheSameNumber() {
        assertEquals(29, new Divider().divide(29, 1));
    }

    @Test
    public void itRoundsUsingFloor() {
        assertEquals(1, new Divider().divide(13, 7));
    }

    @Test
    public void dividingByTwoReturnsHalfOfTheEnumerator() {
        assertEquals(3, new Divider().divide(6, 2));
    }
}
