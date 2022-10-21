package Sharpie;

public class Sharpie {
    public String color;
    public int width;
    public int inkAmount;

    public Sharpie(){
        this.inkAmount = 100;
    }

    public void use(){
        inkAmount = inkAmount - 100;
    }

    public Sharpie (String color, int width){
        this();
        this.color = color;
        this.width = width;
    }

    @Override
    public String toString() {
        return "Sharpie{" +
                "color='" + color + '\'' +
                ", width=" + width +
                ", inkAmount=" + inkAmount +
                '}';
    }
}
