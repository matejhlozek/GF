package Sharpie;

public class Main {

    public static void main(String[] args) {

        SharpieSet sharpies = new SharpieSet();

        sharpies.add(new Sharpie("Yellow", 12));
        sharpies.add(new Sharpie("Blue", 10));
        sharpies.add(new Sharpie("Green", 8));
        sharpies.add(new Sharpie("Black", 6));

        for (Sharpie sharpie: sharpies.listOfSharpies) {
            System.out.println(sharpie.toString());
        }
        sharpies.listOfSharpies.get(0).use();
        sharpies.listOfSharpies.get(1).use();

        System.out.println(sharpies.countUsable());


        for (Sharpie sharpie: sharpies.listOfSharpies) {
            System.out.println(sharpie.toString());
        }

        sharpies.removeTrash();
        System.out.println(sharpies.countUsable());

        for (Sharpie sharpie: sharpies.listOfSharpies) {
            System.out.println(sharpie.toString());
        }
    }
}
/*
Reuse your Sharpie class
Create SharpieSet class
it contains a list of Sharpie, named listOfSharpies

it has a method that adds a new Sharpie to the set: add(sharpie)

it has a method that returns the number of
usable Sharpies: countUsable() -> sharpie
is usable if it contains ink

it has a method that removes all unusable Sharpies: removeTrash()
 */