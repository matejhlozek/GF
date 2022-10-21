package TeachersAndStudents;

public class Students {

    public String student;

    public Students(){
        this.student = "student";
    }

    public void learn(){
        System.out.println("the student is actually learning");
    }

    public void question(Teachers teacher){
        teacher.giveAnswer();
    }
}
