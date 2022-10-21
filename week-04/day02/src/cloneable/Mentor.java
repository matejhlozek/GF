package cloneable;

public class Mentor extends Person{

    protected String level;

    protected Mentor(String name, int age, String gender, String level){
        super(name, age, gender);
        this.level = level;
    }

    protected Mentor(){
        this.name = "Jane Doe";
        this.age = 30;
        this.gender = "female";
        this.level = "intermediate";
    }

    protected void getGoal(){
        System.out.println("My goal is: Educate brilliant junior software developers.");
    }

    @Override
    public String introduce(){
        return super.introduce() + " " + this.level + " mentor.";
    }
}
