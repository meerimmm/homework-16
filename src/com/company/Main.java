package com.company;
public class Main {
    public static void main(String[] args) {


      Circle circle= new Circle(10);
        System.out.println("Область круга=  " + circle.getArea());

        System.out.println("Диаметр круга= " + circle.getDiameter());

        System.out.println( "Длина окружности круга= "+ Circle.getCircumference());
    }
    }

