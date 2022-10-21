public class NewTaskController {   


    public list<task> GetNewTasks(){
        list<task> newtask = [Select Id, Task.Subject, Task.Priority , Task.ActivityDate , Task.Description from task where status='New'];

        return newtask;
    }
}