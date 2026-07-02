package System;

public class Instructor extends Person {
    private String department;
    public Instructor(int id, String name, String gender, String email, String department) {
        super(id, name, gender, email);
        this.department = department;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    @Override
    public String toString() {
        return "System.Instructor{" +
                "id=" + getId() +
                ", name='" + getName() + '\'' +
                ", gender='" + getGender() + '\'' +
                ", email='" + getEmail() + '\'' +
                ", department='" + department + '\'' +
                '}';
    }
}
