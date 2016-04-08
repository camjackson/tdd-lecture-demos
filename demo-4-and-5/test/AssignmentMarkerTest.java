import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class AssignmentMarkerTest {
    StudentEmailService fakeStudentEmailService;

    @Before
    public void setUp() throws Exception {
        fakeStudentEmailService = new MockStudentEmailService();

    }

    @Test
    public void markAssignment() throws Exception {
        Assignment assignment = new Assignment(true, true);
        PlagiarismService plagiarismService = new NeverPlagiarisedService();


        int mark = new AssignmentMarker().markAssignment(assignment, plagiarismService, fakeStudentEmailService);

        assertEquals(-1, mark);
    }

    private class MockStudentEmailService extends StudentEmailService {
        public Assignment getMostRecentAssignment() {
            return mostRecentAssignment;
        }

        public int getMostRecentMark() {
            return mostRecentMark;
        }

        Assignment mostRecentAssignment;
        int mostRecentMark;

        void emailStudentTheirResults(Assignment assignment, int mark) {
            mostRecentAssignment = assignment;
            mostRecentMark = mark;
        }
    }



}
