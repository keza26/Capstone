package System;

public class Undergraduate extends Student {

    public Undergraduate(int id, String name, String gender, String email, int studentId, double totalMarks, int totalCredits) {
        super(id, name, gender, email, studentId, totalMarks, totalCredits);
    }
    @Override
    public double calculateGPA() {
        return getTotalMarks() / getTotalCredits();
    }
}
