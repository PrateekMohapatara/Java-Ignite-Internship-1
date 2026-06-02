/*
(EASY)
Create a class Student:

Requirements:
name
age
marks
Tasks:
Initialize using constructor
Create 2 student objects
Display student details using method
Twist:

Marks should not be accessed directly.

Write your code below
----------------------------------------
*/
package day7_prog;

class Studentm {

    String name;
    int age;
    private int marks;

    Studentm(String name, int age, int marks) {
        this.name = name;
        this.age = age;
        this.marks = marks;
    }

    public int getMarks() {
        return marks;
    }

    void showDetails() {
        System.out.println("Name  : " + name);
        System.out.println("Age   : " + age);
        System.out.println("Marks : " + getMarks());
        System.out.println();
    }
}

public class student {

    public static void main(String[] args) {

        Studentm s1 = new Studentm("Prateek", 19, 88);
        Studentm s2 = new Studentm("Rahul", 20, 92);

        s1.showDetails();
        s2.showDetails();
    }
}
