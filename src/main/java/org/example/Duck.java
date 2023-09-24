package org.example;

import org.example.Clinic.Flyable;

import java.time.LocalDate;
import java.util.List;

public class Duck extends Animal implements Flyable {

    public Duck(String name, double weight, Owner owner, LocalDate birthDay, List<Vaccination> vaccinations, Color color) {
        super(name, weight, owner, birthDay, vaccinations, color);
    }
    @Override
    public void swim(){
        System.out.println(this.TYPE +  " Плаваю");
    }
    @Override
    public void fly(){
        System.out.println(this.TYPE +  " Летаю");
    }
    @Override
    public void toGo(){
        System.out.println(this.TYPE +  " Бегаю");
    }

    @Override
    public double getFlySpeed() {

        return 2.0;

    }




}
