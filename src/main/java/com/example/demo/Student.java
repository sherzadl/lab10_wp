package com.example.demo;

public class Student extends Person {

    private String studentId;

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    @Override
    public String toString() {
        return super.toString() + ", Student ID: " + studentId;
    }

    public static void main(String[] args) {
        Student student = new Student();
        student.setName("Sherzad");
        student.setAge(19);
        student.setAddress("Karakalpakstan");
        student.setStudentId("230042");

        System.out.println(student);
    }
}
