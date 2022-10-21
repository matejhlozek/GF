package theGardenApplication;


public abstract class Plants {

    public double waterLevel;
    public String color;

    public Plants(double waterLevel, String color) {
        this.waterLevel = waterLevel;
        this.color = color;
    }

    public void setWaterLevel(double waterLevel) {
        this.waterLevel = waterLevel;
    }

    public String getColor() {
        return color;
    }
}