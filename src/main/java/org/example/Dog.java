package org.example;

import org.example.Clinic.Illable;
import org.example.Clinic.Run;

import java.time.LocalDate;
import java.util.List;

public class Dog extends Animal implements Run {
    public Dog(String name, double weight, Owner owner, LocalDate birthDay, List<Vaccination> vaccinations, Color color) {
        super(name, weight, owner, birthDay, vaccinations, color);
    }

    @Override
    public void swim(){
        System.out.println(this.TYPE +  " Плаваю");
    }
    @Override
    public void toGo() {
        System.out.println(this.TYPE + " Бегаю.");
    }

    @Override
    public void heal() {
        System.out.println("Ветеринар лечит " + this.getTYPE());
    }

    @Override
    public double getRunSpeed() {
       // return 10.0;
        return 15.0;
    }
}
