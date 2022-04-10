package com.practice;

public class Main {

    public static void main(String[] args) {
        Animal[] animals = new Animal[4];
        animals[0] = new Dog("Jack");
        animals[1] = new Cat("Sally");
        animals[2] = new Dog("Leo");
        animals[3] = new Cat("Mika");

        for (int i = 0; i < animals.length; i++) {
            System.out.println(animals[i].feed());
            System.out.println(animals[i].voice());
        }
    }
}
