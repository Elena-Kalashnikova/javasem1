package Pharmacy;

import java.util.*;

public class Main {
    public static void main(String[] args) {
       Pharmacy catPharmacy = new CatPharmacy();
       Component penit = new Penitsillin("6mg");
        penit.setWeight("7mg");
       catPharmacy.addComponent(new Azithromycin("1mg"))
            .addComponent(new Water("7ml"))
            .addComponent(penit);
       Pharmacy catPharmasy1 = new CatPharmacy();
        penit.setWeight("9mg");
       catPharmasy1.addComponent(new Azithromycin("4mg"))
               .addComponent(new Water("10ml"))
               .addComponent(penit);
       //catPharmasy1.getFullPower();
        //System.out.println(catPharmacy);
       // penit.setWeight("11mg");
        Pharmacy catPharmasy2 = new CatPharmacy();
        catPharmasy2.addComponent(new Water("13"));
                //.addComponent(penit)
//                .addComponent(new Azithromycin("8mg"))
//                .addComponent(new Water("13ml"));
        Pharmacy catPharmasy3 = new CatPharmacy();
        catPharmasy3.addComponent(new Water("13"));
        Pharmacy catPharmasy4 = new CatPharmacy();
        catPharmasy4.addComponent(new Water("13"));
                //.addComponent(penit)
//                .addComponent(new Azithromycin("8mg"))
//                .addComponent(new Water("13ml"));
        List<Pharmacy> pharmacyList = new ArrayList<>();
        pharmacyList.add(catPharmasy2);
        pharmacyList.add(catPharmacy);
        pharmacyList.add(catPharmasy1);
        pharmacyList.add(catPharmasy2);
        pharmacyList.add(catPharmasy3);
        //System.out.println(pharmacyList);
//        Set<Pharmacy> result = new HashSet<>();
//        result.add(catPharmacy);
//        result.add(catPharmasy1);
//        result.add(catPharmasy2);
//        result.add(catPharmasy3);
//        result.add(catPharmasy4);
//        System.out.println(result.size());
//        for (Pharmacy pharmacy : result) {
//            System.out.println(pharmacy);
//        }
//        for(Component component:catPharmacy){
//            System.out.println(component);
//        }

        for (Pharmacy pharmacy:pharmacyList){
            System.out.println("Лекарство с названием: "+ pharmacy.getComponentsName() + " и силой = "+ pharmacy.getFullPower());
        }

//        Collections.sort(pharmacyList);
//
//        System.out.println("---------------");
//
//        for (Pharmacy p:pharmacyList)
//            System.out.println(p.getFullPower());
//
//
//       // while (((Iterator<Component>)catPharmacy).hasNext()){
//        for (Component component:catPharmacy)
//            System.out.println(component);
//        for (Iterator<Component> iterator = drug.iterator(); iterator.hasNext();) {
//            Component c = iterator.next();
//        }
        }
    }

