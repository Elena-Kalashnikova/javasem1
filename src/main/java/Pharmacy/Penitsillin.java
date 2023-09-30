package Pharmacy;

public class Penitsillin extends Component{
    public Penitsillin(String name, String weight, int power) {
        super(name, weight, power);
    }

    public Penitsillin (String weight) {
        this("пенециллин", weight,11);
    }
    @Override
    public String toString() {
        return super.toString();
    }
}
