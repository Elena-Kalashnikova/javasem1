package org.example;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Owner alex = new Owner("Alexey");
        Vaccination chumka = new Vaccination("chumka", LocalDate.of(2010, 12, 5));
        Animal barsik = new Cat("barsik", 10.0, alex, LocalDate.now(), List.of(chumka), Color.BLACK, "siamskiy");
        System.out.println(barsik.getName());
//        barsik.wakeUp();
        System.out.println(barsik.getVaccinations());
        barsik.setVaccinations(List.of(chumka, new Vaccination("столбняк", LocalDate.now())));
        System.out.println(barsik.getVaccinations());
        Dog barbos = new Dog("barbos", 10.0, alex, LocalDate.now(), List.of(chumka), Color.WHITE);
        List<Animal> animals = new ArrayList<>();
        animals.add(barsik);
        animals.add(barbos);
        Animal duffy = new Duck("duffy", 5.0, alex,LocalDate.now(),List.of(chumka),Color.WHITE);
        Animal nemo = new Fish("nemo", 0.1,alex, LocalDate.now(), Color.BLACK);
        animals.add(duffy);
        animals.add(nemo);
        for (Animal animal : animals) {
            if (animal instanceof Cat) {
                System.out.println(((Cat) animal).getBreed());
            }
            System.out.println(animal.getName());
        }

        ((Cat) barsik).getBreed();
        barsik.swim();
       barsik.fly();
        barsik.toGo();

//        barsik.toPlay();
//        barsik.goToSleep();
        //barsik.lifeCycle();
        duffy.swim();
        duffy.fly();
        duffy.toGo();
        nemo.swim();
        nemo.toGo();


    }
}
