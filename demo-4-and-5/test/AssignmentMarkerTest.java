import org.junit.Test;

import static org.junit.Assert.*;

public class AssignmentMarkerTest {

    class NeverPlagiarised extends PlagiarismService {
        boolean assignmentIsPlagiarised(Assignment assignment) {
            return false;
        }
    }

    class AlwaysPlagiarised extends PlagiarismService {
        boolean assignmentIsPlagiarised(Assignment assignment) {
            return true;
        }
    }

    @Test
    public void itScores5WhenNotPlagiarisedAndHalfCorrect() throws Exception {
        Assignment assignment = new Assignment(false, true);
        PlagiarismService neverPlagiarised = new NeverPlagiarised();

        int mark = new AssignmentMarker().markAssignment(assignment, neverPlagiarised);
        assertEquals(5, mark);
    }

    @Test
    public void itScores10WhenNotPlagiarisedAndTotallyCorrect() throws Exception {
        Assignment assignment = new Assignment(true, false);
        PlagiarismService neverPlagiarised = new NeverPlagiarised();

        int mark = new AssignmentMarker().markAssignment(assignment, neverPlagiarised);
        assertEquals(10, mark);
    }

    @Test
    public void itScores0WhenPlagiarised() throws Exception {
        Assignment assignment = new Assignment(false, true);
        PlagiarismService neverPlagiarised = new AlwaysPlagiarised();

        int mark = new AssignmentMarker().markAssignment(assignment, neverPlagiarised);
        assertEquals(0, mark);
    }
}
