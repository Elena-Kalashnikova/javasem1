package org.example.Clinic;

import org.example.Animal;

import java.util.List;

public  class VeterinaryClinic {
    private List<Animal> pacients;
    private List<Doctor> doctors;
    private List<Nurse> nurses;

    public VeterinaryClinic(List<Animal> pacients, List<Doctor> doctors, List<Nurse> nurses) {
        this.pacients= pacients;
        this.doctors = doctors;
        this.nurses = nurses;

    }



    public void addAnimal(Animal animal){
        pacients.add(animal);
    }

    public List<Animal> getPacients() {
        return pacients;
    }
}
