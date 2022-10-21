package Sharpie;


public class Main {

    public static void main(String[] args) {
        Sharpie sharpie1 = new Sharpie("Black", 10);
        Sharpie sharpie2 = new Sharpie("Blue", 8);
        Sharpie sharpie3 = new Sharpie("Green", 6);

        sharpie1.use();

        System.out.println(sharpie1.inkAmount);
        System.out.println(sharpie2.inkAmount);
    }
}
