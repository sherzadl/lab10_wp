package com.example.demo.cat1;

public class PersonFactory {

    public static Person createDefaultPerson() {
        Person person = new Person();
        person.setName("Default Person");
        person.setAge(30);
        person.setAddress("Tashkent");
        return person;
    }

    public static Student createDefaultStudent() {
        Student student = new Student();
        student.setName("Default Student");
        student.setAge(18);
        student.setAddress("Samarkand");
        student.setStudentId("240001");
        return student;
    }

    public static void main(String[] args) {
        Person person = createDefaultPerson();
        Student student = createDefaultStudent();

        ObjectTypes<Person> personPrinter = new ObjectTypes<>(person);
        ObjectTypes<Student> studentPrinter = new ObjectTypes<>(student);

        personPrinter.printInfo();
        studentPrinter.printInfo();
    }
}
