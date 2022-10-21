package PetrolStation;

public class Station {

    public String station;


    public Station(){
        this.station = "station";
    }

    public void refill(Car car){
        car.gasAmount = car.capacity;
    }
}
