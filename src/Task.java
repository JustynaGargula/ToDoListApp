public class Task {
    private String name;
    private boolean completed; //true or false
    private int priority;   // 1 - urgent, 2 - important, 3 - can wait

    public Task(String taskName, int taskPriority) {
        name = taskName;
        priority = taskPriority;
        completed = false;
    }

    public void changeStatus(){
        if(completed)
            completed = false;
        else
            completed = true;
    }
    public void changePriority(int newPriority){
        priority = newPriority;
    }

    public String getName() {
        return name;
    }

    public boolean isCompleted() {
        return completed;
    }

    public int getPriority() {
        return priority;
    }
}
