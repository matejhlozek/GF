package Animal;


public class Main {

    public static void main(String[] args) {
    Animal cat = new Animal();
    Animal dog = new Animal();

    cat.play();
    dog.play();
    cat.eat();

    System.out.println(cat.hunger);
    System.out.println(cat.thirst);
    System.out.println(dog.hunger);
    System.out.println(dog.thirst);
    }
}
