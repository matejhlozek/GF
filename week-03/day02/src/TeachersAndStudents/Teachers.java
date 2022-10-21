package TeachersAndStudents;

public class Teachers {

    public String teacher;

    public Teachers(){this.teacher = "teacher";}

    public void giveAnswer(){
        System.out.println("the teacher is answering a question");
    }

    public void teach(Students student){
        student.learn();
    }
}
