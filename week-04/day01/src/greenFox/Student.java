package greenFox;

public class Student extends Person {

    protected String previousOrganization;
    protected int skippedDays = 0;
    protected int numberOfDays;

    protected Student(String name, int age, String gender, String previousOrganization){
        super(name, age, gender);
        this.previousOrganization = previousOrganization;
    }

    protected Student(){
        this.name = "Jane Doe";
        this.age = 30;
        this.gender = "female";
        this.previousOrganization = "The School of Life";
        this.skippedDays = 0;
    }

    protected void getGoal(){
        System.out.println("My goal is: Be a junior software developer.");
    }

    @Override
    public String introduce(){
        return super.introduce() + " from " + this.previousOrganization + " who skipped " + this.skippedDays + " days from the course already.";
    }
    protected int skipDays(int numberOfDays){
        return skippedDays += numberOfDays;
    }
}
