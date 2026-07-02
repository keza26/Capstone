package System;

import java.util.*;

public class UniversityManager {

    private List<Student> students = new ArrayList<>();
    private Set<Course> courses = new HashSet<>();
    private List<Instructor> instructors = new ArrayList<>();

    public List<Student> getStudents() {
        return students;
    }
    public Set<Course> getCourses() {
        return courses;
    }
    public List<Instructor> getInstructors() {
        return instructors;
    }

    public void addStudent(Student student) {
        students.add(student);
        System.out.println(student.getName() + " has been added successfully.");
    }

    public void addCourse(Course course) {
        courses.add(course);
        System.out.println(course.getCourseName() + " has been added successfully.");
    }

    public void addInstructor(Instructor instructor) {
        instructors.add(instructor);
        System.out.println(instructor.getName() + " has been added successfully.");
    }

    public void removeStudent(Student student) {
        students.remove(student);
        System.out.println(student.getName() + " has been removed.");
    }

    public void removeCourse(Course course) {
        courses.remove(course);
        System.out.println(course.getCourseName() + " has been removed.");
    }

    public void removeInstructor(Instructor instructor) {
        instructors.remove(instructor);
        System.out.println(instructor.getName() + " has been removed.");
    }

    public void displayStudents() {

        if (students.isEmpty()) {
            System.out.println("No students available.");
            return;
        }

        for (Student student : students) {
            System.out.println(student);
        }
    }

    public void displayCourses() {

        if (courses.isEmpty()) {
            System.out.println("No courses available.");
            return;
        }

        for (Course course : courses) {
            System.out.println(course);
        }
    }

    public void displayInstructors() {

        if (instructors.isEmpty()) {
            System.out.println("No instructors available.");
            return;
        }

        for (Instructor instructor : instructors) {
            System.out.println(instructor);
        }
    }
}