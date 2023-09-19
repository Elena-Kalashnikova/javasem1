package org.example;

import java.time.LocalDate;

public class Fish extends Animal {


    public Fish(String name, double weight, Owner owner, LocalDate birthDay, Color color) {
        super(name, weight, owner, birthDay, color);
    }

    @Override
    public void swim(){
        System.out.println(this.TYPE +  " Плаваю");

    }
}
