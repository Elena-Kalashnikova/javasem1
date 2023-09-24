package org.example.Clinic;

public class Nurse implements giveMedicine {
    private String name;
    private int age;
    protected final String TYPE = this.getClass().getSimpleName();


    public Nurse(String name, int age){
        this.name=name;
        this.age=age;

    }
    public String getTYPE() {
        return TYPE;
    }
    public void giveMedic(){

        System.out.println(this.getTYPE() + " Дать лекарство пациенту");
    }



}
