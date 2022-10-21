package Pirates;

import java.util.ArrayList;
import java.util.List;

public class Ship {
    public String nameOfShip;
    public int numberOfPirates;
    public int intoxicationOfShip;
    public List<Pirate>listOfPirates = new ArrayList();

    public Ship(List listOfPirates) {
        this.listOfPirates = listOfPirates;
    }

    public int intoxicationOfShip(){
        int intoxicationOfShip = 0;
        for (int i = 0; i < listOfPirates.size(); i++) {
            intoxicationOfShip += listOfPirates.get(i).intoxication;
            System.out.println(intoxicationOfShip);
        }return intoxicationOfShip;
    }

    public Ship(String nameOfShip, int numberOfPirates, int intoxication){
        this.nameOfShip = nameOfShip;
        this.numberOfPirates = numberOfPirates;
        this.intoxicationOfShip = intoxicationOfShip();
    }

    public String toString(){
        return "Name of ship: " + nameOfShip
                + ", number of pirates: " + numberOfPirates
                + ", intoxication: " + intoxicationOfShip;
    }
    public Ship(String nameOfShip) {
        this.nameOfShip = nameOfShip;
    }

    public void fillShip1() {
        listOfPirates.add(new Pirate("ship 1 - captain", 0));
        for (int i = 1; i < 6; i++) {
            listOfPirates.add(new Pirate("ship 1 - pirate" + i, 0));
        }
    }
    public void fillShip2() {
        listOfPirates.add(new Pirate("ship 2 - captain", 0));
        for (int i = 1; i < 6; i++) {
            listOfPirates.add(new Pirate("ship 2 - pirate" + i, 0));
        }
    }

    public static void main(String[] args) {
        Armada armada = new Armada();
        armada.fillArmada();
        Ship ship1 = new Ship("ship 1");
        Ship ship2 = new Ship("ship 2");

        for (int i = 0; i < armada.listOfShips.size(); i++) {
            System.out.println(armada.listOfShips.get(i));
        }
        ship1.fillShip1();
        ship2.fillShip2();
/*        for (int i = 0; i < ship1.listOfPirates.size(); i++) {
            System.out.println(ship1.listOfPirates.get(i));
        }
        for (int i = 0; i < ship2.listOfPirates.size(); i++) {
            System.out.println(ship2.listOfPirates.get(i));
        }*/
        Pirate pirateFirstShip = (Pirate) ship1.listOfPirates.get(1);
        Pirate pirateSecondShip = (Pirate) ship2.listOfPirates.get(1);

        pirateFirstShip.drinkSomeRum();pirateFirstShip.drinkSomeRum();pirateFirstShip.drinkSomeRum();
        pirateSecondShip.die();

        System.out.println(ship1.listOfPirates.get(1));
        System.out.println(ship2.listOfPirates.get(1));

        ship1.intoxicationOfShip();


    }
}

