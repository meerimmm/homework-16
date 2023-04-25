package com.company;
public class Main {



    public static void main(String[] args) {


        Shark shark=new Shark();
        Eagle eagle=new Eagle();
        Tutle turtle=new Tutle();


        Animal[]animals={shark,eagle,turtle};


        for(Animal animal:animals){
            if(animal instanceof Shark){
                Shark.sharks = new Shark[]{(Shark) animal};
                shark.eat();
                Shark.attack();
            }else if(animal.getClass().getName().equals("Turtle")){
                Tutle.turtles = new Tutle[]{(Tutle) animal};
                turtle.eat();
                Tutle.swim();
            }else{
                Eagle.eagles = new Eagle[]{(Eagle) animal};
                eagle.eat();
                Eagle.fly();
            }
        }


    }

}

