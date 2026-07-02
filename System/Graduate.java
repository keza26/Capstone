package System;

public class Graduate extends Student {

    public Graduate(int id, String name, String gender, String email, int studentId, double totalMarks, int totalCredits) {
        super(id, name, gender, email, studentId, totalMarks, totalCredits);
    }
    @Override
    public double calculateGPA() {
        return (getTotalMarks() * 0.5) / getTotalCredits();
    }
}
