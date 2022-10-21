package greenFox;

public class Sponsor extends Person{

    protected String company;
    protected int hiredStudents;

    protected Sponsor(String name, int age, String gender, String company){
        super(name, age, gender);
        this.company = company;
    }

    protected Sponsor(){
        this.name = "Jane Doe";
        this.age = 30;
        this.gender = "female";
        this.company = "Google";
        this.hiredStudents = 0;
    }

    public String introduce(){
        return super.introduce() + " who represents " + company + " and hired " + hiredStudents + " students so far.";
    }

    protected int hire(){
        return hiredStudents++;
    }

    protected void getGoal(){
        System.out.println("My goal is: Hire brilliant junior software developers.");
    }
}
