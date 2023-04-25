package com.company;

public class Tutle extends Animal{
    public static Tutle []turtles;

    public static void swim(){
        System.out.println("Turtle swimming");
    }

    @Override
    public void eat() {
        System.out.println("Turtle is eating");

    }
}

