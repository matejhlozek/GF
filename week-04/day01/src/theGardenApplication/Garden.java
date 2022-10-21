package theGardenApplication;
import java.util.ArrayList;


public class Garden {

    ArrayList<Plants> plants = new ArrayList<>();

    public void addPlants(Plants plant){
        plants.add(plant);
    }

    public void status(){
        for (Plants plant:plants){
            System.out.println(plant);
        }
    }
    public void wateringAll(double water){
        System.out.println("\nWatering with " + water);
        for (Plants plant:plants){
            if (plant instanceof Flower) {
                plant.setWaterLevel(plant.waterLevel + (water / plants.size())/100*75);
            } else if (plant instanceof Tree)
                plant.setWaterLevel(plant.waterLevel + (water / plants.size()) /100*40);
        } status();
    }
}
