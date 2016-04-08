public class AssignmentMarker {
    int markAssignment(Assignment assignment, PlagiarismService plagiarismService) {
        int mark;

        if (plagiarismService.assignmentIsPlagiarised(assignment)) {
            mark = 0;
        } else {
            mark = -1;
        }

        // assignment.isHalfCorrect();
        // assignment.isTotallyCorrect();

        return mark;
    }
}
