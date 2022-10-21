package Counter;

public class Counter {
    public int counter;

    public Counter (){
        this.counter = 0;
    }

    public void add(int number){
        counter += number;
    }

    public void add(){
        counter += 1;
    }

    public void get(){
        System.out.println(counter);
    }

    public void reset(){
        counter = 0;
    }
}