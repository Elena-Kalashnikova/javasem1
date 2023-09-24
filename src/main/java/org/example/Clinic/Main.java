package org.example.Clinic;
import org.example.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        VeterinaryClinic clinic = new VeterinaryClinic(new ArrayList<>(), new ArrayList<>(), new ArrayList<>());
        Nurse angel = new Nurse("Ангелина", 30);
        Doctor aibolit = new Doctor("Айболит", "терапевт", 25, angel);
        clinic.addAnimal(new Cat("barsik", 10.0, new Owner("alex"), LocalDate.now(), List.of(), Color.BLACK, "siamskiy"));
        clinic.addAnimal(new Dog("barbos", 10.0, new Owner("alex"), LocalDate.now(), List.of(), Color.BLACK));
        clinic.addAnimal(new Fish("nemo", 0.1, new Owner("alex"), LocalDate.now(), Color.BLACK));
        //clinic.addAnimal(new Human("Hellen"));
        clinic.addAnimal(new Duck("duffy", 5.0, new Owner(""), LocalDate.now(), List.of(), Color.WHITE));
        aibolit.diagnosis();
        aibolit.orderForTheNurse(angel);
        //angel.giveMedic();
        for (Animal animal : clinic.getPacients()) {

            if (animal instanceof Flyable) {
                System.out.println("Все летающие " + ((Flyable) animal).getFlySpeed());

            }
            if (animal instanceof Swimable) {
                System.out.println("Все плавающие " + ((Swimable) animal).getSwimSpeed());

            }
            if (animal instanceof Run) {
                System.out.println("Все бегающие " + ((Run) animal).getRunSpeed());
            }
            //animal.heal();
        }

            }
        }


