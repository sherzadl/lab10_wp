package com.example.demo.cat1;

public class Person {

    private String name;
    private int age;
    private String address;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Name: " + name + ", Age: " + age + ", Address: " + address;
    }

    public static void main(String[] args) {
        Person person = new Person();
        person.setName("John");
        person.setAge(25);
        person.setAddress("Tashkent");

        System.out.println(person);
    }
}
