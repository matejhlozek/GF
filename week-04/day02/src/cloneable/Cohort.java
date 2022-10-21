package cloneable;

import java.util.ArrayList;

public class Cohort{

    protected String name;
    protected ArrayList<Student> students;
    protected ArrayList<Mentor> mentors;

    protected Cohort(String name){
        this.name = name;
        this.students = new ArrayList<>();
        this.mentors = new ArrayList<>();
    }

    protected void addStudent(Student student){
        students.add(student);
    }
    protected void addMentor(Mentor mentor){
        mentors.add(mentor);
    }
    protected void info(){
        System.out.println("The " + this.name + " cohort has " + students.size() + " students and " + mentors.size() + " mentors.");
    }
}
