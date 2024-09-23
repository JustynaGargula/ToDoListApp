import java.util.ArrayList;
import java.util.HashMap;
import java.util.UUID;

public class TaskList {
    private HashMap<UUID, Task> tasks = new HashMap<UUID, Task>();

    public void addTask(Task newTask){
        tasks.put(UUID.randomUUID(), newTask);
    }
    public void addMultipleTasks(Task[] newTasks){
        for(Task task: newTasks){
            addTask(task);
        }
    }

    public Task getTaskById(UUID id){
        return tasks.get(id);
    }
    public HashMap getTasks(){
        return tasks;
    }
}
