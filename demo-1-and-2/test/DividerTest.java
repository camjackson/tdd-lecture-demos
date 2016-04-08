import org.junit.Test;

import static org.junit.Assert.*;

public class DividerTest {
    @Test
    public void dividingBy2HalvesTheNUmber() throws Exception {
        assertEquals(3, new Divider().divide(6, 2));
    }

    @Test
    public void dividingBy1HasNoEffect() throws Exception {
        assertEquals(5, new Divider().divide(5, 1));
    }

    @Test
    public void dividingByItselfGives1() throws Exception {
        assertEquals(1, new Divider().divide(7, 7));
    }

    @Test
    public void itRoundsDownTo1() throws Exception {
        assertEquals(1, new Divider().divide(8, 7));
    }

    @Test
    public void itRoundsDownToZero() throws Exception {
        assertEquals(0, new Divider().divide(7, 8));
    }

    @Test
    public void itRoundsDownToZeroAgain() throws Exception {
        assertEquals(0, new Divider().divide(1, 2));
    }

    @Test
    public void itGivesZeroWhenDividingByZero() throws Exception {
        assertEquals(0, new Divider().divide(1, 0));
    }
}
