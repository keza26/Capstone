package System;

public class Student extends Person {
     private int studentId;
     private double totalMarks;
     private int totalCredits;


    public Student(int id, String name, String gender, String email, int studentId, double totalMarks, int totalCredits) {
        super(id, name, gender, email);
        this.studentId = studentId;
        this.totalMarks = totalMarks;
        this.totalCredits = totalCredits;
    }
    public Student(int id, String name, String gender, String email){
            super(id, name, gender, email);

    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public double getTotalMarks() {
        return totalMarks;
    }

    public void setTotalMarks(double totalMarks) {
        this.totalMarks = totalMarks;
    }

    public int getTotalCredits() {
        return totalCredits;
    }

    public void setTotalCredits(int totalCredits) {
        this.totalCredits = totalCredits;
    }
    public double calculateGPA(){
       return totalMarks / totalCredits;
    }

    @Override
    public String toString() {
        return "System.Student{" +
                "studentId=" + studentId +
                ", totalMarks=" + totalMarks +
                ", totalCredits=" + totalCredits +
                '}';
    }
}

