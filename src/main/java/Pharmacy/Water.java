package Pharmacy;

public class Water extends Component{
    public Water(String name, String weight, int power) {
        super(name, weight, power);
    }

    public Water(String weight) {
        this("вода", weight,4);

    }
    @Override
    public String toString() {
        return super.toString();
    }
}
