package com.practice;

public class Cat implements Animal {
    private String name;

    public Cat() {
        this.name = "unknown";
    }
    public Cat(String name) {
        this.name = name;
    }


    public String voice() {
        return "Meow meow meow!";
    }
    public String feed() {
        return "Feeding " + name + "!";
    }
}
