public class AssignmentMarker {
    int markAssignment(Assignment assignment, PlagiarismService plagiarismService) {
        int mark = -1;

        if (plagiarismService.assignmentIsPlagiarised(assignment)) {
            mark = 0;
        } else if(assignment.isHalfCorrect()) {
            mark = 5;
        }

//  assignment.isTotallyCorrect();

        return mark;
    }
}
