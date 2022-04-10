package com.practice_task;

public class Student extends Person {
    private String name;
    final String TYPE_PERSON = "student";

    public Student() {
        this.name = "unknown";
        System.out.println(TYPE_PERSON);
    }
    public Student(String name) {
        this.name = name;
        System.out.println(TYPE_PERSON);
    }
    String print() {
        return "I am a " + TYPE_PERSON;
    }
}
