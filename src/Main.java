import java.lang.reflect.Array;

public class Main {
    public static void main(String[] args) {

        TaskList myList = new TaskList();
        Task task1 = new Task("Do some coding", 2);
        Task task2 = new Task("Read a book", 3);
        Task task3 = new Task("Finish the project", 1);
        Task[] tasks = {task1, task2, task3};
        myList.addMultipleTasks(tasks);
        for(Object task: myList.getTasks().values()){
            System.out.println(((Task) task).getName());
        }
    }
}