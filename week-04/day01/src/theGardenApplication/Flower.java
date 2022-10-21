package theGardenApplication;


public class Flower extends Plants {

    public Flower(String color, int waterLevel) {
        super(waterLevel, color);
    }

    @Override
    public String toString() {
        if(waterLevel < 5) {
            return "The " + getColor() + " Flower needs water";
        } else return "The " + getColor() + " Flower doesn't need water";
    }
}

