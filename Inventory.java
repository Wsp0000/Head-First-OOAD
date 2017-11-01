package ch1;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Inventory {
    List<Guitar> guitars;

    public Inventory() {
        guitars = new LinkedList<>();
    }
    public void addGuitar(String serialNumber,
                          double price,
                          String builder,
                          String model,
                          String type,
                          String backWood,
                          String topWood){
//        Guitar guitar = new Guitar(serialNumber,
//                price,
//                builder,
//                model,
//                type,
//                backWood,
//                topWood);
//        guitars.add(guitar);
        guitars.add(new Guitar(serialNumber,
                price,
                builder,
                model,
                type,
                backWood,
                topWood));
    }
    public Guitar getGuitar(String serialNumber){
        for (Guitar guitar :
                guitars) {
                if (serialNumber.equals(guitar.getSerialNumber())) {
                    return guitar;
                }
        } // close foreach loop

//        for (Iterator i = guitars.iterator();
//        i.hasNext();){
//            Guitar guitar = (Guitar) i.next();
//            if (guitar.getSerialNumber().equals(serialNumber))
//                return guitar;
//        } // close for loop
        return null;
    }
    public Guitar search(Guitar searchGuitar){
        for (Guitar guitar :
                guitars) {
            
            // Ignore serial number since that's unique
            // Ignore price since that's unique
            String builder = searchGuitar.getBuilder();
            if ((builder != null) && (builder != "") && 
                    (!builder.equals(guitar.getBuilder())) ){
                continue;
            }
            String model = searchGuitar.getModel();
            if ((model != null) && (model != "") &&
                    (!model.equals(guitar.getModel())) ){
                continue;
            }
            String type = searchGuitar.getType();
            if ((type != null) && (type != "") &&
                    (!type.equals(guitar.getType())) ){
                continue;
            }
            String backwood = searchGuitar.getBackWood();
            if ((backwood != null) && (backwood != "") &&
                    (!backwood.equals(guitar.getBackWood())) ){
                continue;
            }
            String topwood = searchGuitar.getTopWood();
            if ((topwood != null) && (topwood != "") &&
                    (!topwood.equals(guitar.getTopWood())) ){
                continue;
            }
            return guitar; // all condition match, so interrupt search method and return this guitar
        } // close for loop
        return null; // all condition fail, so interrupt search method and return null
    } // close search method
}
