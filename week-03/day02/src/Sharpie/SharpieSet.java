package Sharpie;

import java.util.ArrayList;
import java.util.List;

public class SharpieSet {

    public List<Sharpie> listOfSharpies;

    public SharpieSet(){
        this.listOfSharpies = new ArrayList<>();
    }

    public void add(Sharpie sharpie){
        listOfSharpies.add(sharpie);
    }

    public int countUsable() {
        int counter = 0;
        for (Sharpie sharpie:listOfSharpies) {
            if (sharpie.inkAmount > 0){
                counter++;
            }
        }  return counter;
    }

    public void removeTrash(){
        listOfSharpies.removeIf(sharpie -> (sharpie.inkAmount) == 0);
    }
}
