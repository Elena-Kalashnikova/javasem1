package Pharmacy;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

public class Pharmacy implements Iterable<Component>,Comparable<Pharmacy> {
    private List<Component> components;
    private int index;


    public Pharmacy() {
        this.components = new ArrayList<>();
        this.index = 0;

    }

    public String getComponentsName() {
        StringBuilder stringBuilder = new StringBuilder();
        for (Component component : components) {
            stringBuilder.append(component.getName() + " ");
        }
        return stringBuilder.toString();
    }


    //    @Override
//    public boolean hasNext() {
//        return
//    }
//
//    @Override
//    public Component next() {
//        return components.get(index++);
//    }
    public Pharmacy addComponent(Component component) {
        if (component == null) throw new NullPointerException("Компонент не может быть null");
        components.add(component);
        return this;
    }

    @Override
    public String toString() {
        return "Pharmacy{" +
                "components=" + components +
                ", index=" + index +
                '}';
    }

    //    @Override
//    public Iterator<Component> iterator() {
//        return new PharmacyIterator();
//    }
    @Override
    public boolean equals(Object obj) {
        if (obj == this)
            return true;

        if (obj == null || getClass() != obj.getClass()) return false;

        Pharmacy pharmacy = (Pharmacy) obj;

        return pharmacy.getFullPower() == this.getFullPower();
    }


    public int hashCode() {

        return Objects.hash(getFullPower());

    }


    @Override
    public Iterator<Component> iterator() {
        return new PharmacyIterator(components);
    }


//            @Override
//            public boolean hasNext() {
//                return index < components.size();
//
//            }
//
//            @Override
//            public Component next() {
//                return components.get(index++);
//            }
//        };
//        for (Iterator<Component> iterator = Pharmacy.iterator(); iterator.hasNext();) {
//            Component c = iterator.next();
//        }

    public int getFullPower() {
        //int count = 0;
        int count = components.stream().mapToInt(component -> component.getPower()).sum();
//    for (Component component: components) {
//        count+= component.getPower();

        // }
        return count;
    }

    public void setComponents(List<Component> components) {
        this.components = components;
    }

    @Override
    public int compareTo(Pharmacy o) {
        int fullPower = getFullPower();
        if (this.getFullPower() < o.getFullPower()) {
            return -1;
        }
        if (this.getFullPower() > o.getFullPower()) {
            return 1;
        } else if (fullPower > o.getFullPower()) {
            return 1;
        } else {
            String thisComponents = getComponentsName();
            String otherComponents = o.getComponentsName();
            return thisComponents.compareTo(otherComponents);
        }
    }

}


