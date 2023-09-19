package org.example;

import java.time.LocalDate;
import java.util.List;

public class Cat extends Animal{
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
}
