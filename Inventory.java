package ch1;

import ch1.enums.Builder;
import ch1.enums.Type;
import ch1.enums.Wood;

import java.util.LinkedList;
import java.util.List;

public class Inventory {
    List<Guitar> guitars;

    public Inventory() {
        guitars = new LinkedList<>();
    }
    public void addGuitar(String serialNumber,
                          double price,
                          Builder builder,
                          String model,
                          Type type,
                          Wood backWood,
                          Wood topWood){
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
    public List<Guitar> search(Guitar searchGuitar){
        List<Guitar> matchGuitars = new LinkedList<Guitar>();
        for (Guitar guitar :
                guitars) {
            
            // Ignore serial number since that's unique
            // Ignore price since that's unique
            if ((searchGuitar.getBuilder()) != guitar.getBuilder()) {
                continue;
            }
            String model = searchGuitar.getModel();
            if ((model != null) && (model.equals("")) &&
                    (!model.equals(guitar.getModel())) ){
                continue;
            }
            if ((searchGuitar.getType()) != guitar.getType()) {
                continue;
            }
            if ((searchGuitar.getBackWood()) != guitar.getBackWood()) {
                continue;
            }
            if ((searchGuitar.getTopWood()) != guitar.getTopWood()) {
                continue;
            }
            matchGuitars.add(guitar);
            //find a guitar equals(all if fail) searchGuitar
        } // close foreach loop
        return matchGuitars;
        // Interrupt search method and return matchGuitars(maybe empty List)

    } // close search method
}
