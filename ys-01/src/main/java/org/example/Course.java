package org.example;

import java.util.Objects;

public class Course {

    private String courseName;
    private String courseCode;
    private double creditScore;


    public Course(String courseName, String courseCode, double creditScore) {
        this.courseName = courseName;
        this.courseCode = courseCode;
        this.creditScore = creditScore;
    }


    public String getCourseName() {return courseName;}

    public void setCourseName(String courseName) {this.courseName = courseName;}

    public String getCourseCode() {return courseCode;}

    public void setCourseCode(String courseCode) {this.courseCode = courseCode;}

    public double getCreditScore() {return creditScore;}

    public void setCreditScore(double creditScore) {this.creditScore = creditScore;}

    @Override
    public String toString() {
        return "Course{" +
                "courseName='" + courseName + '\'' +
                ", courseCode=" + courseCode +
                ", creditScore=" + creditScore +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Course course = (Course) o;
        return courseCode == course.courseCode && Double.compare(course.creditScore, creditScore) == 0 && Objects.equals(courseName, course.courseName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(courseName, courseCode, creditScore);
    }
}
