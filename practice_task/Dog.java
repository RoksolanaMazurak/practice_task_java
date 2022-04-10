package com.practice;

public class Dog implements Animal {
    private String name;

    public Dog() {
        this.name = "unknown";
    }
    public Dog(String name) {
        this.name = name;
    }

    public String voice() {
        return "Woof woof woof!";
    }
    public String feed() {
        return "Feeding " + name + "!";
    }
}
