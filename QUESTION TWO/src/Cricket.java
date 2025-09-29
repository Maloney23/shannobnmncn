
// Interface
interface iReport {
    public void print_report();
}

// Abstract class implementing the interface
abstract class Student implements iReport {
    private String studentNumber;
    private double testResult;
    private double assignmentResult;
    private double examResult;

    // Constructor
    public Student(String studentNumber, double testResult, double assignmentResult, double examResult) {
        this.studentNumber = studentNumber;
        this.testResult = testResult;
        this.assignmentResult = assignmentResult;
        this.examResult = examResult;
    }

    // Get methods
    public String getStudentNumber() {
        return studentNumber;
    }

    public double getTestResult() {
        return testResult;
    }

    public double getAssignmentResult() {
        return assignmentResult;
    }

    public double getExamResult() {
        return examResult;
    }
}

// Subclass that extends Student
class Student_Report extends Student {

    // Constructor
    public Student_Report(String studentNumber, double testResult, double assignmentResult, double examResult) {
        super(studentNumber, testResult, assignmentResult, examResult);
    }

    // Implement the print_report method
    public void print_report() {
        // Calculate weighted results
        double testWeighted = getTestResult() * 0.25;        // 25% weighting
        double assignmentWeighted = getAssignmentResult() * 0.25; // 25% weighting
        double examWeighted = getExamResult() * 0.50;        // 50% weighting
        double finalResult = testWeighted + assignmentWeighted + examWeighted;

        // Display the report
        System.out.println("STUDENT RESULT REPORT");
        System.out.println("=====================");
        System.out.println("Student Number: " + getStudentNumber());
        System.out.println();
        System.out.println("ASSESSMENT BREAKDOWN:");
        System.out.println("---------------------");
        System.out.printf("Test (25%%): %.2f (Weighted: %.2f)%n", getTestResult(), testWeighted);
        System.out.printf("Assignment (25%%): %.2f (Weighted: %.2f)%n", getAssignmentResult(), assignmentWeighted);
        System.out.printf("Exam (50%%): %.2f (Weighted: %.2f)%n", getExamResult(), examWeighted);
        System.out.println("---------------------");
        System.out.printf("FINAL RESULT: %.2f%n", finalResult);
        System.out.println("=====================");
    }
}

// Main application class
public class useStudent {
    public static void main(String[] args) {
        // Instantiate Student_Report with hardcoded values
        Student_Report student1 = new Student_Report("STU001", 85.0, 90.0, 78.0);

        // Print the report
        student1.print_report();

        System.out.println();

        // Test with another student
        Student_Report student2 = new Student_Report("STU002", 75.0, 80.0, 85.0);
        student2.print_report();
    }
}
