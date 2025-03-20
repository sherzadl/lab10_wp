package com.example.demo.cat1;

public class ObjectTypes<T> {

    private T object;

    public ObjectTypes(T object) {
        this.object = object;
    }

    public void printInfo() {
        System.out.println(object);
    }

    public static void main(String[] args) {
        Person person = new Person();
        person.setName("Test Person");
        person.setAge(40);
        person.setAddress("Nukus");

        ObjectTypes<Person> testPrinter = new ObjectTypes<>(person);
        testPrinter.printInfo();
    }
}
