package com.practice_task;

public class Cleaner extends Staff {
    private String name;
    final String TYPE_PERSON = "cleaner";

    public Cleaner() {
        this.name = "unknown";
        System.out.println(TYPE_PERSON);
    }
    public Cleaner(String name) {
        this.name = name;
        System.out.println(TYPE_PERSON);
    }
    String print() {
        return "I am a " + TYPE_PERSON;
    }
    String salary() {
        return "The salary for cleaner " + name;
    }
}
