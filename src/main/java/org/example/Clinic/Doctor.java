package org.example.Clinic;

public class Doctor implements giveMedicine {

    private String name;
    private String specialization;
    private int age;
    private Nurse nurse;
    protected final String TYPE = this.getClass().getSimpleName();

    public Doctor(String name, String specialization, int age, Nurse angel) {
        this.name = name;
        this.specialization =specialization;
        this.age =age;
        this.nurse = nurse;

    }
    public String getTYPE() {
        return TYPE;
    }
    public void diagnosis(){
        System.out.println(this.getTYPE() + " Постановка диагноза");
    }

    public void orderForTheNurse(Nurse nurse){

        System.out.println(this.getTYPE() + " Поручение медсестре:дать лекарство пациенту ");
        nurse.giveMedic();
    }


    @Override
    public void giveMedic() {

    }
}
