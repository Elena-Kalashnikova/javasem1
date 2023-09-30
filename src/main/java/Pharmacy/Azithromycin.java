package Pharmacy;

public class Azithromycin extends Component{
    public Azithromycin(String name, String weight, int power) {
        super(name, weight, power);
    }
    public Azithromycin(String weight){
        this("азитромицил", weight,11);
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
