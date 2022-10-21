package theGardenApplication;


public class Tree extends Plants {

    public Tree(String color, int waterLevel) {
        super(waterLevel, color);
    }

    @Override
    public String toString() {
        if(waterLevel < 10) {
            return "The " + getColor() + " Tree needs water";
        } else return "The " + getColor() + " Tree doesn't need water";
    }
}
