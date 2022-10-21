package cloneable;

public class Person implements Cloneable{
    protected String name;
    protected int age;
    protected String gender;

    protected Person(String name, int age, String gender){
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    protected void getGoal(){
        System.out.println("My goal is: Live for the moment!");
    }

    public String introduce(){
        return "Hi, I'm " + this.name + ", a " +  this.age + " year old " + this.gender;
    }

    protected Person(){
        name = "Jane Doe";
        age = 30;
        gender = "female";
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
