package theGardenApplication;


public class Main {
    public static void main(String[] args) {

        Garden garden = new Garden();

        Flower yellow = new Flower("yellow", 0);
        garden.addPlants(yellow);
        Flower blue = new Flower("blue", 0);
        garden.addPlants(blue);
        Tree purple = new Tree("purple", 0);
        garden.addPlants(purple);
        Tree orange = new Tree("orange", 0);
        garden.addPlants(orange);

        garden.status();
        garden.wateringAll(70);
        garden.wateringAll(40);
    }
}
