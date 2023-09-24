package org.example;

import org.example.Clinic.Swimable;

import java.time.LocalDate;

public class Fish extends Animal implements Swimable {


    public Fish(String name, double weight, Owner owner, LocalDate birthDay, Color color) {
        super(name, weight, owner, birthDay, color);
    }

    @Override
    public void swim(){
        System.out.println(this.TYPE +  " Плаваю");

    }

    @Override
    public double getSwimSpeed() {
        return 0.9;
    }
}
