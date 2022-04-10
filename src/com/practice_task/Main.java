package com.practice_task;

public class Main {

    public static void main(String[] args) {

        Person[] students = new Student[3];
        students[0] = new Student("Kristy");
        students[1] = new Student("Roksolana");
        students[2] = new Student("Diana");

        Staff[] staff = new Staff[3];
        staff[0] = new Teacher("Sam");
        staff[1] = new Teacher("Lidia");
        staff[2] = new Cleaner("Stephan");

        for (int i = 0; i < students.length; i++) {
            System.out.println(students[i].print());
        }
        for (int i = 0; i < staff.length; i++) {
            System.out.println(students[i].print());
        }
        for (int i = 0; i < staff.length; i++) {
            System.out.println(staff[i].salary());
        }
    }
}
