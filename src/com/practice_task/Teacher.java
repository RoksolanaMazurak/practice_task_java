package com.practice_task;

public class Teacher extends Staff {

    private String name;
    final String TYPE_PERSON = "teacher";

    public Teacher() {
        this.name = "unknown";
        System.out.println(TYPE_PERSON);
    }
    public Teacher(String name) {
        this.name = name;
        System.out.println(TYPE_PERSON);
    }
    String print() {
        return "I am a " + TYPE_PERSON;
    }
    String salary() {
        return "The salary for teacher " + name;
    }
}
