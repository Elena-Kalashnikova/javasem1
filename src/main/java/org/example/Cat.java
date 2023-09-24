package org.example;

import org.example.Clinic.Run;

import java.time.LocalDate;
import java.util.List;

public class Cat extends Animal implements Run {
    private String breed;

    public Cat(String name, double weight, Owner owner, LocalDate birthDay, List<Vaccination> vaccinations, Color color, String breed) {
        super(name, weight, owner, birthDay, vaccinations, color);
        this.breed = breed;
    }

    public String getBreed() {
        return breed;
    }
    @Override
    public void toGo() {
        System.out.println(this.TYPE + " Бегаю.");
    }
    public void swim(){
        System.out.println(this.TYPE +  " Плаваю");
    }

//    @Override
//    public void heal() {
//        System.out.println("Ветеринар лечит " + this.getTYPE());
//    }


    @Override
    public double getRunSpeed() {

        return 5.2;
    }
}

