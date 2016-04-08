public class AssignmentMarker {
    int markAssignment(Assignment assignment, PlagiarismService plagiarismService, StudentEmailService studentEmailService) {
        int mark;

        if (plagiarismService.assignmentIsPlagiarised(assignment)) {
            mark = 0;
        } else if() {
            mark = -1;
        }

//         assignment.isHalfCorrect();
//         assignment.isTotallyCorrect();

        studentEmailService.emailStudentTheirResults(assignment, mark);

        return mark;
    }
}
