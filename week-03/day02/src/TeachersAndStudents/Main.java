package TeachersAndStudents;

public class Main {
    public static void main(String[] args) {

        Students student = new Students();
        Teachers teacher = new Teachers();

        student.question(teacher);
        teacher.teach(student);
    }
}

/*
Create Student and Teacher classes

Student
learn() -> prints: the student is actually learning
question(teacher) -> calls the teacher's
                     giveAnswer() method

Teacher
teach(student) -> calls the student's learn() method
giveAnswer() -> prints: the teacher is
                answering a question

Instantiate a Student and Teacher object

Call the student's question() method
and the teacher's teach() method
 */