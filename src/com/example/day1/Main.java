package com.example.day1;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args){
        Animal a1 =new Dog();
        Animal a2 = new Cat();

        a1.sound();
        a2.sound();

        ArrayList<Animal> animals = new ArrayList<>();
        animals.add(new Dog());
        animals.add(new Cat());
        for(Animal a: animals){
            a.sound();
        }
    }
}
