import org.junit.Test;

import static org.junit.Assert.*;

public class AssignmentMarkerTest {
    @Test
    public void markAssignment() throws Exception {
        Assignment assignment = new Assignment(true, true);
        PlagiarismService plagiarismService = new PlagiarismService();

        int mark = new AssignmentMarker().markAssignment(assignment, plagiarismService);

        assertEquals(-1, mark);
    }
}
