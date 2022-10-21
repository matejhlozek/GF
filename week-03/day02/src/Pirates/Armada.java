package Pirates;

import java.util.ArrayList;
import java.util.List;

public class Armada {
    public List<Ship> listOfShips = new ArrayList();
    public Armada(List listOfShips){
        this.listOfShips = listOfShips;}

    public Armada(){
    }

    public void fillArmada(){
        listOfShips.add(new Ship("ship 1"));
        listOfShips.add(new Ship("ship 2"));
    }
}
