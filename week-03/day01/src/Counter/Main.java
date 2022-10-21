package Counter;


public class Main {

    public static void main(String[] args) {
    Counter c = new Counter();
    c.get();
    c.add();
    c.add();
    c.get();
    c.add(5);
    c.get();
    c.reset();
    c.get();
    }
}
