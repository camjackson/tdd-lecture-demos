import org.junit.Test;

import static org.junit.Assert.*;

public class DividerTest {
    @Test
    public void dividingSixByTwoReturnsThree() {
        assertEquals(3, new Divider().divide(6, 2));
    }

    @Test
    public void dividingFiveByOneReturnsFive() {
        assertEquals(5, new Divider().divide(5, 1));
    }

    @Test
    public void dividingSevenBySevenReturnsOne() {
        assertEquals(1, new Divider().divide(7, 7));
    }

    @Test
    public void dividingEightBySevenReturnsOne() {
        assertEquals(1, new Divider().divide(8, 7));
    }

    @Test
    public void dividingSevenByEightReturnsZero() {
        assertEquals(0, new Divider().divide(7, 8));
    }

    @Test
    public void dividingOneByZeroReturnsZero() {
        assertEquals(0, new Divider().divide(1, 0));
    }
}
